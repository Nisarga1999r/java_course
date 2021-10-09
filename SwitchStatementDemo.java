class SwitchStatementDemo{
public static void main(String[] args){
 char symbol='@';
switch(symbol){
case '+':System.out.println("addition");break;
case '-':System.out.println("subtraction");break;
case '*':System.out.println("multiplication");break;
case '/':System.out.println("division");break;
case '%':System.out.println("modulus");break;
default:System.out.println("invalid symbol");
}}}