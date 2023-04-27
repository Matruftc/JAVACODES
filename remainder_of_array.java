public class remainder_of_array {
public static void main(String args[])
  { 
     int []marks={23,3};
     int []mark={2,4};
     
     int []sum=new int[2];
 
    for(int i=0;i<2;i++)
   {
     sum[i]=marks[i]%mark[i];
     System.out.println(sum[i]);
}

}}

