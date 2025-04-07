public class Perfection {
    Perfection() {}
    public void core() {
        int n = 100;
        int sum;
        for(int i = 2; i < n; i++) {
            boolean prime = true;
            for(int j = i-1; j >= 2; j--) {
                if(i%j == 0) {
                    prime = false;
                }
            }
            if(prime) {
                int term1 = (int)Math.pow(2, (i-1));
                int term2 = (int)Math.pow(2, (i));
                int perfect = term1*(term2 - 1);
                boolean candidate = false;
                sum = 1;
                for (int j = 2; j<perfect; j++) {
                    if(perfect%j == 0) {
                        sum +=j;
                    }
                }
                if (sum == perfect) {
                    candidate = true;
                }
                if(candidate) {
                    System.out.print(perfect+" = ");
                    for(int j = perfect-1; j > 1; j--) {
                        if(perfect%j == 0) {
                            System.out.print(j+" + ");
                        }
                    }
                    System.out.print("1\n");
                }
            }
            
        }       
    }
}

/*Eine Zahl n nennt man eine Perfekte Zahl, wenn sie gleich der Summe aller ihrer
ganzzahligen Teiler ist (einschließlich der 1, ohne sich selbst).
Perfekte Zahlen sind z.B.:
n n ! 1 2 3 =     
6 = 3 + 2 + 1
28 = 14 + 7 + 4 + 2 + 1
Welche weiteren Perfekten Zahlen können Sie finden?
Schreiben Sie ein möglichst effizientes Java Programm, das mindestens die ersten
fünf perfekten Zahlen findet und diese in der obigen Form ausgibt! */


/*
 * for(int i = 2; i < n; i++) {
            boolean prime = true;
            for(int j = i-1; j >= 2; j--) {
                if(i%j == 0) {
                    prime = false;
                }
            }
            if(prime) {
                System.out.println(i);
                int term1 = (int)Math.pow(2, (i-1));
                int term2 = (int)Math.pow(2, (i));
                int perfect = term1*(term2 - 1);
                System.out.print(perfect+" = ");
                for(int j = perfect-1; j > 1; j--) {
                    if(perfect%j == 0) {
                        System.out.print(j+" + ");
                    }
                }
                System.out.print("1\n");
            }
            
        }
 */