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
  int firstDay = firstDayOfYear(year)
}
