class Solution {
    public boolean isAnagram(String s, String t) {
        int counts[] = new int[26];

        for(char letter : s.toCharArray()){
            counts[letter - 'a']++;
        }
        for (char letter : t.toCharArray()){
            counts[letter - 'a']--;
        }

        for (int count : counts) {
    if (count != 0) {
        return false;
    }
}
return true;
    }
}
