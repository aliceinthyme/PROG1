public class Winter {
    private int day = 1;
    Flower flower1 = new Flower();
    Flower flower2 = new Flower();
    Flower flower3 = new Flower();
    Flower flower4 = new Flower();
    Flower flower5 = new Flower();
    Vole vole = new Vole();
    Winter() {

    }
    public void oneDayPasses() {
        vole.hungryVole();
        flower1.life();
        flower2.life();
        flower3.life();
        flower4.life();
        flower5.life();
        System.out.println("------------------------");
        System.out.println("This is day "+this.day);
        System.out.print("Flower 1 ");
        flower1.printStatus();
        System.out.print("Flower 2 ");
        flower2.printStatus();
        System.out.print("Flower 3 ");
        flower3.printStatus();
        System.out.print("Flower 4 ");
        flower4.printStatus();
        System.out.print("Flower 5 ");
        flower5.printStatus();
        System.out.print("Vole ");
        vole.printStatus();
        devouringVole();
        day++;
    }
    public void devouringVole() {
        if(vole.state == vole.HUNGRY) {
            if(flower1.state != flower1.EATEN) {
                flower1.wasEaten();
                vole.isFedUp();
            } else if(flower2.state != flower2.EATEN) {
                flower2.wasEaten();
                vole.isFedUp();
            } else if(flower3.state != flower3.EATEN) {
                flower3.wasEaten();
                vole.isFedUp();
            } else if(flower4.state != flower4.EATEN) {
                flower4.wasEaten();
                vole.isFedUp();
            } else if(flower5.state != flower5.EATEN) {
                flower5.wasEaten();
                vole.isFedUp();
            } else {
                vole.hasStarved();
            }
        } else if (vole.state == vole.FED_UP) { //instructions unclear if this is meant to happen before it can get hungry again or not
            vole.state = vole.SLEEP;
        }
    }
}
