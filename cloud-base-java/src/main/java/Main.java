import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author leijian
 * @version 1.0
 * @date 2019/6/4 17:19
 **/
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,00,01);
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(calendar.getTimeInMillis());
        System.out.println(dateFormat.parse(dateFormat.format(calendar.getTime())).getTime());

        String beginDate = "1420041600000";
        beginDate = "1546272000000";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String sd = sdf.format(new Date(Long.parseLong(beginDate))); // 时间戳转换日期

        System.out.println(sd);
    }
}
