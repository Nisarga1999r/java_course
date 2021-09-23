class Mouse{
int cost;
String color;

 void select()
  {
    System.out.println(cost+" rupees"+color+" mouse selects the option when left click is done");
 }
  void scroll()
  {
    System.out.println(cost+" rupees"+color+" mouse scrolls when roller in it is rolled");
 }
public static void main(String[] args){
  Mouse mouse=new Mouse();
  
  mouse.color="black";
  mouse.cost=1200;
  
  mouse.select();
  mouse.scroll();
 }
}



  

