import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

    public static void main(String[] args) {
    	
        long milliSecond = 1551798059000L;
        
        Date date = new Date();
        
        date.setTime(milliSecond);
        
        String fecha = new SimpleDateFormat().format(date);
        
        System.out.println();
    }
}