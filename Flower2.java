class Flower2
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

 Flower flower1 = new Flower();
 flower1.name="rose";
 flower1.color="red";
 flower1.noOfPetals=25;
 Flower flower2 = new Flower();
 flower.bloom();
 flower.shedFragnance();
 flower1.bloom();
 flower1.shedFragnance();
 flower2.shedFragnance();
 flower2.bloom();
 }
}