class Dress{
 String color;
 int cost;
 void warm(){
 System.out.println(color+" "+cost+" rupee dress keeps you warm");
}
public static void main(String[] args){
Dress Top=new Dress();
Top.color="Green";
Top.cost=400;
Top.warm();
}
}
