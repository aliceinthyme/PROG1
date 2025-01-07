public class Vole {
    public int state = 1;
    final int SLEEP = 1;
    final int FED_UP = 2;
    final int HUNGRY = 3;
    final int STARVED = 0;
    Vole() {
        
    }
    public void isSleeping() {
        state = 1;
    }
    public void isHungry() {
        state = 3;
    }
    public void isFedUp() {
        state = 2;
    }
    public void hasStarved() {
        state = 0;
    }
    public void hungryVole() {
        int random = (int)(Math.random() * 10 + 1);
        if((random == 1) && (this.state != STARVED)) {
            this.isHungry();
        }
    }
    public void printStatus() {
        switch (state) {
            case SLEEP:
                System.out.print("is sleeping\n");
                break;
            case HUNGRY:
                System.out.print("is hungry\n");
                break;
            case FED_UP:
                System.out.print("is sated\n");
                break;
            case STARVED:
                System.out.print("has starved\n");
                break;
            default:
                break;
        }
    }
}
