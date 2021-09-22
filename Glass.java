class Glass{
String name;
int cost;
String color;
void holdsWater()
{
System.out.println(color+" "+name+" holds water in it");
}
public static void main(String[] args)
{
Glass glass=new Glass();
glass.name="Suba";
glass.cost=26;
glass.color="yellow";
glass.holdsWater();
}
}