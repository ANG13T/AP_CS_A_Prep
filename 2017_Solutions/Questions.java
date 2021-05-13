// Question 1: A
public Digit(int num){
  digitList = new ArrayList<Integer>();
  if(num == 0){
    digitList.add(new Integer(0));
  }

  while(num > 0){
    digit.add(0, new Integer(num % 10));
    num /= 10;
  }
}

// Question 1: B
public boolean isStrictlyIncreasing(){
  for(int i = 0; i < digitList.size() - 1; i++){
   if(digitList.get(i).intValue() >= digitList.get(i + 1).intValue()) {
     return false;
   }
  }
  return true;
}

// Question 2
public class MultPractice implements StudyPractice{
  int start;
  int addValue;

  public String getProblem(){
    String returnValue = start + " TIMES " + addValue;
    return returnValue;
  }

  public MultPractice(int startValue, int endValue){
    start = startValue;
    addValue = endValue;
  }

  public void nextProblem(){
    addValue++;
  }
}

// Question 3: A
public void replaceNthOccurence(String str, int n, String repl){
  int location = findNthOccurence(str, n);

  if(location != -1){
    currentPhrase = currentPhrase.substring(0, location) + repl + currentPhrase.substring(location + str.length());
  }
}

// Question 3: B
public int findLastOccurence(String str){
  int num = 1;
  while(findNthOccurence(str, num + 1) != -1){
    num++;
  }
  return findNthOccurence(str, num);
}

