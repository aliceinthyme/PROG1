public class Varrrr {
    int i, j, k;
    boolean b, c, d;
    Varrrr(int i_, int j_, int k_, boolean b_, boolean c_, boolean d_) {
        i = i_;
        j = j_;
        k = k_;
        b = b_;
        c = c_;
        d = d_;
    }
    public void core() {
        if((i!=0) && (j!=0) && (k != 0)) {}
        if((i%17 == 0) && (i > 0)) {}
        if((j%2 == 1) && (22 < j) && (j < 44)) {}
        if((k/11 == 13) || (k/17 == 13) || (k/19 == 17)) {}
        if(((b && c) ^ (c && d)) ^ ((b && d) ^ (b && c))) {}
        if((!b && !c && !d) ^ (b && c && d)) {}
    }
}

/*Der Java-Ausdruck soll true liefern, wenn
die Bedingung zutrifft, und ansonsten false. Die Variablen i, j und k haben den Typ
int; b, c und d haben den Typ boolean.
Versuchen Sie möglichst optimale Ausdrücke zu finden (d.h. mit einer minimalen
Anzahl Zeichen).
1. i, j und k sind alle verschieden von Null.
2. i ist durch 17 teilbar und echt positiv.
3. j ist ungerade und liegt zwischen 22 und 44.
4. k ist entweder Vielfaches von 11 und 13, oder Vielfaches von 13 und 17, oder
Vielfaches von 17 und 19.
5. Genau zwei Variablen von b, c und d sind true.
6. b, c und d sind alle drei true oder alle drei false. */