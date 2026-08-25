class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] exist = new boolean[101];
        for (int num : nums)
            exist[num] = true;

        int num = k;
        while (num < 101) {
            if (!exist[num])
                return num;
            num += k;
        }
        return num;
    }
}