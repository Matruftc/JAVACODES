public class continueex {
    public static void main(String args[]){
        int number=0;
        while(number<10){
            if(number == 4){
                continue;
            }
            System.out.println("After execution the number is: "+number);
            number++;
        }
    }
}
