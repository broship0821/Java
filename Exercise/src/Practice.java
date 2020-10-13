import java.sql.Date;
import java.time.LocalDate;

public class Practice {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.toString());
		
		System.out.println(Date.valueOf(date));

	}

}
