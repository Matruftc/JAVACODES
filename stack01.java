import java.util.Stack;

public class stack01 {
    public static void main(String args[])
    {
        Stack<String> animals = new Stack<>();

        //using push() method

         animals.push("Cat");
         animals.push("Dog");
         animals.push("cow");
         animals.push("buffalo");

         System.out.println("Here we used the stack and push method: "+ animals);

    }
}
