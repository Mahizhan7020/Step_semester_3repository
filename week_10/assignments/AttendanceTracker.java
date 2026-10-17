import java.util.*;
public class AttendanceTracker {
    public static void attendanceSummary(int[] days) {
        int present = 0, longest = 0, current = 0;
        for (int d : days) {
            if (d == 1) {
                present++;
                current++;
                if (current > longest) longest = current;
            } else {
                current = 0;
            }
        }
        System.out.println("Present: " + present + ", Longest streak: " + longest);
    }
    public static void main(String[] args) {
        int[] days1 = {1,1,0,1,1,1,0,1};
        int[] days2 = {0,0,0};
        attendanceSummary(days1);
        attendanceSummary(days2);
    }
}
