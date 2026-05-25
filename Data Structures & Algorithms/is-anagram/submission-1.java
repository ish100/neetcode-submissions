class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqArrayS = new int[26];
        int[] freqArrayT = new int[26];
        Arrays.fill(freqArrayS,0);
        Arrays.fill(freqArrayT,0);
        for(int i=0; i < s.length();i++){
            freqArrayS[s.charAt(i) - 'a']++;
        }
        for(int i=0; i < t.length();i++){
            freqArrayT[t.charAt(i) - 'a']++;
        }
        return Arrays.equals(freqArrayS, freqArrayT);
    }
}
