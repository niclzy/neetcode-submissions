class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();

        for (String s: strs) {
            int[] count = new int[26];

            for (char c: s.toCharArray()) {
                count[c - 'a']++; // swapping 'a' for 97 also works
            }

            String key = Arrays.toString(count);
            hash.putIfAbsent(key, new ArrayList<>());
            hash.get(key).add(s);
        }
        return new ArrayList<>(hash.values());     
    }
}
