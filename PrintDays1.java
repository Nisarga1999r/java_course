class PrintDays1{
public static void main(String[] args)
{

int number1 =8;
switch (number1){
case 1 : System.out.println("Sunday");
case 2 : System.out.println("Saturday");
case 3 : System.out.println("Friday");
case 4,5 : System.out.println("Thursday");
case 8 : System.out.println("Wednesday");
case 6 : System.out.println("Tuesday");
case 7 : System.out.println("Monday");
default : System.out.println("Please enter valid number");
}
}
}