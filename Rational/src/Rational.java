public class Rational {
    private int num, denom;
    //constructors
    Rational() {
        num = 0;
        denom = 1;
    }
    Rational(int n) {
        num = n;
        denom = 1;
    }
    Rational(int n, int d) {
        if(d < 0) {
            d = -d;
        }
        if(d == 0) {
            new ArithmeticException();
        }
        num = n;
        denom = d;
    }
    Rational(Rational r) {
        num = r.num;
        denom = r.denom;
    }
    //getters/setters
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getDenom() {
        return denom;
    }
    public void setDenom(int denom) {
        this.denom = denom;
    }
    //methods
    public String text() {
        if (getDenom() == 1)
        return "" + getNum();
        return getNum() + "/" + getDenom();
    }
    public Rational invert(Rational r) {
        Rational a = new Rational(r.denom, r.num);
        return(a);
    }
    public Rational add(Rational r) {
        int top1 = r.denom*this.num;
        int top2 = r.num*this.denom;
        Rational a = new Rational((top1+top2), (r.denom*this.denom));
        return(a);
    }
    public Rational subtract(Rational r) {
        int top1 = r.denom*this.num;
        int top2 = r.num*this.denom;
        Rational a = new Rational((top1-top2), (r.denom*this.denom));
        return(a);
    }
    public Rational mult(Rational r) {
        Rational a = new Rational((r.num*this.num), (r.denom*this.denom));
        return(a);
    }
    public Rational div(Rational r) {
        Rational a = invert(r);
        Rational b = new Rational((this.num*a.num), (this.denom*a.denom));
        return(b);
    }
    public Rational reduce() {
        int temp = 0;
        int a = this.num-1;
        int b = this.denom-1;
        while(b != 0) {
            temp /= b;
            b /= a % b;
            a /= temp;
        }
        this.setNum(this.num/a);
        this.setDenom(this.denom/a);
        return this;
    }
}