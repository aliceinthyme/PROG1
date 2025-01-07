public class WinterSim {
    public static void main(String[] args) throws Exception {
        Winter winter = new Winter();
        for(int i = 1; i <= 20; i++) {
            winter.oneDayPasses();
        }
    }
}
