public class prime_number {
 public static void main(String args[])
  {
   int a=50;
   boolean y=false;

   for(int i=2;i<= a/2;i++)
    {
      if(a%i == 0)
     {
       y=true;
       break;
   }
}


 if(!y)
 {
  System.out.println("prime hai");
 }
 else
{
 System.out.println("non-Prime hai");
}
}} 

