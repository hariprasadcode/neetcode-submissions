
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        // Store nums1 elements
        for (int x : nums1) {
            set1.add(x);
        }

        // Check common elements
        for (int x : nums2) {
            if (set1.contains(x)) {
                ans.add(x);
            }
        }

        // Convert HashSet to array
        int[] result = new int[ans.size()];
        int i = 0;

        for (int x : ans) {
            result[i] = x;
            i++;
        }

        return result;
    }
}