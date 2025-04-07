import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.println("Would you like to run (enter int):\n"+
                            "1. Varrr\n"+
                            "2. Fact\n"+
                            "3. Primes\n"+
                            "4. \n"+
                            "5. \n");
        int choice = inp.nextInt();
        //switch
        switch (choice) {
            case 1:
                Varrrr Var = new Varrrr(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Boolean.parseBoolean(args[3]), Boolean.parseBoolean(args[3]), Boolean.parseBoolean(args[3]));
                Var.core();
                break;
            case 2:
                Fact F = new Fact(Integer.parseInt(args[0]));
                F.core();
                break;
            case 3:
                Primes Prime = new Primes(Integer.parseInt(args[0]));
                Prime.core();
                break;
            case 4:
                Perfection Perf = new Perfection();
                Perf.core();
                break;
            case 5:
                Triangle Tri = new Triangle();
                Tri.core();
                break;
            default:
                break;
        }
    }
}
