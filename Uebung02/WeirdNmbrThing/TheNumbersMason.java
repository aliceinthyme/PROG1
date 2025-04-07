package WeirdNmbrThing;

public class TheNumbersMason { //what do they mean??

    public static void main(String[] args) {
        int a, b, c;
        double d, e, f;
        boolean g, h, i;
        double epsilon = 1e-10;
        if(((h == true) && (i == true) || ((g == true) && (h == true)))) {      //1
            a = (int)3.141;
        }
        if((b>c) && (b<a) && ((f/(e*d)<epsilon) && (f/(e*d)>-epsilon))) {      //2
            g = h;
            g = !i;
        }
        if((d != 0.0) && (e != 0.0) && (f != 0.0) && ((!g == true) || (!h == true) || (!i == true))) {  //3
            //do something?
        }
        if((h==false) && ((h==true) || (i==true))) {        //h==true redundant redundant   4
            g = true;
        } else {
            g = false;
        }
        if(((d<a) && (f<a)) && ((b != 0) && (e != 0))) {        //5
            c = (int)((d/b) - (f/e));
        }
    }
}


/*1. a sei gleich 3.141, wenn nicht h und nicht i oder nicht g und h gleich false
sind.
2. Solange b größer c und kleiner a und f geteilt durch e mal d gleich 0.0 sind,
sei g gleich h oder nicht i.
3. d, e und f sind alle ungleich 0.0 und nicht g oder nicht h oder nicht i sind alle
gleich true.
4. g ist gleich true, wenn h gleich false und wenn h oder i gleich true sind,
ansonsten ist g gleich false.
5. Solange d und f kleiner a sind und b und e nicht 0 sind, ist c gleich d geteilt
durch b minus f geteilt durch e. */