class PeakElement {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        if (nums.length == 0)
            return -1;
        if (nums.length == 1 || nums[i] > nums[i + 1])
            return i;
        if (nums[j] > nums[j - 1])
            return j;

        return peakElements(i, j, nums);
    }

    public int peakElements(int low, int high, int[] nums) {
        int mid = low + (high - low) / 2;
        if (low >= 0 && high <= nums.length - 1) {
            if (nums[mid] >= nums[mid - 1] && nums[mid] >= nums[mid + 1]) {
                return mid;

            } else if (nums[mid] < nums[mid - 1])
                return peakElements(low, mid, nums);
            else {
                return peakElements(mid, high, nums);
            }

        }
        return mid;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 3, 2, 1 };
        PeakElement pe = new PeakElement();
        System.out.println(pe.findPeakElement(nums));
    }
}