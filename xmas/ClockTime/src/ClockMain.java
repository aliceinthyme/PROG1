public class ClockMain {
    public static void main(String[] args) throws Exception {
        ClockTime a = new ClockTime();
        ClockTime b = new ClockTime(75);
        ClockTime c = new ClockTime(23, 60);
        ClockTime d = new ClockTime(12, 45, 60);
        ClockTime e = new ClockTime(d);
        a.output();
        b.output();
        c.output();
        d.output();
        e.output();
        if(e.same(d)) {
            System.out.println("e = d");
        }
        a.add(361);
        a.output();
        System.out.println(b.diff(d));
        System.out.println(a.getHours()+" "+a.getMinutes()+" "+a.getSeconds());
    }
}
