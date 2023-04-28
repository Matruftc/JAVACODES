import java.util.Scanner;
public class CHANGE_THE_MIDDLE_ELEMENT_OF_ARRAY {
public static void main(String args[])
  {
  int arr[]={12,34,23,12,2};


  for(int i=0;i<arr.length;i++)
  {
    for(int j=4;j<arr.length;j++)
    {
      if (arr[i]==arr[2])
      {
         arr[i]= 500;
       System.out.println(arr[i]);
       
   
      }
   }
 }
System.out.println("...............................................");

 for(int i=0;i<arr.length;i++)
  {
   System.out.println(arr[i]);
  }

}}

