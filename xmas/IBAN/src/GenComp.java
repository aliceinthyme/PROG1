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
            int iban = 0;
            String proc = args[0]+args[1]+"131400";
            System.out.println(proc);
            for(int i = 0; i < proc.length(); i++) {
                int a = proc.charAt(i) - '0';
                iban *= 10;
                iban += a;
                iban = iban % 97;
            }
            int check = 98-iban;
            System.out.println(check);
            //output
            if (check < 10) {
                System.out.print("DE0"+check+args[0]);
                for(int i = 0; i < 10-args[1].length(); i++) {  //fills in leading zeros
                    System.out.print("0");
                }
                System.out.print(args[1]);
            } else {
                System.out.print("DE"+check+args[0]);
                for(int i = 0; i < 10-args[1].length(); i++) {  //fills in leading zeros
                    System.out.print("0");
                }
                System.out.print(args[1]);
            }
        }
    }
}