class TwoDigitEg3
{
    static void specialNumber(int n)
    {
       if(n < 10 || n > 99)
            System.out.println("Invalid Input! " +
                           "more than two digits, " +
                                 "2 digits only");
        else
        {
            int first = n / 10;
            int last = n % 10;
            int sum = first + last;
            int pro = first * last;
             
            if((sum + pro) == n)
            {
              System.out.println(n + " is Two-Digit Number");
            }
            else
            {
              System.out.println(n +" is Not Two-Digit Number");
            }
        }
    }
     public static void main(String args[])
    {
        int n = 691;
        specialNumber(n);
    }
}