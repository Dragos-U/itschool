package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.leetcode.palindrome.ValidPalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    @Test
    @DisplayName("The string is palindrome")
    void testIsPalindrome(){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
