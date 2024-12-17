public class Fibonacci {
    public static void main(String[] args) throws Exception {
        System.out.println(iterative(Integer.parseInt(args[0])));
        System.out.println(recursive(Integer.parseInt(args[0])));
    }
    public static int iterative (int a) {
        int prev1 = 0;
        int prev2 = 1;
        int result = 2;
        switch (a) {
            case 0:
                return(0);
            case 1:
                return(1);
            default:
                for(int i = 2; i <= a; i++) {
                    result = prev1 + prev2;
                    prev1 = prev2;
                    prev2 = result;
                }
                return(result);
        }
        
    }
    public static int recursive (int a) {
        if (a <= 1) { 
            return(a);
        } else {
            return(recursive(a-1)+recursive(a-2));
        }
    }
}
