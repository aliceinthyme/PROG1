public class Primes {
    int n;
    Primes(int n_) {
        n = n_;
    }

    public void core() {
        int amount = 0;
        int prev = 2;
        int twins = 0;
        int diff = 0;
        int maxDiff = 0;
        int lowMin = 0;
        int highMin = 0;
        for(int i = 2; i < n; i++) {
            boolean prime = true;
            for(int j = i-1; j >= 2; j--) {
                if(i%j == 0) {
                    prime = false;
                }
            }
            if(prime) {
                amount++;
                diff = i - prev;
                if(i - prev == 2) {
                    twins++;
                }
                if(maxDiff < diff) {
                    maxDiff = diff;
                    lowMin = prev;
                    highMin = i;
                }
                prev = i;
            }
        }
        System.out.println(amount);
        System.out.println(twins);
        System.out.println(maxDiff+" "+lowMin+" "+highMin);
    }
}

/*Implementieren Sie den Algorithmus als Java Programm Primes. Primes akzeptiert
eine Obergrenze n (mit n > 2) als Kommandozeilenargument und gibt Antworten auf
die folgenden drei Fragen aus:
1. Wie viele Primzahlen gibt es zwischen 1 und n (1 und n nicht mitgezählt)?
2. Wie viele Primzahlen-Zwillinge gibt es zwischen 1 und n (1 und n nicht
mitgezählt)? Primzahlen-Zwillinge sind zwei Primzahlen, die sich um genau 2
unterscheiden. Beispielsweise ist (11, 13) ein Primzahlen-Zwilling.
3. Wie groß ist der größte Abstand zwischen zwei Primzahlen zwischen 1 und n (1
und n nicht mitgezählt)? Wie lauten die beiden kleinsten Primzahlen mit dem
maximalen Abstand?
Für eine Obergrenze von n = 20 sieht die Ausgabe Ihres Programms so aus:
$ java Primes 20
8
4
4 7 11
Die Antworten lassen sich leicht als korrekt überprüfen:
Es gibt 8 Primzahlen zwischen 1 und 20: 2, 3, 5, 7, 11, 13, 17, 19.
Es gibt 4 Primzahlen-Zwillinge zwischen 1 und 20: (3, 5), (5, 7), (11, 13), (17, 19).
Der größte Abstand von 4 liegt zwischen den beiden Primzahlen 7 und 11. Der
gleiche Abstand liegt auch zwischen 13 und 17, aber gesucht sind die kleinsten
Primzahlen mit dem größten Abstand. 
*/
