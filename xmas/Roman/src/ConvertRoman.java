//this program ignores roman syntax rules for input as a numeral, overlines are not accepted, for each 1000 above 1000 an extra X will be outputted
public class ConvertRoman {
    public static void main(String[] args) throws Exception {
        if(args[0].matches("-?\\d+")) {
            //convert to roman
            int a = Integer.parseInt(args[0]);
            //not in a switch because I need while loops since no upper barrier was specified and we arent  using overlines
            while (a - 1000 >= 0) {
                System.out.print("M");
                a -= 1000;
            }
            if (a - 900 >= 0) {
                System.out.print("CM");
                a -= 900;
            }
            if (a - 500 >= 0) {
                System.out.print("D");
                a -= 500;
            }
            if (a - 400 >= 0) {
                System.out.print("CD");
                a -= 400;
            }
            while (a - 100 >= 0) {
                System.out.print("C");
                a -= 100;
            }
            if (a - 90 >= 0) {
                System.out.print("XC");
                a -= 90;
            }
            if (a - 50 >= 0) {
                System.out.print("L");
                a -= 50;
            }
            if (a - 40 >= 0) {
                System.out.print("XL");
                a -= 40;
            }
            while (a - 10 >= 0) {
                System.out.print("X");
                a -= 10;
            }
            if (a - 9 == 0) {
                System.out.print("IX");
                a -= 9;
            }
            if (a - 5 >= 0) {
                System.out.print("V");
                a -= 5;
            }
            if (a - 4 == 0) {
                System.out.print("IV");
                a -= 4;
            }
            while (a != 0) {
                System.out.print("I");
                a--;
            }
        } else {
            //convert from roman
            int result = 0;
            for(int i = 0; i < args[0].length(); i++) {
                char a = args[0].charAt(i);
                switch(a) {
                    case 'M':
                        result += 1000;
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'C':
                        if(i != args[0].length()-1) {
                            if(args[0].charAt(i+1) == 'M') {
                                result += 900;
                                i++;
                            } else if(args[0].charAt(i+1) == 'D') {
                                result += 400;
                                i++;
                            } else {
                                result += 100;
                            }
                        } else {
                            result += 100;
                        }
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'X':
                    if(i != args[0].length()-1) {
                            if(args[0].charAt(i+1) == 'C') {
                                result += 90;
                                i++;
                            } else if(args[0].charAt(i+1) == 'L') {
                                result += 40;
                                i++;
                            } else {
                                result += 10;
                            }
                        } else {
                            result += 10;
                        }
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'I':
                        if(i != args[0].length()-1) {
                            if(args[0].charAt(i+1) == 'X') {
                                result += 9;
                                i++;
                            } else if(args[0].charAt(i+1) == 'V') {
                                result += 4;
                                i++;
                            } else {
                                result += 1;
                            }
                        } else {
                            result += 1;
                        }
                        break;
                }
            }
            System.out.println(result);
        }
    }
}
