import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String data = "17/10/2001";
        Date dataDate = dateFormat.parse(data);

        System.out.println(dataDate);

        Calendar.getInstance().getTimeInMillis();

        int dataComparada = dataAtual.compareTo(dataDate);

        System.out.println(dataComparada);
    }
}
