import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Current Date: "+ currentDate);
    }

}
