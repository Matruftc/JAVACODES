class aa
{
    void show()
    {
        System.out.println("hello dear i am a method of class a");
    }
}

class b extends aa{
void disp()
{
    show();
    System.out.println("hello dear i am a method of class b");
}
}  

public class inherits{
    public static void main(String args[])
{
    b obj = new b();
    obj.disp();
}    
}
