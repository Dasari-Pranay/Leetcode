import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find next greater element for every element in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove elements smaller than or equal to current
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            // Top is the next greater element
            if (!stack.isEmpty()) {
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        // Get answers for nums1
        for (int i = 0; i < n; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}