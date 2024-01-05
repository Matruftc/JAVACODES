public class EnsureCapacity {
    public static void main (String args[])
    {
        StringBuilder op = new StringBuilder();
        op.append("Hello");

        System.out.println(op);
        op.ensureCapacity(40);
        System.out.println(op.capacity());

    }
}
