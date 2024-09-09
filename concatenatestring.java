public class concatenatestring {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String modified = doubled.substring(1, doubled.length() - 1);
        return modified.contains(s);
    }

    public static void main(String[] args) {
        concatenatestring solution = new concatenatestring();
        
        // Test cases
        System.out.println(solution.repeatedSubstringPattern("pqpq")); // true
        // System.out.println(solution.repeatedSubstringPattern("aba")); // false
        // System.out.println(solution.repeatedSubstringPattern("abcabcabcabc")); // true
    }
}

