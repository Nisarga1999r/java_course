class PrintDays12{
public static void main(String[] args)
{

int num=7;
switch (num){
case 1 : System.out.println("Sunday");break;
case 2 : System.out.println("Saturday");break;
case 3 : System.out.println("Friday");break;
case 4,5 : System.out.println("Thursday");break;
case 8 : System.out.println("Wednesday");break;
case 6 : System.out.println("Tuesday");break;
case 7 : System.out.println("Monday");break;
default : System.out.println("Please enter valid number");break;
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