package ru.mentee.power;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Тесты для палиндрома")
class PalindromeCheckerTest {

    private final PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    @DisplayName("Проверка одиночного слова на палиндром")
    void checkOneWordForPalindrome(){
       assertThat(palindromeChecker.isPalindrome("Шалаш"))
               .isTrue();
    }

    @Test
    @DisplayName("Проверка двух слов на палиндром")
    void checkTwoWordsPalindrome(){
        assertThat(palindromeChecker.isPalindrome("Lonely Tylenol"))
                .isTrue();
    }

    @Test
    @DisplayName("Проверка предложения на палиндром")
    void checkSentenceForPalindrome(){
        assertThat(palindromeChecker.isPalindrome("A dog! A panic in a pagoda!"))
                .isTrue();
    }
}