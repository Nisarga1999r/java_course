class Student21{
String name;
int age;
String usn;
String gender;
void eat()
{
 System.out.println(name+" is eating");
}
void sleep()
{
 System.out.println("student is sleeping");
}
void study()
{
 System.out.println("student is studying");
}
public static void main(String[] args){
Student21 s1=new Student21();
s1.name="Nisha";
s1.age=21;
s1.usn="4su17is022";
s1.gender="female";
s1.eat();
s1.sleep();
s1.study();
System.out.println(s1.name);
System.out.println(s1.age);
System.out.println(s1.usn);
System.out.println(s1.gender);

}
}