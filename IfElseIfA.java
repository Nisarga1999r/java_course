class IfElseIfA {
      public static void main(String args[]){
	int num=123;
	if(num <9 && num>=0) {
	  System.out.println("Its a one digit number");
	}
	else if(num <99 && num>=10) {
	  System.out.println("Its a two digit number");
	}
	else if(num <999 && num>=100) {
	  System.out.println("Its a three digit number");
	}
	else if(num <9999 && num>=1000) {
	  System.out.println("Its a four digit number");			
	}else if(num <99999 && num>=10000) {
	  System.out.println("Its a five digit number");
	}else {
	  System.out.println("number is more than five");			
	}
      }
    }