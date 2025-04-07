package A3;
//import java.util.Scanner;           //bring in the scanner


public class Noten {
    public static void main(String[] args) {
        /*Scanner inp = new Scanner(System.in);           //new scanner from console input 
        System.out.println("Bitte die Maximalpunktzahl eingeben:");     //for user friendliness
        double points = inp.nextDouble();               //user input -> only doubles allowed*/
        double points = Double.parseDouble(args[0]);  //für Konsoleneingabe (paranoia falls sie Scanner nicht nehmen sollten OTL)
        double[] calc = new double[10];                 //make arrays to hold final values
        double[] subcalc = new double[10];
        double[] grades = {1.0,1.3,1.7,2.0,2.3,2.7,3.0,3.3,3.7,4.0};            //arrays for constants
        double[] toppc = {100,94.9,89.9,84.9,79.9,74.9,69.9,64.9,59.9,54.9};
        int[] botpc ={95,90,85,80,75,70,65,60,55,50};
        double temp;                //variables to do maths with
        double temp2 = points;
        for(int i = 0; i < 10; i++) {                   //do maths and fill arrays
            temp = Math.round((points/100)*botpc[i]*10);
            temp = temp /10;        //in two lines because otherwise java seems to want to get alll fussy with me over rounding in a way it really should not be
            calc[i] = temp;
            subcalc[i] = temp2; 
            temp2 = Math.round((temp - 0.1)*10);
            temp2 = temp2/10;       //same thing here
        }
        subcalc[0] = points;                //sets max points to user input
        System.out.println("------------------------------------ \nNotenspiegel:"); //aesthetics
        for(int i = 0; i < 10; i++) {       //print array contents to sysout
            //System.out.println(grades[i]+": "+subcalc[i]+" - "+calc[i]+" ("+toppc[i]+" - "+botpc[i]+"%)");
            System.out.printf("%-5.1f: %-5.1f - %-5.1f (%-5.1f - %-2d%%)%n", grades[i], subcalc[i], calc[i], toppc[i], botpc[i]);
        }
        System.out.println("5.0: weniger als "+calc[9]+" Punkte \n------------------------------------");
    }
}
