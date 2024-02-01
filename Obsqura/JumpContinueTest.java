class JumpContinueTest{
public static void main (String args[]){
for(int i=0;i<=10;i++)
{
if(i==6){
continue;
}
System.out.println(i);
}
System.out.println("Should not print 6");
}
}
