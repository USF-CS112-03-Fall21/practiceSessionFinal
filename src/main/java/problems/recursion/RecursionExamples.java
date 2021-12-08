package problems.recursion;

public class RecursionExamples {

    /** Compute x to the power of n, recursively, using the formulas below */
    public static double power(int x, int n) {
        double result = 0;
        // recursively compute x^n using the following recursive definition
        // if n > 0 and is even, x^n = x^(n/2) * x^(n/2)
        // for example, x^4 = x^2 * x^2
        // if n > 0 and is odd, x^n = x * x^(n/2) * x^(n/2)
        // For example, x^5 = x * x^2 * x^2
        // if n < 0, throw an exception  - no need to handle it for this practice session

        // n = 0 is the base case. What will you return in this case?

        return result;
    }

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
        // Test the power method
        System.out.println(power(3, 4));    // 81
        System.out.println(power(2, 5));   // 32
        
        // Test the contains method:
        String s = "Hello, world, hello!";
        System.out.println(solution.StringUtil.contains(s, "world")); // true
        System.out.println(solution.StringUtil.contains(s, "old")); // false




    }
}
