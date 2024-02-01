class ConstructorTest{
int id;
String name;
int age;
String college = "SCT";

ConstructorTest(){ 
System.out.println("default constructor");
}
ConstructorTest(int id1, String name1){
System.out.println("Parameterized Constructor");
id=id1;
name=name1;
}
ConstructorTest(int id1,String name2,int age1){
id=id1;
name=name2;
age=age1;
}


public void display(){
System.out.println(name);
System.out.println(id);
System.out.println(age);
System.out.println(college);
}
public static void main(String args[]){
ConstructorTest ct = new ConstructorTest(5,"Mary");
ct.display();
ConstructorTest ct1= new ConstructorTest(5,"Mary",7);
ct1.display();
}
}
