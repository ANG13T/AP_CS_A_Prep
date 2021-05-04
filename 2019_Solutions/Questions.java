// Question 1: A

public static int numberOfLeapYears(int year1, int year2){
  int result = 0;
  for(int i = year1; i <= year2; i++){
    if(isLeapYear(i)){
      result++;
    }
  }
  return result;
} 

// Question 1: B
public static int dayOfWeek(int month, int day, int year) {
  int firstDay = firstDayOfYear(year); //get a day
  int inital = dayOfYear(month, day, year);
  int total = firstDay + inital - 1;
  return total % 7;
}

// Question 2
public class StepTracker{
  int activeDays;
  int activeAmount;
  int stepAmount;
  int total;

  public StepTracker(int amount){
    total = 0;
    activeDays = 0;
    stepAmount = 0;
    this.activeAmount = amount;
  }

  public void addDailySteps(int steps){
    if(steps >= activeAmount){
      activeDays++;
    }
    stepAmount += steps;
    total++;
  }

  public int activeDays(){
    return this.activeDays;
  }
  public double averageSteps(){
    if(totalDays == 0) return 0.0;
    return (double) stepAmount / total;
  }
}


// Question 3: A
public ArrayList<String> getDelimitersList(String[] tokens) {
  ArrayList<String> result = new ArrayList<String>();
  for(String t: tokens){
    if(t.equals(openDel) || t.equals(closeDel)){
      result.add(t);
    }
  }
  return result;
}

// Question 3: B
public boolean isBalanced(ArrayList<String> delimiters) {
  int delimCount = 0;
  // iterate through delimiters
  for(String item: delimiters){
    if(item.equals(openDel)){
      delimCount++;
    }else{
      delimCount--;
      // checks for excess closeDels
      if(delimCount < 0){
        return false;
      }
    }
  }
  // returns if balanced
  return delimCount == 0;
}

// Question 4: A
public LightBoard(int numRows, int numCols){
  for(int i = 0; i < numRows; i++){
    for(int j = 0; j < numRows; j++){
      lights[i][j] = Math.random() < 0.4;
    }
  }
}

// Question 5: A
public boolean evaluateLight(int row, int col) {
  int lightCount = 0;
  for(int i = 0; i < lights.length; i++){
      if(lights[i][col]){
        lightCount++;
      }
  }

  if(lights[row][col] && lightCount % 2 == 0){
    return false;
  }

  if(!lights[row][col] && lightCount % 3 == 0){
    return true;
  }
  
  return lights[row][col];
}