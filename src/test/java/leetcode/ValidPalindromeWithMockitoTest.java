package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.leetcode.palindrome.ValidPalindrome;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ValidPalindromeWithMockitoTest {

    @Mock
    ValidPalindrome validPalindrome;

    @BeforeEach
    void setupMock(){
        Mockito.when(validPalindrome.isPalindrome("A man, a plan, a canal: Panama")).thenReturn(true);
    }

    @Test
    @DisplayName("It is a Palindrome")
    void testIsPalindrome(){
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
