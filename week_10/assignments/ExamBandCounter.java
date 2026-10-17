import java.util.*;

public class ExamBandCounter {
    public static int countInBand(int[] scores, int low, int high) {
        int left = lowerBound(scores, low);
        int right = upperBound(scores, high);
        return right - left;
    }

    private static int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    private static int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] scores1 = {35,42,42,50,58,58,58,63,71,88};
        System.out.println(countInBand(scores1,42,58)); 
        System.out.println(countInBand(scores1,90,100)); 
    }
}
