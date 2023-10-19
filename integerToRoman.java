class Solution {
    public String intToRoman(int num) {
    String[] notation = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    StringBuilder roman = new StringBuilder();
    int i = 0;
    while (num > 0) {
        while (num >= value[i]) {
            roman.append(notation[i]);
            num -= value[i];
        }
        i++;
    }
    return roman.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int num1 = 3;
        String result1 = solution.intToRoman(num1);
        System.out.println("Input: " + num1 + " => Output: " + result1);

        int num2 = 58;
        String result2 = solution.intToRoman(num2);
        System.out.println("Input: " + num2 + " => Output: " + result2);
    }
}