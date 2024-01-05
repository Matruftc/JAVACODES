public class BuilderCapacity {
    public static void main(String args[])
    {
        StringBuilder op = new StringBuilder();
        System.out.println(op.capacity());

        op.append("Hello");
        System.out.println(op);
        System.out.println(op.capacity());
    }
        
}
    

