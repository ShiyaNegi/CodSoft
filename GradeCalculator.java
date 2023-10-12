import java.io.PrintStream;
import  java.util.Scanner;
public class GradeCalculator {
    public void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of subjects");
        int numsub=sc.nextInt();
        int totalmarks=0;
        int maxmarks=100;
        for(int i=1;i<=numsub;i++){
            System.out.println("enter marks obtained in each subject "+i+"( out of 100)");
            int marks=sc.nextInt();
            totalmarks+=marks;
        }
        float percentage=(float)(totalmarks)/(numsub*maxmarks)*100;
        String Grade=sc.next();
        if(percentage>=90){
            Grade="A+";
        }
        else if (percentage>=80){
            Grade="A";
        }
        else if (percentage>=70){
            Grade="B";
        }
        else if (percentage>=60){
            Grade="C";
        }
        else if (percentage>=50){
            Grade="D";
        }
        else{
            Grade="F";
        }
        System.out.println("totalmarks "+totalmarks);
        System.out.println("percentage is "+percentage+"%");
        System.out.println("Grade is "+Grade);
    }

    public static void main(String[] args) {
        GradeCalculator q2=new GradeCalculator();
        q2.display();
    }
}
