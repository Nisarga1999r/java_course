class LogicalOperators1{
public static void main(String[] args){
int a=10;
int b=5;
int c=20;
System.out.println(a<b && a<c);
System.out.println(a<b && a<c);
System.out.println(a<b || a<c);
System.out.println(a<b || a<c);

System.out.println();

boolean m = true;
boolean n = false;
System.out.println("m && n = " + (m&&n));
System.out.println("m || n = " + (m||n));
System.out.println("!(m && n) = " + !(m && n));

System.out.println();

int x=-45;
int y=-50;
System.out.println(x>=y && x<y);
System.out.println(y>x && y>x);
System.out.println(x==y || x!=y);
}		
}
