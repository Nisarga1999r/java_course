class NestedIf1{
public static void main(String[] args){
boolean ifTwoRuns=true;
boolean ifHitsFour=false;
boolean ifHitsSix=false;
if(ifTwoRuns)
      {
        if(ifHitsFour)
             { 
                if(ifHitsSix)
                 {
                 System.out.println("u won the match");
                  }
                else
                  { 
                  System.out.println("u missed six");
                  }}
             
          else
             {System.out.println("even the match is not draw");
              } }
          
      else
          {System.out.println("u lost the match");
              }
    
}}