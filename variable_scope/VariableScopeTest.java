class VariableScopeTest{
 
  public static void main(String args[]){
      int number = 10;
	  
	  System.out.println("number is "+number);
	  
	  if(number > 5){
		  
		int number2 = 15;
		
		System.out.println("number2 is "+number2);  
		 
		System.out.println("this number is greater than 5 : "+number);
		number++;
	  }
  
     System.out.println("number2 is not accessible here "+number2);  
 
  }
}