package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {

  private final FirstMissingPositive firstMissingPositive;

  FirstMissingPositiveTest() {
    firstMissingPositive = new FirstMissingPositive();
  }

  @Test
  void testFirstMissingPositive1() {
    int[] nums = {1, 2, 0};
    int result = firstMissingPositive.firstMissingPositive(nums);
    assertEquals(3, result);
  }

  @Test
  void testFirstMissingPositive2() {
    int[] nums = {3, 4, -1, 1};
    int result = firstMissingPositive.firstMissingPositive(nums);
    assertEquals(2, result);
  }

  @Test
  void testFirstMissingPositive3() {
    int[] nums = {7, 8, 9, 11, 12};
    int result = firstMissingPositive.firstMissingPositive(nums);
    assertEquals(1, result);
  }

  @Test
  void testFirstMissingPositive4() {
    int[] nums = {1};
    int result = firstMissingPositive.firstMissingPositive(nums);
    assertEquals(2, result);
  }
}