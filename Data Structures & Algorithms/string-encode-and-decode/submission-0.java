class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int sliderStart = 0;
        while (sliderStart < str.length()) {
            int sliderEnd = sliderStart;
            while (str.charAt(sliderEnd) != '#') {
                sliderEnd++;
            }
            int subStringLength = Integer.parseInt(str.substring(sliderStart, sliderEnd));
            sliderStart = sliderEnd + 1;
            sliderEnd = sliderStart + subStringLength;
            decoded.add(str.substring(sliderStart, sliderEnd));
            sliderStart = sliderEnd;
        }
        return decoded;
    }
}
