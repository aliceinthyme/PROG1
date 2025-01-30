public class SolidSnake {
    public static void main(String[] args) throws Exception {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[][] a = new int[m][n];
        n--;
        m--;
        int tracking = 0;
        for(int i = 0; i <= m; i++) { //fill with zeros
            for(int j = 0; j <= n; j++) {
                a[i][j] = 0;
            }
        }
        for(int i = 0; i <= n; i++) {    //erste Zeile
            a[0][i] = 1;
        }
        if(m == 1) {
            return;
        }
        for(int i = 1; i <= m; i++) {    //letzte Spalte
            a[i][n] = 1;
        }
        if(n == 1) {
            return;
        }
        for(int i = n-1; i > 0; i--) {    //letzte Zeile
            a[m][i] = 1;
        }
        if(m == 2) {
            return;
        }
        for(int i = m-1; i > 0; i--) {    //erste Spalte
            a[i][0] = 1;
        }
        if(n == 2) {
            return;
        }
        
    }
}
