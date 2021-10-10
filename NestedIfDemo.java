class NestedIfDemo{
public static void main(String[] args){
boolean isAptitudeClear=true;
boolean isTechnicalClear=true;
boolean isHrClear=false;
if(isAptitudeClear)
 {
  if(isTechnicalClear)
   {
    if(isHrClear)
            {
            System.out.println("congrats");
            }
            else
     {
      System.out.println("sorry you did not clear hr round");
     }}
      else
     {
      System.out.println("sorry you did not clear technical round");
     }}
      else 
     {
     System.out.println("sorry you did not clear aptitude round");
     }
  }
}