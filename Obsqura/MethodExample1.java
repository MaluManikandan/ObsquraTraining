class MethodExample1{
static int a =5;
static int b =10;
public static void main(String args[]){
MethodExample1.sum();
MethodExample1.sub(3,2);
 int result = MethodExample1.mul(4,5,6);
 System.out.println(result);
}
//method without parameters
static void sum(){
int s = a+b;
System.out.println("Sum ="+s);
}
//method with parameteres
static void sub(int a,int b){
int s = a-b;
System.out.println("Sub="+s);
}
// method with return valu
static int mul(int a, int b, int c){
int mult = a *b*c;
return mult;

}
}
