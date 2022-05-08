public class ForEx3 {
    public static void main(String[] args) {
        // float을 사용하면 9번만 돈다. 루프 카운트 변수로 부동소수점은 되도록 사용하지 않는다.
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
