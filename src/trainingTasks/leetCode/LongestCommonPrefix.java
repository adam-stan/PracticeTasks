package trainingTasks.leetCode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String prefix = "";

        for (int j = 0; j < strs[0].length(); j++) {

            for (int i = 0; i < strs.length - 1; i++) {

                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    return prefix;
                }
                if(i == strs.length -2) {
                    prefix = prefix + strs[i].charAt(j);
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "fliw", "floght"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
