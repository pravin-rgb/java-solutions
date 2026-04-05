package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

  private final SlidingWindowMaximum slidingWindowMaximum;

  SlidingWindowMaximumTest() {
    slidingWindowMaximum = new SlidingWindowMaximum();
  }

  @Test
  void testMaxSlidingWindow1() {
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    int[] result = slidingWindowMaximum.maxSlidingWindow(nums, k);
    assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, result);
  }

  @Test
  void testMaxSlidingWindow2() {
    int[] nums = {2, 7, 3, 1, 6, 2, 5, 8, 1, 4};
    int k = 4;
    int[] result = slidingWindowMaximum.maxSlidingWindow(nums, k);
    assertArrayEquals(new int[]{7, 7, 6, 6, 8, 8, 8}, result);
  }
}