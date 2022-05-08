import java.util.TimeZone;
// 시간대 문자열 목록 출력
public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String id : availableIDs) {
            System.out.println(id);
        }
    }
}
