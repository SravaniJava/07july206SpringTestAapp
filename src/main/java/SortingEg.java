import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingEg {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(56);
        nums.add(456);
        Collections.sort(nums);
        System.out.println("sort example");
        System.out.println(nums);

    }
}
