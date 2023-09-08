package TASK;
import java.util.Scanner;


class student
{
    int student_detail()
    {
        Scanner sc = new Scanner(System.in);
        String name ;
        int math=0;
        int science=0;
        int english=0;
        System.out.print("enter the student name:   " );
        name=sc.nextLine();
        System.out.print("Math  ");
        math=sc.nextInt();
        System.out.print("science  ");
        science=sc.nextInt();
        System.out.print("english  ");
        english=sc.nextInt();
        int sum = math+science+english;
        return sum;
      //  System.out.println("total sum is: "+sum);
    }
}
public class student_grade_calculation
{
    public static void main(String[] args)
    {
        //int sum=0;
       student obj = new student();
       int stroe =obj.student_detail();
       System.out.println("total sum is: "+stroe);
       int avg;
       avg=stroe/3;
       System.out.println("average: "+avg);
       if(avg>=85)
       {
           System.out.println("A");
       }
       else if (avg>=75) {
           System.out.println("B");
       }
       else if (avg>=65) {
           System.out.println("C");
       }
       else if(avg>=45)
           System.out.println("D");
       else if (avg>=35)
       {
           System.out.println("E");
       }
       else
       {
           System.out.println("Your Fail!!!");
       }



    }



}
