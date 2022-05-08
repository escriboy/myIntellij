import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String id = "JAVA";
        String name = "최영민";
        String tel = "010-8970-0481";

        String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
        String result1 = MessageFormat.format(text, id, name, tel);
        System.out.println(result1);
        System.out.println();

        String sql = "insert into member values( {0}, {1}, {2} )";
        Object[] arguments = {"'JAVA'", "'최영민'", "'010-8970-0481'"};
        String result2 = MessageFormat.format(sql, arguments);
        System.out.println(result2);
    }
}