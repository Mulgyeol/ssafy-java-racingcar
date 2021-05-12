package step1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

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

    @DisplayName("요구사항 1: size 테스트")
    @Test
    void sizeTest() {
        //given
        int size = 3;

        //when
        int setSize = numbers.size();

        //then
        assertThat(setSize).isEqualTo(size);
    }

    @DisplayName("요구사항 2: contains 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void containsTest(int value) {
        assertThat(numbers.contains(value)).isTrue();
    }


}