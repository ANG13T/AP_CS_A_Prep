// Question 1: A
 public boolean simulate(){
   int hops = 0;
   int position = 0;
   while(hops < this.maxHops){
      position += hopDistance();
      hops++;

      if(position >= goalDistance){
        return true;
      }

      if(position < 0){
        return false;
      }  
   }
   return false;
 }

 // Question 1: B
 public double runSimulations(int num){
   int successes = 0;
   for(int i = 0; i < num; i++){
     if(simulate()) successes++;
   }
   return (double)successes / num;
 }

 // Question 2: A
 public WordPairList(String[] words){
   // initialze arraylist
   allPairs = new ArrayList<WordPair>();
  // goes through all words except last word because last element can never be in a pair
   for(int i = 0; i < words.length - 1; i++){
     // loops through all other words after the current word
     for(int j = i + 1; j < words.length; j++){
       // adds to all pairs
       allPairs.add(new WordPair(words[i], words[j]));
     }
   }
 }

  // Question 2: B
  public int numMatches(){
    int result = 0;
    for(WordPair word: allPairs){
      if(word.getFirst().equals(word.getSecond())){
        result++;
      }
    }
    return result;
  }

  // Question 3
  public class CodeWordChecker implements StringChecker{
    private String pass;
    private int startNum;
    private int endNum;

    public CodeWordChecker(int start, int end, String password){
      pass = password;
      startNum = startl;
      endNum = end;
    }

    public CodeWordChecker(String password){
      pass = password;
      startNum = 6;
      endNum = 20;
    }

    public boolean isValid(String str){
      if(str.includes(pass) == -1){
        return false;
      }

      if(str.length() < startNum || str.length() > endNum){
        return false;
      }

      return true;
    }

  }

// Question 4: A
public static int[] getColumn(int[][] arr2D, int c){
  int[] result = new int[arr2D.length];
  for(int i = 0; i < arr2D.length; i++){
    result[i] = arr2D[i][c];
  }
  return result;
}

// Question 4: B
public static boolean isLatin(int[][] square){
  //checks if first row contains duplicates (first condition)
  if(containsDuplicates(square[0])){
      return false;
  }

  // checks all rows (other than first unecessary)
  for(int r = 1; r < square.length; r++){
    // checks if it does not contain all values in first row for each other row (second condition)
    if(!hasAllValues(square[0], square[r])){
      return false;
    }
  }

  // checks all columns of sqaure
  for(int c = 0; c < square[0].length; c++){
    // checks if all values in column contain values in first row (third condition)
    if(!hasAllValues(square[0], getColumn(square, c))){
      return false;
    }
  }

  return true;
}