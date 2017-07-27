public class ShowCurrentTime {
    public static void main(String[] args) {
	
	// Obtain total milliseconds since midnight, Jan 1, 1070 from method
	long totalMilliseconds = System.currentTimeMillis();

	long totalSeconds = totalMilliseconds / 1000;
	long currentSecond = totalSeconds % 60;

	// Obtain the total minutes
	long totalMinutes = totalSeconds / 60;
	long currentMinute = totalMinutes % 60;

	// Obtain the total hours
	long totalHours = totalMinutes / 60;
	long currentHour = (totalHours % 24) - 4;

	// Display results
	System.out.println("Current time is " + currentHour + ":" + currentMinute +
				":" + currentSecond + " EST");
	}
}