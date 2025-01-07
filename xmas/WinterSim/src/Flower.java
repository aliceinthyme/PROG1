public class Flower {
    public int state = 1;
    public int size = 0;
    final int GROW = 1;
    final int FLOURISH = 2;
    final int EATEN = 0;
    Flower() {   
    }
    public void isGrowing() {
        state = 1;
    }
    public void isFlourishing() {
        state = 2;
    }
    public void wasEaten() {
        state = 0;
    }
    public void life() {
        if(state != EATEN) {
            if(size < 15) {
                this.isGrowing();
                size++;
            } else {
                this.isFlourishing();
            }
        }
    }
    public void printStatus() {
        switch (state) {
            case GROW:
                System.out.print("is growing, size: "+this.size+"\n");
                break;
            case FLOURISH:
                System.out.print("is flourishing\n");
                break;
            case EATEN:
                System.out.print("was eaten\n");
                break;
            default:
                break;
        }
    }
}
