public class GenComp {
    public static void main(String[] args) throws Exception {
        if((args[0].charAt(0) == 'D') && (args[0].charAt(1) == 'E')) {
            //German IBAN entered - check for authenticity
            int iban = 0;
            //sort code and acc nr
            for(int i = 4; i < args[0].length(); i++) { //starts at 4 to skip DExx
                int a = args[0].charAt(i) - '0';
                iban *= 10;
                iban += a;
                iban = iban % 97;
            }
            //D
            iban = ((iban * 10) + 1) % 97;
            iban = ((iban * 10) + 3) % 97;
            //E
            iban = ((iban * 10) + 1) % 97;
            iban = ((iban * 10) + 4) % 97;
            //Checksum
            iban = ((iban * 10) + (args[0].charAt(2) - '0')) % 97;
            iban = ((iban * 10) + (args[0].charAt(3) - '0')) % 97;
            if((iban == 1)) {
                System.out.println("Valid IBAN");
            } else {
                System.out.println("Invalid IBAN");
            }
        } else if (args.length == 2) {
            //Acc number and BLZ entered - generate new IBAN
            /*int iban = 0;
            for(int i = 4; i < args[0].length(); i++) { //starts at 4 to skip DExx
                int a = args[0].charAt(i) - '0';
                iban *= 10;
                iban += a;
                iban = iban % 97;
            }
            for(int i = 4; i < args[1].length(); i++) { //starts at 4 to skip DExx
                int a = args[1].charAt(i) - '0';
                iban *= 10;
                iban += a;
                iban = iban % 97;
            }
            iban = ((iban * 10) + 2) % 97;
            //E
            iban = ((iban * 10) + 7) % 97;
            iban = ((iban * 10)) % 97;
            iban = ((iban * 10)) % 97;
            int check = iban;*/
            //sort code - 1st input
            double sort = Double.parseDouble(args[0]);
            //acc nr - 2nd input
            double acc = Double.parseDouble(args[1]);
            for(int i = args[1].length(); i < 10; i++) {
                System.out.println("hi");
                acc *= 10;
            }
            //create checksum
            double x = 1e10;
            double ibase = sort * x;
            ibase += acc;
            //option 1
            //ibase *= 10000;
            //ibase += 1314;
            //ibase *= 100;
            //option 2
            ibase *= 10000;
            ibase += 2700;
            double checksum = 98 - (ibase % 97);
            int check = (int)checksum;
            
            //output
            if (check < 10) {
                System.out.print("DE0"+check+args[0]+(int)acc);
            } else {
                System.out.print("DE"+check+args[0]+(int)acc);
            }
        }
    }
}
