public class SelfConfim2 {
    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            int i = (int) (Math.random() * 6 + 1);
            int j = (int) (Math.random() * 6 + 1);
                System.out.println("(" + i + " , " + j + ")");
            if (i+j==5){
                run = false;
            }
        } //while문
    }
}
