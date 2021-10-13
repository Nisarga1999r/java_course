class ReturnDemo1{
static int squareRoot(int number){
int squar=number*number;


return squar;
}
static void findCube(int number){
int cube=number*number*number;
System.out.println("cube :"+cube);}
public static void main(String[] args){
int square=squareRoot(20);
System.out.println("square :"+square);
findCube(5);
}
}