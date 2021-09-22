class Ponds{
String name;
String color;
int cost;
void smoothning()
{
System.out.println(color+" "+name+" smooths your skin");
}
public static void main(String[] args){
Ponds p1=new Ponds();
p1.name="Ponds";
p1.color="White";
p1.cost=5;
p1.smoothning();
System.out.println(p1.name);
System.out.println(p1.color);
System.out.println(p1.cost);


}
}
