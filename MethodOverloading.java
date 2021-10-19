public class MethodOverloading {
	void sum(int a, int b) {
		System.out.println("a+b:"+(a+b));
	}
	void sum(int q, int d,int e)
	{
		System.out.println("q+d+e"+(q+d+e));
	}
	void sum(float p,float n) {
		System.out.println("p+n:"+(p+n));
	}
public static void main(String[] args) {
	MethodOverloading mod=new MethodOverloading();
	mod.sum(1.1f, 2.2f);
	mod.sum(1,2);
	mod.sum(1,2,3);
	}
}
