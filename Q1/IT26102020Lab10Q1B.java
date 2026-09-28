import java.util.Scanner;

public class IT26102020Lab10Q1B{

 public static void main(String[] args){
  
   //create a scanner class
   Scanner input = new Scanner(System.in);
   
   System.out.println();
   System.out.println("Enter the mark (0 - 100) : ");
   int mark = input.nextInt();
   
   //assertion to check of the mark is in the valid range
   assert ( mark >= 0 && mark <=100 ) : "Invalid mark " ;
   
   System.out.println();
   System.out.println("Mark is validated");
   System.out.println();
   
   char grade;
   
   if (mark >= 75 )
   {
	   grade = 'A';
   }
   else if ( mark >= 60)
   {
	    grade = 'B';
   }
   else if (mark >= 50)
   {
	   grade = 'C';
   }
   else if ( mark >= 40 )
   {
	    grade = 'D';
   }
   else 
   {
   grade = 'F';
   }
  
  //second assertion
  assert ( mark >= 75 && grade == 'A' ) ||
  (mark >= 60 && mark < 75 && grade == 'B')||
   (mark >= 50 && mark < 60 && grade == 'C')||
    (mark >= 40 && mark < 50 && grade == 'D')||
	 (mark >= 40 &&  grade == 'F') : "Incorrect Grade Assigned" ; 
	 
	 System.out.println();
	  System.out.println("Mark is validated");
	   System.out.println("The grade for the entered mark is : " +grade);
	 
  
   
 }
   
	   }
   
   