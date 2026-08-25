class Solution {
    public boolean hasDuplicate(int[] nums) {
        int end = nums.length - 1;

        Map<Integer, Integer> hashTable = new HashMap<>();
        for (int i : nums) {
            if (!hashTable.containsKey(i)) {
                hashTable.put(i, hashTable.getOrDefault(i, 0) + 1);
            } else {
                return true;
            }
        }
        return false;
    }
}