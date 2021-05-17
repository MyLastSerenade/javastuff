import java.util.Calendar;

public class calendertest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.printf("%tb %te, %tY%n",c ,c, c);
		System.out.format("%tb %te, %tY%n",c ,c, c);
		System.out.format("%,7d%n" , 1234567890);
	}
}
