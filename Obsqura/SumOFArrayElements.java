import java.util.Scanner;
class SumOFArrayElements{
public static void main(String args[]){

int sum=0;

Scanner sc= new Scanner(System.in);
System.out.println("Enter the length of the array");
int len = sc.nextInt();
 int[] array = new int[len];
System.out.println("Enter the arraynumbers");
for(int i=0;i<len;i++){
System.out.print("Element " + (i + 1) + ": ");
 array[i] = sc.nextInt();
 
   
}
 System.out.println("Entered array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }


System.out.println("Calculating the sum");
for(int i=0;i<len;i++){
sum = sum + array[i];
}
System.out.println("The sum of ArrayElements is "+sum);
}
}

