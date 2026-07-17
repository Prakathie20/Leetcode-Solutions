class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        long[] cnt = new long[max + 1];

        for (int x : nums) {
            cnt[x]++;
        }

        for (int i = 1; i <= max; i++) {
            long c = 0;
            for (int j = i; j <= max; j += i) {
                c += cnt[j];
            }
            cnt[i] = c * (c - 1) / 2;
        }

        for (int i = max; i >= 1; i--) {
            for (int j = i + i; j <= max; j += i) {
                cnt[i] -= cnt[j];
            }
        }

        for (int i = 1; i <= max; i++) {
            cnt[i] += cnt[i - 1];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = lowerBound(cnt, queries[i] + 1);
        }

        return ans;
    }

    private int lowerBound(long[] arr, long target) {

        int l = 1;
        int r = arr.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }
}