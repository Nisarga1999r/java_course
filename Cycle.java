class Cycle{
String name;
String color;
String type;
int noOfTyres;
 void brake()
  {
    System.out.println(color+" "+name+" brand "+ type+" cycle stops when brake is applied");
 }
  void bell()
  {
    System.out.println(color+" "+name+" brand "+type+" cycle generates sound when bell is rang");
 }
public static void main(String[] args){
  Cycle c1=new Cycle();
  c1.name="Hercules";
  c1.color="Black";
  c1.type="gear";
  c1.noOfTyres=2;
  c1.brake();
  c1.bell();
 }
}



  

