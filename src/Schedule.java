import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class Schedule {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] courses = {{"CEN 411", "Mon 7:00"}, {"CEN 412", "Tue 11:00"}, {"CEN 414", "Wed 12:00"}, {"CEN 415", "Thur 1:00"} };
        System.out.println("Enter course title: ");
        String answer = scan.next();

        for (int i = 0; i < 2; i++){
            for (int j = 0; j<5; j++) {
                if (answer.equals(courses[i][1]))
                    System.out.println(courses[i][1]);
//                else
//                    System.out.println("Error course unavailable");
            }
        }

    }
}
