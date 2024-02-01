class Student{
int id ;
String name;//INSTANCE VARIABLE
 static String college = "CET";//STATIC VARIABLE


public static void main (String args[]){
Student s1 = new Student();
s1.id = 1;//LOCAL VARIABLE
s1.name = "Malu";
System.out.println("id="+s1.id+" "+"name="+s1.name+" "+"collegename="+college);
Student s2 = new Student();
s2.id = 2;
s2.name = "Vineeth";
System.out.println("id="+s2.id+" "+"name="+s2.name+" "+"collegename="+college);
college="sct";
System.out.println(college);

}
}
