package algorithm;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

// 2016년
public class Date20161107 {
    public String solution(int a, int b) throws ParseException {
        String answer = "";
        String result = "2016-" + a + "-" + b;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Format formatter = new SimpleDateFormat("E", Locale.ENGLISH);

        answer = formatter.format(sdf.parse(result)).toUpperCase();

        return answer;
    }
}
