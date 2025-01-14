public class CoffeeMachine {
    private int cofFill, watFill, watCap, cofCap, cleanCounter, lifetimeCups;
    CoffeeMachine(int wat, int cof) {
        watCap = wat;
        cofCap = cof*10;
        cofFill = 0;
        watFill = 0;
        cleanCounter = 12;
        lifetimeCups = 0;
    }
    //getter
    public int getCleanCounter() {
        return(this.cleanCounter);
    }
    //methods
    public void printStats() {
        double dcofFill = (double)cofFill/10;
        System.out.println("Hi there caffeine fiend! Your current coffee stats are: "+
        "\nYour Machine is filled to "+dcofFill+"/"+cofCap/10+" with coffee!"+
        "\nAnd to "+watFill+"/"+watCap+" with water!"+
        "\nYou can make another "+cleanCounter+" cups before the next mandatory cleaning cycle!"+
        "\nWow, arent you an avid coffee addict! You have brewed a total of "+lifetimeCups+" with this machine!"
        );
    }
    public void makeCup() {
        if((this.cofFill >= 75) && (this.watFill >= 150)) {
            cleanCounter--;
            lifetimeCups++;
            cofFill -= 75;
            watFill -= 150;
        } else {
            System.out.println("Please check and refill coffee and water as needed before attempting to make another cup!");
        }
    }
    public void fillWater(int refill) {
        int over = watCap - (watFill+refill);
        if(over < 0) {
            watFill = watCap;
            System.out.println("You refill the container completely, but refrain from pouring the remaining "+-over+"ml into the already full container!");
        } else {
            watFill += refill;
        }
    }
    public void fillCoffee(int refill) {
        int over = cofCap - (cofFill+(refill*10));
        if(over < 0) {
            cofFill = cofCap;
            System.out.println("You refill the container completely, but refrain from pouring the remaining "+(double)(-over/10)+"g into the already full container!");
        } else {
            cofFill += (refill*10);
        }
    }
    public void clean() {
        this.cleanCounter = 12;
    }
}
