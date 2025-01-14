public class QueerTest {    //somethingsomething pun on Querschnitt - I've had too much sugar
    public static void main(String[] args) throws Exception {
        NumberManipulation a = new NumberManipulation();
        switch (args.length) {
            case 3:
                a.awwSuchAQt(Integer.parseInt(args[2]));
            case 2:
                a.findAllM(Integer.parseInt(args[1]));
            case 1:
                a.findAllN(Integer.parseInt(args[0]));
                a.findCalcPairs();
                break;
            default:
                System.out.println("sorry, no params or excessive params error, please call again with 1/2/3 arguments, all integers");
                break;
        }
    }
}
