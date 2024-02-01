class ArrayTest{
public static void main (String args[]){
//int a[];//declaration of array method 1
int[] a; //declaration of array method 2
a = new int[5];//instantiating of an array
a[0]=10;
a[1]=2;
a[2]=30;
a[3]=71;
a[4]=80;
for(int i=0;i<=4;i++)
{
System.out.println(a[i]);
}
int b[] = {1,2,3,4};
for(int i=0;i<=3;i++)
{
System.out.println(b[i]);
}
int c[] = {21,22,23,24};
for(int i:c){
System.out.println(i);
}
}
}
