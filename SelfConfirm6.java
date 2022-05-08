public class SelfConfirm6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(x); //11
        System.out.println(y); //19
        System.out.println(z); //31 (y는 연산에 참여하지 않음)
    }
}