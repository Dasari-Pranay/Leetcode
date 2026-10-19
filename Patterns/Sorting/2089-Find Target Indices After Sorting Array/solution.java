import java.util.Arrays;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int targetcnt = 0;
        int small = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == target)
                targetcnt++;
            if(nums[i] < target)
                small++;
        }
        if(targetcnt == 0) return list;
        for(int i = 0 ; i < targetcnt; i++)
            list.add(small + i);
        return list;
    }
}