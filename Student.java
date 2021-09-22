class Student{
 String name;
 int age;
 int dob;
  void speak()
   {
     System.out.println(name+" speaks a lot");
   }
  void dance()
   {
     System.out.println(name+" likes to dance");
   }
public static void main(String[] args)
   {
     Student s=new Student();
     s.name="Nisarga";
     s.age=21;
     s.dob=14/10/1999;
     s.speak();
     s.dance();
   }
}

