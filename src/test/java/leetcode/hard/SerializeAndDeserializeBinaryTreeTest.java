package leetcode.hard;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBinaryTreeTest {

  private final SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree;

  SerializeAndDeserializeBinaryTreeTest() {
    serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();
  }

  @Test
  void testSerializeAndDeserialize1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);

    String serialized = serializeAndDeserializeBinaryTree.serialize(root);
    TreeNode deserializedRoot = serializeAndDeserializeBinaryTree.deserialize(serialized);

    assertTrue(isSameTree(root, deserializedRoot));
  }

  @Test
  void testSerializeAndDeserializeLeftSkewedTree() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);

    String serialized = serializeAndDeserializeBinaryTree.serialize(root);
    TreeNode deserializedRoot = serializeAndDeserializeBinaryTree.deserialize(serialized);

    assertTrue(isSameTree(root, deserializedRoot));
  }

  @Test
  void testSerializeAndDeserializeRightSkewedTree() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);

    String serialized = serializeAndDeserializeBinaryTree.serialize(root);
    TreeNode deserializedRoot = serializeAndDeserializeBinaryTree.deserialize(serialized);

    assertTrue(isSameTree(root, deserializedRoot));
  }

  @Test
  void testSerializeAndDeserializeSingleNode() {
    TreeNode root = new TreeNode(1);

    String serialized = serializeAndDeserializeBinaryTree.serialize(root);
    TreeNode deserializedRoot = serializeAndDeserializeBinaryTree.deserialize(serialized);

    assertTrue(isSameTree(root, deserializedRoot));
  }

  @Test
  void testSerializeAndDeserializeEmptyTree() {
    TreeNode root = null;

    String serialized = serializeAndDeserializeBinaryTree.serialize(root);
    TreeNode deserializedRoot = serializeAndDeserializeBinaryTree.deserialize(serialized);

    assertTrue(isSameTree(root, deserializedRoot));
  }

  private boolean isSameTree(TreeNode root, TreeNode deserializedRoot) {
    if (root == null && deserializedRoot == null) {
      return true;
    }
    if (root == null || deserializedRoot == null) {
      return false;
    }
    if (root.val != deserializedRoot.val) {
      return false;
    }
    return isSameTree(root.left, deserializedRoot.left) && isSameTree(root.right, deserializedRoot.right);
  }
}