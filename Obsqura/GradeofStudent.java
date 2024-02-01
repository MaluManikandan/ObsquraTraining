//Write a program to find the grade of 2 students based on total marks(3 subjects) 
//Get the student‟s marks by constructor
//Return total mark to in main method
//Find the grade of each student
import java.util.Scanner;
class GradeofStudent{
int mark1,int mark2, int mark3;


GradeofStudent(int mark4, int mark5, int mark6){

mark1=mark4;
mark2=mark5;
mark3=mark6;
System.out.println("Marks are"+mark1+mark2+mark3);
}

public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Marks of first student");
System.out.println("Enter the marks of 1st subject");
mark4=sc.nextInt();
System.out.println("Enter the marks of 2nd subject");
mark5=sc.nextInt();
System.out.println("Enter the marks of 3rd subject");
mark6=sc.nextInt();
GradeofStudent go=new GradeofStudent(mark4,mark5,mark6);
System.out.println("Enter the Marks of second Student");
GradeofStudent go1=new GradeofStudent(mark4,mark5,mark6);
}
}
