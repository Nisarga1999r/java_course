class PrintDays11{
public static void main(String[] args)
{

int num=7;
switch (num){
case 1 : System.out.println("Sunday");
case 2 : System.out.println("Saturday");
case 3 : System.out.println("Friday");
case 4,5 : System.out.println("Thursday");
case 8 : System.out.println("Wednesday");
case 6 : System.out.println("Tuesday");
case 7 : System.out.println("Monday");
default : System.out.println("Please enter valid number");
}

	
	if(num ==1) {
	  System.out.println("monday");
	}
	else if(num ==2) {
	  System.out.println("sunday");
	}
	else if(num ==3) {
	  System.out.println("saturday");
	}
	else if(num ==4) {
	  System.out.println("friday");			
	}
        else if(num ==5) {
	  System.out.println("thursday");
       }
       else if(num ==6) {
	  System.out.println("wednesday");
       }
       else if(num ==7) {
	  System.out.println("tuesday");
       }
       else  {
	  System.out.println("please enter number between 1 to 7");
       }
      }
    }