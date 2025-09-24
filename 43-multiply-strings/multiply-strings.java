public class Solution {
    public String multiply(String num1, String num2) {
        // Handle edge cases
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];
        
        // Multiply each digit from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];
                
                result[i + j + 1] = sum % 10;        // Current digit
                result[i + j] += sum / 10;           // Carry to next position
            }
        }
        
        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}