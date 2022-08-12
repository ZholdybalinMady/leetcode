import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        list.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());

        if (sorted.size() % 2 == 0) {
            int index = sorted.size() / 2;
            return (double) (sorted.get(index - 1) + sorted.get(index)) / 2;

        } else {
            int index = sorted.size() / 2;
            return sorted.get(index);
        }


    }
}
