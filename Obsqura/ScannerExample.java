import java.util.Scanner;
class ScannerExample{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter your name");
String name = sc.next();
System.out.println("Enter the first number");
int a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();
int sum = a+b;
System.out.println("Sum of two numbers="+sum);
System.out.println("My name is"+name);
}
}
/*int -nextInt
float-nextFloat
double-nextDouble
string-next
Line- nextLine*/
