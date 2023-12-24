import java.util.Arrays;

public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < firstStr.length(); i++) {
            if (i < lastStr.length() && firstStr.charAt(i) == lastStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }
    public static void main(String[] args) {

}
}

