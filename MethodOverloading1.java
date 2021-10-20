
public class MethodOverloading1 {
	public void msg(int a,int b)
	{
		
		System.out.println("HELLO JAVA");
	}
	
	 public void msg(double x, double y)
	{
		System.out.println("WELCOME YOU IN JAVA PROGRAMMING");
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 mod=new MethodOverloading1();
	      
	    mod.msg(10,20);
	    mod.msg(2.5,3);
	}

}
