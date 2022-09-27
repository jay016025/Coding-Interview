package idv.jay.codingInterview.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SetMatrixZerosTest {

    @Test
    @DisplayName("測試方法一(暴力解)")
    void testSetMatrixZerosByAdditionMemory() {
        // Arrange
        int [][] input = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int [][] expected = {
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
        };

        // ACK
        SetMatrixZeros.setZeroesByAdditionalMemory(input);

        // Assert
        Assertions.assertAll(() -> {
            for (int i = 0; i < expected.length; i++) {
                Assertions.assertTrue(Arrays.equals(expected[i], input[i]));
            }
        });
    }

    @Test
    @DisplayName("測試方法二(節省空間)")
    void testSetMatrixZerosByEfficient() {
        // Arrange
        int [][] input = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        int [][] expected = {
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
        };

        // ACK
        SetMatrixZeros.setZeroByEfficient(input);

        // Assert
        Assertions.assertAll(() -> {
            for (int i = 0; i < expected.length; i++) {
                Assertions.assertTrue(Arrays.equals(expected[i], input[i]));
            }
        });
    }

}
