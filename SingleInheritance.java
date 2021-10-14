class SingleInheritance{
public static void main(String[] args){
Fruit fruit=new Fruit();
Apple apple =new Apple();

fruit.name="Pineapple";
fruit.color="yellow";
fruit.taste="sweet";

apple.name="Apple";
apple.color="red";
apple.taste="sweet";

System.out.println("fruit.name:"+fruit.name);
System.out.println("apple.name:"+apple.name);
}
}