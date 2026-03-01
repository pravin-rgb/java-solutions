package leetcode.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

  private final WordLadder wordLadder;

  WordLadderTest() {
    wordLadder = new WordLadder();
  }

  @Test
  void testLadderLength1() {
    String beginWord = "hit";
    String endWord = "cog";
    String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
    assertEquals(5, wordLadder.ladderLength(beginWord, endWord, List.of(wordList)));
  }

  @Test
  void testLadderLength2() {
    String beginWord = "hit";
    String endWord = "cog";
    String[] wordList = {"hot", "dot", "dog", "lot", "log"};
    assertEquals(0, wordLadder.ladderLength(beginWord, endWord, List.of(wordList)));
  }

  @Test
  void testLadderLength3() {
    String beginWord = "a";
    String endWord = "c";
    String[] wordList = {"a", "b", "c"};
    assertEquals(2, wordLadder.ladderLength(beginWord, endWord, List.of(wordList)));
  }
}