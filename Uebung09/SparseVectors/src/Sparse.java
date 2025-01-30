public class Sparse {
    private int[] vector;
    Sparse(int a) {
        vector = new int[a];
    }
    public static double amount(Sparse a) {
        int temp = Sparse.dot(a, a);
        double result = Math.sqrt(temp);
        return(result);
    }
    public static Sparse opposite(Sparse a) {
        for(int i = 0; i < a.vector.length; i++) {
            a.vector[i] = -a.vector[i];
        }
        return(a);
    }
    public void changeValue(int index, int value) {
        this.vector[index] = value;
    }
    public void printCompact() {
        System.out.print("[");
        boolean first = true;
        for (int i = 0; i < this.vector.length; i++) {
            if(this.vector[i] != 0) {
                if(!first) {
                    System.out.print(", ");
                    System.out.print(i+":"+this.vector[i]);
                } else {
                    System.out.print(i+":"+this.vector[i]);
                    first = false;
                }
            }  
        }
        System.out.print("]\n");
    }
    public void printAll() {
        System.out.print("(");
        for (int i = 0; i < this.vector.length; i++) {
            if(i < this.vector.length-1) {
                System.out.print(this.vector[i]+",");
            } else {
                System.out.print(this.vector[i]);
            }
        }
        System.out.print(")\n");
    }
    public static Sparse add(Sparse a, Sparse b) {
        if(a.vector.length != b.vector.length) {
            System.out.println("Null value returned, vectors not of compatible length!");
            return(null);
        } else {
            Sparse c = Sparse.create(a.vector.length, 0, 0, 0);
            for (int i = 0; i < c.vector.length; i++) {
                c.vector[i] = a.vector[i] + b.vector[i];
            }
            return(c);
        }
    }
    public static Sparse create(int n, int m, int a, int b) {
        Sparse generate = new Sparse(n);
        for (int i = 0; i < generate.vector.length; i++) {
            generate.vector[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            boolean placed = false;
            while(!placed) { 
                int index = (int)(Math.random()*generate.vector.length);
                if(generate.vector[index] == 0) {
                    int temp = 0;
                    while(temp < a) {
                        temp = (int) (Math.random() * b + 1);
                    }
                    generate.vector[index] = temp;
                    placed = true;
                }
            }
        }
        return(generate);
    }
    public static int dot(Sparse a, Sparse b) {
        if(a.vector.length != b.vector.length) {
            System.out.println("Vectors not of compatible length!");
            return(0);
        } else {
            int temp = 0;
            for (int i = 0; i < a.vector.length; i++) {
                temp += (a.vector[i] * b.vector[i]);
            }
            return(temp);
        }
    }
}
