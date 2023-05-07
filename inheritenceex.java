class a{

    int value_of_a=10;
    void show(){
        System.out.println("value of parent class variable is:  "+value_of_a);
    }
}


class b extends a{
void disp(){
    show();
}

}    

public class inheritenceex {
    public static void main(String args[])
    {
    b obj = new b();
    obj.disp();
}}
