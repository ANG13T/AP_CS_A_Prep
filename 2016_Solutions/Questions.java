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

