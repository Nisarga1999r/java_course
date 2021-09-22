class Refrigerator{
String name;
String color;
int noOfDoors;
 void fresh()
  {
    System.out.println(color+" "+name+" refrigerator keeps the food fresh");
 }
  void prepareIce()
  {
    System.out.println(color+" "+name+" refrigerator prepares ice from water");
 }
public static void main(String[] args){
  Refrigerator r1=new Refrigerator();
  r1.name="Godrej";
  r1.color="Purple";
  r1.noOfDoors=2;
  r1.fresh();
  r1.prepareIce();
 }
}



  

