class Solution {
    public List<List<Integer>> fourSum(int[] n, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(n);
        int ne = n.length;

        for (int i = 0; i < ne - 3; i++) {

            if (i > 0 && n[i] == n[i - 1]) continue;

            for (int j = i + 1; j < ne - 2; j++) {

                if (j > i + 1 && n[j] == n[j - 1]) continue;

                int k = j + 1;
                int l = ne - 1;

                while (k < l) {

                    long sum = (long)n[i] + n[j] + n[k] + n[l];

                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        res.add(Arrays.asList(n[i], n[j], n[k], n[l]));
                        k++;
                        l--;

                        while (k < l && n[k] == n[k - 1]) k++;
                        while (k < l && n[l] == n[l + 1]) l--;
                    }
                }
            }
        }
        return res;
    }
}
