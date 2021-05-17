// Question 1: A
public class RandomStringChooser{
  private List<String> strings;

  public RandomStringChooser(String[] stringArray){
    strings = new ArrayList<String>();
    for(String word: stringArray){
      strings.add(word);
    }
  }

  public String getNext(){
    if(strings.size() > 0){
      int randomInt = (int)(Math.random() * strings.size());
      String element = strings.get(randomInt);
      strings.remove(randomInt);
      return element;
    }
    
    return "None";
  }
}

// Question 1: B
public RandomLetterChooser(String str){
  super(getSingleLetters(str));
}

// Question 2: A
public LogMessage(String message){
  int colonIndex = message.indexOf(":");
  machineId = message.substring(0,colonIndex);
  description = message.substring(colonIndex + 1);
}

// Question 2: B
public boolean containsWord(String keyword){
  if(description.equals(keyword)){
    return true;
  }else if(description.indexOf(keyword + " ") == 0){
    return true;
  }else if(description.indexOf(" " + keyword + " ") != -1){
    return true;
  }else if(description.length() > keyword.length()){
    if(description.substring(keyword.length() - keyword.length() - 1).equals(" " + keyword)){
      return true;
    }
  }
  return false;
}

// Question 3: A
private boolean toBeLabled(int r, int c, boolean[][] blackSquares){
  return ((!blackSquares[r][c]) && (r == 0 || c == 0 || blackSquares[r - 1][c] || blackSquares[r][c - 1]));
}


// Question 3:B
public Crossword(boolean[][] blackSquares){
  int count = 1;
  puzzle = new Square[blackSquares.length][blackSquares[0].length];

  for(int i = 0; i < blackSquares.length; i++){
    for(int j = 0; j < blackSquares[0].length; j++){
      // conditions for black squares
      if(blackSquares[i][j]){
        puzzle[i][j] = new Square(true, 0);
      }else{
        if(toBeLabled(i, j, blackSquares)){
          puzzle[i][j] = new Square(false, 0);
        }else{
          puzzle[i][j] = new Square(true, 0);
        }
      }
    }
  }
}