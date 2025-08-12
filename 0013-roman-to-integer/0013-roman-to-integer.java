class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> table = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );

        int result = 0;
        for(int i = 0; i < s.length(); i++){
            int curr = table.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? table.get(s.charAt(i + 1)) : 0;

            if(curr < next) result -= curr;
            else result += curr;
        }
        return result;
    }
}