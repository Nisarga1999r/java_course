class Brush
 {
  
       String name;
       int cost;
       void clean()
        {
          System.out.println(name+" brush cleans your teeth");
        }
 public static void main(String[] args)
     {
 Brush b= new Brush();
 b.name="oral-B";
 b.cost=20;
 b.clean();
System.out.println( b.name);
System.out.println(b.cost);
}
}