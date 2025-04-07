public class Triangle {
    Triangle() {}
    public void core(){
        //int n = Integer.parseInt(args[0]);
        int n = 10;
        int c = 1;
        for(int i =0;i<n;i++) {
            System.out.print(" ");
            for(int j=0;j<=i;j++) {
                if (j==0||i==0)
                        c=1;
                else 
                    c=c*(i-j+1)/j;
                    System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}

/*Schreiben Sie ein Java Programm zur Berechnung und Ausgabe des Pascal’schen
Dreiecks. Dieses sieht wie folgt aus:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1
1 9 36 84 126 126 84 36 9 1
…
Übergeben Sie Ihrem Programm die Anzahl der auszugebenden Zeilen per
Kommandozeile. Überlegen und beschreiben Sie anschließend, wie Sie die
Berechnung effizient gestalten können! Sie dürfen insgesamt höchstens drei for
Schleifen und keine zusätzlichen Methoden verwenden!
(Tipp: Verwenden Sie Binomial-Koeffizienten) */