class ThisKeywordTest{
int id;
String name;
int age;
String college = "SCT";

ThisKeywordTest(){ 
System.out.println("default constructor");
}
ThisKeywordTest(int id, String name){
System.out.println("Parameterized Constructor");
this.id=id;
this.name=name;
}
ThisKeywordTest(int id,String name,int age){
this.id=id;
this.name=name;
this.age=age;
}


public void display(){
System.out.println(name);
System.out.println(id);
System.out.println(age);
System.out.println(college);
}
public static void main(String args[]){
ThisKeywordTest ct = new ThisKeywordTest(5,"Mary");
ct.display();
ThisKeywordTest ct1= new ThisKeywordTest(5,"Mary",7);
ct1.display();
}
}
