package step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {

    @DisplayName("요구사항 1-1 : 1,2를 ,로 split() 했을 때 1과 2로 잘 분리되는지 테스트")
    @Test
    void splitTest1(){
        //given
        String sentence ="1,2";

        //when
        String[] data = sentence.split(",");

        //then
        assertThat(data).containsExactly("1","2");
    }

    @DisplayName("요구사항 1-2 : 1을 ,로 split() 했을 때 1만을 포함하는 배열이 반환되는지 테스트")
    @Test
    void splitTest2(){
        //given
        String sentence = "1";

        //when
        String[] data = sentence.split(",");

        //then
        assertThat(data).containsExactly("1");
    }

    @DisplayName("요구사항 2 : substring() 메소드를 이용하여 문자열의 괄호를 제거하는 테스트")
    @Test
    void subStringTest() {
        //given
        String sentence = "(1,2)";

        //when
        String result = sentence.substring(sentence.indexOf("(") + 1, sentence.indexOf(")"));

        //then
        assertThat(result).isEqualTo("1,2");
    }

    @DisplayName("요구사항 3 : charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 테스트")
    @Test
    void charAtTest(){
        //given
        String sentence = "abc";
        int index = 10;

        //then //when
        assertThatThrownBy(() -> sentence.charAt(index))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }

}