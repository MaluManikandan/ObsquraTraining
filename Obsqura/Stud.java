import java.util.Scanner;
class Stud{
int id;
String name;
static String college = "CET";
public static void main (String args[]){
Stud st = new Stud();
st.getDetails();
st.getDisplay();
Stud st2 = new Stud();
st2.getDetails();
st2.getDisplay();
Stud.changeCollege();
Stud.changeCollege();

}
public void getDetails(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the id");
 id = sc.nextInt();
System.out.println("Enter the name");
 name = sc.next();
System.out.println(college);
}
public void getDisplay(){
System.out.println(id);
System.out.println(name);
System.out.println(college);
}
public static void changeCollege(){
college="SCT";
System.out.println(college);
}
}
