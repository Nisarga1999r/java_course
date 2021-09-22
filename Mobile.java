class Mobile{
 String name;
 int cost;
 String color;
 void call()
  {
    System.out.println(cost+"$ "+color+" color "+name+" phone will call when respective 10 digit number is dialed");
  }
 void capturePhoto()
  {
    System.out.println(cost+"$ "+color+" color "+name+" phone can capture any photo");
  }
  public static void main(String[] args)
  {
   Mobile phone=new Mobile();
   phone.name="lenovo"; 
   phone.cost=20000;
   phone.color="rose gold";
   phone.call();
   phone.capturePhoto();
  }
}