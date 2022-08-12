import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        int[] source = {3,2,4};
        int sum = 6;
        twoSum(source, sum);
    }

    public static int[] twoSum(int[] nums, int target) {
        //TODO REDO brut force
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
     return list.stream().mapToInt(integer -> integer).toArray();
    }
}
