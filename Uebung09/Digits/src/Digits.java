public class Digits {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(args[0]);
        int b = 0;
        System.out.println("Input Number: "+a);
        while(a != 0) {
            int temp = a % 10;
            b *= 10;
            b += temp;
            a -= temp;
            if(a != 0) {
                a /= 10;
            }
        }
        System.out.print("Seperated: ");
        while(b != 0) {
            int temp = b % 10;
            b -= temp;
            if(b != 0) {
                b /= 10;
            }
            switch (temp) {
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
        }
    }
}
