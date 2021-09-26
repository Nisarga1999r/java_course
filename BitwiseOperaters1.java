class BitwiseOperaters1{
public static void main(String[] args){
int x = 9, y = 8;
System.out.println("x & y = " + (x & y));

System.out.println();

 int a = 5;
 int b = 7;
 System.out.println("a&b = " + (a & b));
 System.out.println("a|b = " + (a | b));
 System.out.println("a^b = " + (a ^ b));
 System.out.println("~a = " + ~a);
 a &= b;
 System.out.println("a= " + a);

System.out.println();

 int m = 5;
 int n = -10;
System.out.println("m<<2 = " + (a << 2));
System.out.println("n>>2 = " + (n >> 2));
System.out.println("n>>>2 = " + (n >>> 2));

}
}
