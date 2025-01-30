public class VectorMain {
    public static void main(String[] args) throws Exception {
        Sparse a = Sparse.create(20, 5, 10, 20);
        System.out.println("a");
        Sparse b = Sparse.create(20, 5, 10, 20);
        System.out.println("a");
        Sparse c = Sparse.create(15, 5, 10, 20);
        System.out.println("a");
        Sparse d = Sparse.add(a, b);
        System.out.println("a");
        Sparse e = Sparse.add(a, c);
        System.out.println("a");
        d.printAll();
        System.out.println("a");
        System.out.println(Sparse.amount(a));
        a.printAll();
        a.changeValue(5, 10);
        a.printCompact();
        b.printCompact();
        System.out.println(Sparse.dot(a, b));
        Sparse.opposite(a);
        a.printAll();
    }
}
