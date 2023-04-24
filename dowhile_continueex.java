public class dowhile_continueex{
    public static void main(String args[]){
        int number=0;
        do{
           System.out.println("After execution the number is: "+number);
            number++;
            if(number==4)
            {
                break;
            }
        }while(number<10);
    }
}
