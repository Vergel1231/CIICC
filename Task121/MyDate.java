package Task121;
import Task121.DateTask;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();

        date1.setDate(1, 1, 1970);
        date2.setDate(9, 21, 1984);

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        DateTask.leapYears();
    }
}