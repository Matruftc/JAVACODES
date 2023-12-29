import java.util.ArrayList;
public class arraylist_03 
{
public static void main(String args[])
    {
        //create arraylist
       ArrayList<String> lang = new ArrayList<>();
       lang.add("C");
       lang.add("Java");
      lang.add("Python");

       System.out.println(lang);

       String op = lang.get(1);
       System.out.println(op);

       //set value it means vhange the value
       lang.set(1,"KOTLIN");
       System.out.println("Edited part :"+ lang);
    }
}


