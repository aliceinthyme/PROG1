package HA2;
//import java.util.Scanner;     //for easier testing

public class Coins {

    public static void main(String[] args) {
        //Scanner inp = new Scanner(System.in); //for easier testing
        //double dollar = inp.nextDouble(); 
        // Getting the total dollar amount
        double dollar = Double.parseDouble(args[0]);
        int one; // Number of 1 Dollar coins
        int fiftyC; // Number of 50 Cent coins
        int twentyC; // Number of 20 Cent coins
        int tenC; // Number of 10 Cent coins
        int fiveC; // Number of 5 Cent coins
        int oneC; // Number of 1 Cent coins
        int dollar_; //dollar as int
        int temp;

        one = (int)dollar;
        dollar = (dollar*100-one*100);  //*100 needs to be done twice since putting it outside the bracket causes a weird lil interaction that will turn 60 into 59 past the decimal point
        dollar_ = (int)dollar;
        temp = dollar_%50;                 
        fiftyC = (dollar_ - temp)/50;      //make divisible by and find amount of 50s
        dollar_ = temp;                    //mit dem Rest wird weitergerechnet
        temp = dollar_%20;
        twentyC = (dollar_ - temp)/20;
        dollar_ = temp;
        temp = dollar_%10;
        tenC = (dollar_ - temp)/10;
        dollar_ = temp;
        temp = dollar_%5;
        fiveC = (dollar_ - temp)/5;
        oneC = temp;

        // Print values
        System.out.println(one + " x 1 Dollar");
        System.out.println(fiftyC + " x 50 Cent");
        System.out.println(twentyC + " x 20 Cent");
        System.out.println(tenC + " x 10 Cent");
        System.out.println(fiveC + " x 5 Cent");
        System.out.println(oneC + " x 1 Cent");
    }
}
