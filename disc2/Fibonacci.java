class Fibonacci {

    public static void main(String[] args) {
        fib(1);
        fib(2);
        fib(3);
        fib(4);
    }


    // return the nth fib number
    public static int fib(int n) {
        int i = 1;
        int lastFib = 1;
        int currentFib = 0;
        int ret = 0;
        while (i < n) {
            ret = lastFib + currentFib;
            lastFib = currentFib;
            currentFib = ret;
            i++;
        }
        System.out.println(ret);
        return ret;
    }


}
