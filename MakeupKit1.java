class MakeupKit1
{
static String name = "lipstick";
static String brand = "lakme";
static int lip_price = 210;
static float kajal_price = 130;
public static void main(String args[]){
System.out.println(name);
System.out.println(brand);
  

    
       if(lip_price <200){
            System.out.println("purchase lipstick of rs"+lip_price);
        }if(kajal_price<100){
System.out.println("purchase lipstick of rs"+kajal_price);
}else{
      System.out.println("kajal was out of range"); 
        }
    }
     
  }  