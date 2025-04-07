public class Powder {
    public static void main(String[] args) throws Exception {
        System.out.println(pow(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
    static int pow(int x, int k, int n) {
        int temp = 1;
        for(int i = 1; i <= k; i++) {
            temp *= x;
            temp = temp % n;
        }
        return(temp);
    }
}
