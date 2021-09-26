class UnaryNegation      
{  
public static void main(String[] args)   
{    
boolean negate = !(2 < 3);
boolean value = !false;

System.out.println("result: " + negate);
System.out.println("value : " + value);

System.out.println();

boolean success = true;
System.out.println(success); 
System.out.println(!success);
System.out.println(!success);

System.out.println();

boolean x = true; 
boolean z = !x;
System.out.println("z = " + z);    
}
}