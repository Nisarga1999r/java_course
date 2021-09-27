class TernaryOperator4{
public static void main(String[] args){
int x = 22;
int y = 28;
int z = 30;
int a;
int b;
System.out.println(x);
System.out.println(y);
System.out.println(z);
a=x>y?x:y;
b=a>z?a:z;
System.out.println("The largest number is :"+b);
a=x<y?x:y;
b=a<z?a:z;
System.out.println("The smallest number is :"+b);
}
}

