import java.util.HashMap;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                return new int[] { j, i };
            }
            map.put(key, i);

        }
        throw new IllegalArgumentException("No solution found");

    }

    public static void main(String[] args) {

        int[] arr = { -3, 1, 6, 90, 8, 3 };
        int target = 0;
        TwoSum ts = new TwoSum();
        arr = ts.twoSum(arr, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}