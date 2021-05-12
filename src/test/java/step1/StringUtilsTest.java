package step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {

    @DisplayName("요구사항 1 : split 테스트")
    @Test
    void splitTest(){
        //given
        String sentence ="1,2";
        String sentence2 = "1";

        //when
        String[] data = sentence.split(",");
        String[] data2 = sentence2.split(",");

        //then
        assertThat(data).containsExactly("1","2");
        assertThat(data2).containsExactly("1");
    }

    @DisplayName("요구사항 2 : substring 테스트")
    @Test
    void subStringTest() {
        //given
        String sentence = "(1,2)";

        //when
        String result = sentence.substring(sentence.indexOf("(") + 1, sentence.indexOf(")"));

        //then
        assertThat(result).isEqualTo("1,2");
    }

    @DisplayName("요구사항 3 : charAt 테스트")
    @Test
    void charAtTest(){
        //given
        String sentence = "abc";
        int index = 10;

        //then //when
        assertThatThrownBy(() -> { sentence.charAt(index); })
                .isInstanceOf(IndexOutOfBoundsException.class);
    }

}