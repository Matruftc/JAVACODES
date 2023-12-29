import java.util.ArrayList;
public class arraylist_04
{
public static void main(String args[])
    {
        //create arraylist
       ArrayList<String> lang = new ArrayList<>();
       lang.add("C");
       lang.add("Java");
      lang.add("Python");

       System.out.println(lang);
       
       //removing the index value,.....
       String op = lang.remove(1);
       System.out.println(lang);
       System.out.println("The removal part is: " +op);
    }
}
