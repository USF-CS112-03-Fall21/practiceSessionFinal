package problems.strings;

public class StringUtil {

    /**
     * Write a recursive method that checks whether a given string contains a given substring.
     * You may only use the following in-built methods of class String:
     * boolean startsWith(String s) and String substring(int index1, int index2).
     * @param string a given string
     * @param substring a given substring
     * @return true if the a string contains a given substring and false otherwise
     */
    public static boolean contains(String string, String substring) {
        // FILL IN CODE

        return true; // edit
    }

    public static void main(String[] args) {
        // Test the contains method:
        String s = "Hello, world, hello!";
        System.out.println(solution.StringUtil.contains(s, "world")); // true
        System.out.println(solution.StringUtil.contains(s, "old")); // false


    }
}
