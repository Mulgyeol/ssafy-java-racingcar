package step1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SetUtilsTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("요구사항 1: size() 메소드를 활용해 Set의 크기를 확인하는 테스트")
    @Test
    void sizeTest() {
        //given
        int size = 3;

        //when
        int setSize = numbers.size();

        //then
        assertThat(setSize).isEqualTo(size);
    }

    @DisplayName("요구사항 2: contains() 메소드를 활용해 값이 존재하는지 확인하는 테스트")
    @ParameterizedTest(name = "{index}. Set에 {0}이 존재하는지 확인하는 테스트")
    @ValueSource(ints = {1, 2, 3})
    void containsTest(int value) {
        assertThat(numbers.contains(value)).isTrue();
    }

    @DisplayName("요구사항 3: contains() 메소드를 활용해 값이 존재하면 True, 존재하지 않으면 False를 반환하는 테스트")
    @ParameterizedTest(name = "{index}. contains() 메소드가 Set의 {0} 존재 여부를 제대로 반환하는지 확인하는 테스트")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void containsFalseTest(int value, boolean result) {
        //when
        boolean actualResult = numbers.contains(value);

        //then
        assertEquals(result, actualResult);
    }


}