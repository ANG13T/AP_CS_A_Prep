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
 