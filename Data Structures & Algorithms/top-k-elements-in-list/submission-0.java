class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countsTable = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            countsTable.put(n, countsTable.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countsTable.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());    
        }      

        int[] answer = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                answer[index++] = n;
                if (index == k) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
