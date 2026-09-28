import java.util.Scanner;

public class IT26102020Lab10Q1{

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
   }
   }
   
   
   