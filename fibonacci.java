public class fibonacci {
    static int fib(int n){
        if(n == 0 || n == 1)
        return n;

        int prev = fib(n-1);
        int prevprev = fib(n-2);

        return prev + prevprev;

    }

    public static void main(String[] args) {
        System.out.println(fib(2));
         
    }
    
}
