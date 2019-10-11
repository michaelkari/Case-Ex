import java.util.Scanner;
import java.text.*;

public class MichaelKarimizadehCaseExercises
{
  public static void main(String[] args)
  {
   //Exercise 1
   /* 
   int num;
   Scanner sc = new Scanner(System.in);
   System.out.println("Press a key from 0 to 9");
   num = sc.nextInt();
   switch (num)
   {
     case 0:
       System.out.println("You have pressed the 0 key");
       break;
     case 1:
       System.out.println("You have pressed the 1 key");
       break;
     case 2:
       System.out.println("You have pressed the 2 key");
       break;
     case 3:
       System.out.println("You have pressed the 3 key");
       break;
     case 4:
       System.out.println("You have pressed the 4 key");
       break;
     case 5:
       System.out.println("You have pressed the 5 key");
       break;
     case 6:
       System.out.println("You have pressed the 6 key");
       break;
     case 7:
       System.out.println("You have pressed the 7 key");
       break;
     case 8:
       System.out.println("You have pressed the 8 key");
       break;
     case 9:
       System.out.println("You have pressed the 9 key");
       break;
     default:
       System.out.println("The number is outside the range of 0-9");
   }
    */
    
   //Exercise 2
   /*
   String answer;
   Scanner sc = new Scanner(System.in);
   System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
   System.out.println("a. int 1x=10");
   System.out.println("b. int x=10");
   System.out.println("c. float x=10.0f");
   System.out.println("a. string x=\"10\"");
   System.out.print("Enter your choice: ");
   answer = sc.next();
   switch (answer.charAt(0))
   {
     case 'a':
       System.out.println("Incorrect");
       break;
     case 'b':
       System.out.println("Correct");
       break;
     case 'c':
       System.out.println("Incorrect");
       break;
     case 'd':
       System.out.println("Incorrect");
       break;
     default:
       System.out.println("That is an invalid answer");
   }
   */
    
   //Exercise 3
   /*
   int threeDigit;
   int hundreds;
   int tens;
   int ones;
   int min = 0;
   int max = 0;
   double average;
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a three digit number:   ");
   threeDigit = sc.nextInt();
   hundreds = threeDigit/100;
   tens = (threeDigit-hundreds*100)/10;
   ones = (threeDigit-hundreds*100-tens*10);
   if (hundreds>tens && hundreds>ones)
     max=hundreds;
   if (tens>ones && tens>hundreds)
     max=tens;
   if (ones>hundreds && ones>tens)
     max=ones;
   if (hundreds<tens && hundreds<ones)
     min=hundreds;
   if (tens<ones && tens<hundreds)
     min=tens;
   if (ones<hundreds && ones<tens)
     min=ones;
   average = (ones+tens+hundreds)/3.0;
   System.out.println("min = "+ min);
   System.out.println("max = "+ max);
   System.out.println("average = "+average);
   */
   }
}  