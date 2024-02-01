//Write a program to find the grade of 2 students based on total marks(3 subjects) 
//Get the student‟s marks by constructor
//Return total mark to in main method
//Find the grade of each student
import java.util.Scanner;
class GradeOfStudent{
int mark1,int mark2, int mark3;


GradeOfStudent(int mark4, int mark5, int mark6){
mark1=mark4;
mark2=mark5;
mark3=mark6;
System.out.println("Marks are"+mark1+mark2+mark3);
}

public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the marks of 1st subject");
mark4=sc.nextInt();
System.out.println("Enter the marks of 1st subject");
mark5=sc.nextInt();
System.out.println("Enter the marks of 1st subject");
mark6=sc.nextInt();
GradeOfStudent go=new GradeOfStudent(mark1,mark2,mark3);
}
}
