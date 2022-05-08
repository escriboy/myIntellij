public class SelfConfirm7 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90))? "가":"나"; // true면 '가', false면 '나'를 출력 (score이 90보다 큰게 아내니까 true)
        System.out.println(result); // 가
    }
}