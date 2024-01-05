public class StringBuilder1 {
    public static void main(String args[])
    {
        StringBuilder op = new StringBuilder("Hello");
        op.append("Priya");
        System.out.println("Append inthe string: "+op);

        op.reverse();
        System.out.println("Reverse ofString: "+op);
    }
    
}
