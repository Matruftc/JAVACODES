import java.util.Scanner;
public class duplicacy_and_manipulate {
public static void main(String args[])
{
  int arr[]={12,34,23,12,2};

/*
  for(int i=0;i<arr.length;i++)
  {
   System.out.println(arr[i]);
  }
*/


  for(int i=0;i<arr.length;i++)
{
    for(int j=i+1;j<arr.length;j++)
    {
      if (arr[i]==arr[j])
      {
        arr[i]=100;
       System.out.println(arr[i]);
      }
    }
 }

 
 for(int i=0;i<arr.length;i++)
 {
    System.out.println(arr[i]);
 }
}}

