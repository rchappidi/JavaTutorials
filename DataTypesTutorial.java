class DataTypesTutorial{
	
	static int age ;
	
    static  char gender;
	
	public static void main(String[] args){
	  
	  age = Integer.parseInt(args[0]);
	  gender = args[1].charAt(0);
		
	  if(age>21){
		  if(age>45){
		   System.out.println("you are above 21 but more than 45 so you are not welcome");
		  }
		  else{
			  System.out.println("you are above 21 and less than 45,so welcome");
		  }
	  }else{
		  
		  if(age > 18 & gender == 'M'){
			  System.out.println("you are above 18 and a male, so welcome");
		  }
		  else{
			  System.out.println("you are not allowed");
		  }
		  
	  }
	  
	}
}




