package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {

  private final TwoSumII twoSumII;

  TwoSumIITest() {
    twoSumII = new TwoSumII();
  }

  @Test
  void testTwoSum1() {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;

    int[] result = twoSumII.twoSum(numbers, target);
    assertArrayEquals(new int[]{1, 2}, result);
  }

  @Test
  void testTwoSum2() {
    int[] numbers = {2, 3, 4};
    int target = 6;
    int[] result = twoSumII.twoSum(numbers, target);
    assertArrayEquals(new int[]{1, 3}, result);
  }

  @Test
  void testTwoSum3() {
    int[] numbers = {1, 3, 4, 5, 7, 11};
    int target = 9;
    int[] result = twoSumII.twoSum(numbers, target);
    assertArrayEquals(new int[]{3, 4}, result);
  }
}