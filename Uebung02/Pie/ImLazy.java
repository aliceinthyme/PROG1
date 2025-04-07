package Pie;

public class ImLazy {
    public static void main(String[] args) {
        double[] pie = {3.125,3.1416,3.14159292,3.140854685};
        double[] diff = new double[pie.length];
        String[] names = {"Baby","Arya","Tsu","Tycho"};
        for(int i = 0; i < pie.length; i++) {
            diff[i] = pie[i]-Math.PI;
            if (diff[i]<0) {
                diff[i] *= -1;
            }
            System.out.println("------------------------\n"+names[i]+" Unterschied zu Math.PI: "+diff[i]);
        }
    }
}
