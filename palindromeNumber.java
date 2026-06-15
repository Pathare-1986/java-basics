public class palindromeNumber {

    public static void main(String[] args){
        int num = 121;
        int reverse = 0;
        int original = num;

        while(num>0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num / 10;
        }

        if(original == reverse){
            System.out.print("number is palindrome");
        }else{
            System.out.print("number is nor palindrome");
        }

    }
}
