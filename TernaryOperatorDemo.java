class TernaryOperatorDemo{
public static void main(String[] args){
int x = 100;
int y = 200;
int z = 250;
int result = x>y ? x:y;
int result1 = y>z ? y:z;
int result2 = x>z ? x:z;
System.out.println("largest of " +x+" & "+y+ "is: "+result);
System.out.println("largest of " +y+" & "+z+ "is: "+result1);
System.out.println("largest of " +x+" & "+z+ "is: "+result2);
}
}
