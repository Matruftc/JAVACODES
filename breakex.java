public class breakex {
    public static void main(String args[]){
        int number=0;
        while(number<10){
            if(number == 4){
                break;
            }
            System.out.println("After execution the number is: "+number);
            number++;
        }
    }
}
