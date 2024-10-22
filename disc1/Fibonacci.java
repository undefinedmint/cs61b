package disc1;

class Fibonacci {

    public static void main(String[] args) {

        fib(1);
        fib(2);
        fib(3);
        fib(4);
        fib(5);
        fib(6);

        fib2(1, 0, 0, 1);
        fib2(2, 0, 0, 1);
        fib2(3, 0, 0, 1);
        fib2(4, 0, 0, 1);
        fib2(5, 0, 0, 1);

    }


    // return the nth fib number
    public static int fib(int n) {
        int lastFib = 0;
        int currentFib = 1;
        int ret = 0;
        for (; n > 1; n--) {
            ret = lastFib + currentFib;
            lastFib = currentFib;
            currentFib = ret;
        }
        System.out.println(lastFib);
        return lastFib;
    }


//    Extra: Implement a more efficient version of fib in 5 lines or fewer. Here, efficiency
//    might mean making less recursive calls or doing less overall computation. You don’t
//    have to make use of the parameter k in your solution.

    public static int fib2(int n, int k, int f0, int f1) {
        for (; n > 1; n --) {
            k = f0 + f1;
            f0 = f1;
            f1 = k;
        }
        System.out.println(f0);
        return f0;
    }

}
