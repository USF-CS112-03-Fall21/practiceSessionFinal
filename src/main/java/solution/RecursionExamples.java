package solution;

public class RecursionExamples {

    /** Compute x to the power of n, recursively, using the formulas below */
    public static double power(int x, int n) {
        // recursively compute x^n using the following recursive definition
        // if n > 0 and is even, x^n = x^(n/2) * x^(n/2)
        // for example, x^4 = x^2 * x^2
        // if n > 0 and is odd, x^n = x * x^(n/2) * x^(n/2)
        // For example, x^5 = x * x^2 * x^2
        // if n < 0, throw an exception  - no need to handle it for this practice session

        // n = 0 is the base case. What will you return in this case?
        if (n < 0)
            throw new IllegalArgumentException();
        else if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return power(x, n/2) * power(x, n/2);
        else // odd
            return x* power(x, n/2) * power(x, n/2);
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
        if (string.length() == 0)
            return false;
        if (string.startsWith(substring))
            return true;
        else
            return contains(string.substring(1, string.length()), substring);

    }

    public static void main(String[] args) {
        // Test the power method
        System.out.println(power(3, 4));    // 81
        System.out.println(power(2, 5));   // 32
        
        // Test the contains method:
        String s = "Hello, world, hello!";
        System.out.println(contains(s, "world")); // true
        System.out.println(contains(s, "old")); // false




    }
}
