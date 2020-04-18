class WhileLoopTutorial {

	public static void main(String args[]){
       int number1 = 1;
	   
	      
		  while(number1 < 6){
			  
			  int temp = 1;
			  
			  while(temp <= number1){
			  
			   System.out.print("*");

			   ++temp;
			  
			  }
			  
			  System.out.println();
			 
			  ++number1;
		  }
		
	  
	}
}