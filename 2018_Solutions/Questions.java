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
