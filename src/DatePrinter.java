import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 200000; i++){
            System.out.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
        }
    }
}
