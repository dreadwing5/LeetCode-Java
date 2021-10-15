import java.util.HashSet;

class LongestSubString {

    public int lengthOfLongestSubSring(String s) {

        int n = s.length(), i = 0, j = 0, maxLength = 0;
        if (n == 0)
            return 0;
        HashSet<Character> hash_set = new HashSet<Character>();
        while (j < n) {
            if (!hash_set.contains(s.charAt(j))) {
                // unique character
                hash_set.add(s.charAt(j));
                maxLength = Math.max(maxLength, hash_set.size());
                j++;
            } else {
                // contains duplicate
                hash_set.remove(s.charAt(i)); // this take constant time
                i++;

            }

        }
        return maxLength;

    }

    public static void main(String[] args) {
        String s = "";
        LongestSubString ls = new LongestSubString();
        System.out.println(ls.lengthOfLongestSubSring(s));

    }

}