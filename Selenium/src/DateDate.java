import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDate 
{
	public static void main(String[] args) 
	{
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String currentDate = df.format(date).toString();
		System.out.println(currentDate);
	}
}
