package iosystem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryValidatorTest {

    @Test
    @DisplayName("정상적인 값 입력")
    void success() {
        // given
        String correctInput;
        correctInput = "123";

        //when, then
        assertDoesNotThrow(()-> TryValidator.validate(correctInput));
    }

    @Test
    @DisplayName("0이 포함된 입력")
    void inputThreeNumberWithZeroTest() {
        // given
        String inputThreeNumberWithZero = "120";

        // when
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> TryValidator.validate(inputThreeNumberWithZero));

        // then
        assertEquals("1~9사이의 숫자로만 이루어진 수를 입력할 수 있습니다.", exception.getMessage());
    }

    @Test
    @DisplayName("문자가 포함된 입력")
    void inputWithCharacterTest() {
        // given
        String inputWithCharacter = "12a";

        // when
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> TryValidator.validate(inputWithCharacter));

        // then
        assertEquals("1~9사이의 숫자로만 이루어진 수를 입력할 수 있습니다.", exception.getMessage());
    }
    @Test
    @DisplayName("4자리 숫자 입력")
    void inputFourNumberTest() {
        // given
        String inputFourNumber = "1234";

        // when
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> TryValidator.validate(inputFourNumber));

        // then
        assertEquals("3자리 수만 입력할 수 있습니다.", exception.getMessage());
    }

    @Test
    @DisplayName("중복되는 숫자 입력")
    void inputDuplicatedNumberTest() {
        // given
        String inputDuplicatedNumber = "133";

        // when
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> TryValidator.validate(inputDuplicatedNumber));

        // then
        assertEquals("자리수 간 중복된 수를 가질 수 없습니다.", exception.getMessage());
    }
}