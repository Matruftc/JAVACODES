import java.util.ArrayList;
public class arraylist_iterate {
    public static void main(String args[])
    {
        //create arraylist
       ArrayList<Integer> num = new ArrayList<>();
       num.add(1);
       num.add(2);
       num.add(3);

       System.out.println(num);

       //using for each loop
       for(Integer val : num)
       {
        System.out.println("."+val+".");
        //System.out.println(" . ");
       }
    }
}
