class MultiArrayTest{
public static void main(String args[]){
int a[][];
a = new int [2][2];
a[0][0] = 1;
a[0][1] = 2;
a[1][0] = 3;
a[1][1] = 4;
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
System.out.print(a[i][j] + " ");

}
System.out.println();
}
int b[][]={{10,20,30},{1,2,3},{5,6,7}};
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(b[i][j] + " ");

}
System.out.println();
}

}
}
