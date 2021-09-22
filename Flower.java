class Flower
{
 String color;
 String name;
 int noOfPetals;
  void bloom()
   {
     System.out.println(color+" "+name+" is blooming...");
   }
  void shedFragnance()
   {
     System.out.println(color+" "+name+" is sheding fragnance...");
   }
public static void main(String[] args){
 Flower flower = new Flower();
 flower.name="hibiscus";
 flower.color="red";
 flower.noOfPetals=5;
 flower.bloom();
 flower.shedFragnance();
 }
}


