class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Calculate prefix products
        // output[i] will store the product of all elements to the left of i
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix products on the fly and multiply
        // postfix tracks the product of all elements to the right of i
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * postfix;
            postfix *= nums[i];
        }

        return output;
    }
}