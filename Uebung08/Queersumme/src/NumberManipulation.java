public class NumberManipulation {
    //internal methods
    private int splitAndAdd(int a) {
        int total = 0;
        while(a != 0) {
            int d = a % 10;
            a -= d;
            a /= 10;
            total += d;
        }
        return(total);
    }
    private int splitAndMult(int a) {
        int total = 1;
        while(a != 0) {
            int d = a % 10;
            a -= d;
            a /= 10;
            total *= d;
        }
        return(total);
    }
    //external methods
    public void findAllN(int n) {
        System.out.println("Finding all that match input n:");
        for(int i = 0; i <= 1000; i++) {
            if(splitAndAdd(i) == n) {
                System.out.println(i);
            }
        }
    }
    public void findAllM(int m) {
        System.out.println("Finding all that match input m:");
        for(int i = 0; i <= 1000; i++) {
            if((splitAndAdd(i) % m) == 0) {
                System.out.println(i);
            }
        }
    }
    public void awwSuchAQt(int a) {
        while(a >= 10) {
            a = splitAndAdd(a);
        }
        System.out.println("The qt you were looking for is: "+a);
    }
    public void findCalcPairs() {
        System.out.println("Finding all that pair: ");
        for(int i = 0; i <= 1000; i++) {
            if((splitAndAdd(i) + splitAndMult(i)) == i) {
                System.out.println(i);
            }
        }
    }
}
