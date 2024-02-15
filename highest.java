import java.util.Scanner;
class highest
   {
     public static void main(String args[])
      {
        int number;
        int marks[]=new int[10];
        Scanner S1=new Scanner(System.in);
        int highest=0;
        System.out.println("Enter the marks of 10 students");
        for(int i=0;i<10;i++)
          {
           System.out.println("Enter the marks of student number