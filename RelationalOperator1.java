class RelationalOperator1{
public static void main(String[] args){
int a = 101;
int b = 28;
int c = 118;

boolean result = a>=b;
System.out.println("a>=b:"+result);
boolean result1 = b<a;
System.out.println("b<a:"+result1);
boolean result2 = b<=a;
System.out.println("b<=a:"+result2);
boolean result3 = a>c;
System.out.println("a>c:"+result3);

System.out.println();

int d = 98;
int e = 89;
int f = 18;

boolean result10 = d<f;
System.out.println("d<f:"+result10);
boolean result11 = e>d;
System.out.println("e>d:"+result11);
boolean result12 = d>=e;
System.out.println("d>=e:"+result12);
boolean result13 = e!=f;
System.out.println("e!=f:"+result13);
boolean result14 = d==f;
System.out.println("d==f:"+result14);

System.out.println();

int y = -98;
int z = 89;
boolean result121 = z>y;
System.out.println("z>y:"+result121);
boolean result122 = z!=y;
System.out.println("z!=y:"+result122);
boolean result123 = y==z;
System.out.println("y=z:"+result123);

}		
}
