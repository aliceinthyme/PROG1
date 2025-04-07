public class Fact {
    int n;
    Fact(int n_) {
        n = n_;
    }
    public void core() {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}  
