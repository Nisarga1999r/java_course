class DecrementOperaterDemo{
public static void main(String[] args){
System.out.println("Pre decrement operation");
int m = 10;
int n = --m;
System.out.println("m: "+m);
System.out.println("n: "+n);

System.out.println("Post decrement operation");
int i = 50;
int j = i--;
System.out.println("i: "+i);
System.out.println("j: "+j);
}
}