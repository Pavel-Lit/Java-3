import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {



    @Test
    void numberAfterFourExceptions() {
        Assertions.assertThrows(RuntimeException.class, () -> HomeWork.numberAfterFour(new int[]{1, 2, 3}));
    }
    @Test
    void numberAfterFour1() {
        Assertions.assertArrayEquals(new int[] {5,6}, HomeWork.numberAfterFour(new int[]{1,2,3,4,5,6}));
    }
    @Test
    void numberAfterFour2() {
        Assertions.assertArrayEquals(new int[] {5,6}, HomeWork.numberAfterFour(new int[]{4,4,4,4,5,6}));
    }
    @Test
    void numberAfterFour3() {
        Assertions.assertArrayEquals(new int[] {}, HomeWork.numberAfterFour(new int[]{1,2,3,4,5,4}));
    }
    @Test
    void haveOneAndFour1(){
        Assertions.assertTrue(HomeWork.haveOneAndFour(new int[]{1,1,1,1,1,1}));
    }
    @ParameterizedTest
    @MethodSource("arraysForHaveTest")
    void massHaveOneAndFour(int[] someArray){
        Assertions.assertTrue(HomeWork.haveOneAndFour(someArray));

    }
    public static Stream<Arguments> arraysForHaveTest() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1,1,1,1,1,1,4}));
        list.add(Arguments.arguments(new int[]{1,2,3,4}));
        list.add(Arguments.arguments(new int[]{1,1,1,4,4,4,4}));
        return list.stream();
    }

}