
/**
* @author Patcharee Catherina Jirakittiyakhon
*/


public class LongInteger {
    // Private data field to store the long value
    private long value;

    // Constructor to initialize LongInteger object with a long value
    public LongInteger(long value) {
        this.value = value;
    }

    // Method to return the stored value
    public long toLong() {
        return value;
    }

    // Instance methods to check even, odd, and prime
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    // Static methods to check even, odd, and prime
    public static boolean isEven(long num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(long num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Instance methods to check equality
    public boolean equals(long num) {
        return this.value == num;
    }

    public boolean equals(LongInteger other) {
        return this.value == other.value;
    }

    // Static method to parse a string into a long value
    public static long parseLong(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: empty string");
        }

        int startIndex = 0;
        boolean isNegative = false;
        long result = 0;

        // Check for negative sign
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                throw new IllegalArgumentException("Invalid input: only '-' present");
            }
            isNegative = true;
            startIndex = 1;
        }

        // Parse each character
        for (int i = startIndex; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new IllegalArgumentException("Invalid input: contains non-digit characters");
            }
            
            int digit = ch - '0';
            
            // Check for overflow and underflow
            if (result > (Long.MAX_VALUE - digit) / 10) {
                throw new IllegalArgumentException("Number out of range for long type");
            }
            
            result = result * 10 + digit;
        }

        return isNegative ? -result : result;
    }
}
