public class fibonacciSeries {

    public static void main(String[] args) {
        int num = 9;
        int a = 0;
        int b = 1;
        System.out.print(a+""+b);

        for(int i=3;i<=9;i++){
            int next = a+b;
            System.out.print(next);

            a=b;
            b=next;
        }

    }
}