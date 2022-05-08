public class SelfConfirm8 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        //학생 한 명이 가지는 연필 수
        int pencilPerStudent = (pencils/students); // 몫을 계산
        System.out.println(pencilPerStudent);

        //남은 연필 수
        int pencilsLeft =(pencils%students); // 나머지를 계산
        System.out.println(pencilsLeft);
    }
}
