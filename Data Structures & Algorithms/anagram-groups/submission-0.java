class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> groups = new HashMap<>();

        for(int i=0 ; i < strs.length; i++){
            String s = strs[i];
            groups.computeIfAbsent(getFreqArrayKey(s), k-> new ArrayList<>()).add(s);
        }
        for(List<String> str : groups.values()){
            result.add(new ArrayList<>(str));
        }

        return result;
    }

    public String getFreqArrayKey(String s){

        int[] freqArr = new int[26];
        for(int i=0; i < s.length(); i++){
            freqArr[s.charAt(i) -'a']++;
        }
        return Arrays.toString(freqArr);
    }
}
