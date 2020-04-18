/*do while loop is similar to while loop, the only difference is that do-while executes minimum at once(atleast once) , and then executes based on the condition 

the syntax of do-while loop is as below

do{



}while(condition)
*/

class DoWhileLoopTest{
   
   
 public static void main(String args[]){

    int number = 7;	
	do{
	  System.out.println("the number is "+number);
	  number--;
	}while(number>5);
 
 System.out.println("THE END");
 
 }
 
}