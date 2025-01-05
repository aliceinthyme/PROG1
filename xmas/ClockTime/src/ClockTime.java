public class ClockTime {
    int h, m, s;
    ClockTime() {
        this.h = 0;
        this.m = 0;
        this.s = 0;
    }
    ClockTime(int h) {
        this.h = h;
        this.m = 0;
        this.s = 0;
        overflow();
    }
    ClockTime(int h, int m) {
        this.h = h;
        this.m = m;
        this.s = 0;
        overflow();
    }
    ClockTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
        overflow();
    }
    ClockTime(ClockTime ct) {
        this.h = ct.h;
        this.m = ct.m;
        this.s = ct.s;
    }
    public boolean same(ClockTime ct) {
        if((this.h == ct.h) && (this.m == ct.m) && (this.s == ct.s)) {
            return(true);
        } else {
            return(false);
        }
    }
    public void add(int s) {
        this.s += s;
        overflow();
    }
    public int diff(ClockTime ct) {
        int total = 0;
        //I'm guessing you want this order?
        ClockTime a = new ClockTime(this);
        while(! a.same(ct)) {
            a.add(1);
            total++;
        }
        return(total);
    }
    public int getHours() {
        return h;
    }
    public int getMinutes() {
        return m;
    }
    public int getSeconds() {
        return s;
    }
    public void output() {
        if(this.h < 10) {
            System.out.print("0");
        }
        System.out.print(this.h+":");
        if(this.m < 10) {
            System.out.print("0");
        }
        System.out.print(this.m+":");
        if(this.s < 10) {
            System.out.print("0");
        }
        System.out.print(this.s+"\n");
    }
    //keeps time in bounds
    private void overflow() {
        while(s > 59) {
            s -= 60;
            m++;
        }
        while(s < 0) {
            s += 60;
            m--;
        }
        while(m > 59) {
            m -= 60;
            h++;
        }
        while(m < 0) {
            m += 60;
            h--;
        }
        while(h > 24) {
            h -= 24;
        }
        while(h < 0) {
            h += 24;
        }
    }
}
