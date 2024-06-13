import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// FieldPosition 是一個用來追蹤一些 "特定字段" 位置的類.
public class FieldPositionExample {
    public static void main(String[] args) {
        int days = 1;
        int month = 1;
        int year = 2001;
        SimpleDateFormat sdf = new SimpleDateFormat("E dd-MM-yyyy G");
        StringBuffer buf = new StringBuffer();
        Calendar cal = new GregorianCalendar();
        cal.set(year, month - 1, days);

        java.text.FieldPosition fp = new java.text.FieldPosition(DateFormat.YEAR_FIELD);
        sdf.format(cal.getTime(), buf, fp);

        System.out.println(buf);

        System.out.println("Formatted date: " + buf);
        System.out.println("Position of year field: " + fp.getBeginIndex() + "-" + fp.getEndIndex());

        // 取得特定字段位置後可以用位置來直接改變字串值
    }
}