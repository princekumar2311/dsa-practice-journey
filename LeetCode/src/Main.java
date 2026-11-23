import Arrays.LC0001_TwoSum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LC0001_TwoSum solution = new LC0001_TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}