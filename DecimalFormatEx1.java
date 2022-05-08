import java.text.DecimalFormat;

public class DecimalFormatEx1 {
    public static void main(String[] args) {
        double num = 1234567.89;

        //10진수(빈자리는 0으로 채움)
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format((num)));

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("00000000000.00000");
        System.out.println(df.format(num));

        //10진수(빈자리는 채우지 않음)
        df = new DecimalFormat("#");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.#");
        System.out.println(df.format(num));

        df = new DecimalFormat("##########.#####");
        System.out.println(df.format(num));

        //소수점
        df = new DecimalFormat("#.0");
        System.out.println(df.format(num));


        // +- 기호
        df = new DecimalFormat("+#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("-#.0");
        System.out.println(df.format(num));

        // 단위 구분
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));

        //지수 문자
        df = new DecimalFormat("0.0E0");
        System.out.println(df.format(num));

        // 양수와 음수 패턴 모두 기술할 경우
        df = new DecimalFormat("+#,### ; -#,###");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.# %");
        System.out.println(df.format(num));

        df = new DecimalFormat("\u00A4 #,###");
        System.out.println(df.format(num));

    }
}
