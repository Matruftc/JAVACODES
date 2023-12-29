import java.util.ArrayList;
public class arraylist_02
{
public static void main(String args[])
    {
        //create arraylist
       ArrayList<String> lang = new ArrayList<>();
       lang.add("C");
       lang.add("Java");
      lang.add("Python");

       System.out.println(lang);
       
       //checking the index value,.....
       String op = lang.get(1);
       System.out.println(op);
    }
}
