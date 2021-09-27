class TernaryOperator6{
public static void main(String[] args){
int a = 50;
int b = 100;
int c = 150;
int d;
int e;

System.out.println(a);
System.out.println(b);
System.out.println(c);
d = a>b?a:b;
e = d>c?d:c;

System.out.println("The largest number is: "+e);

d = a<b?a:b;
e = d<c?d:c;
System.out.println("The smallest number is: "+e);
}
}
