package week1_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public List<Integer> preorder(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(node, result);
        return result;
    }

    public void preOrderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.value());
        preOrderTraversal(node.left(), result);
        preOrderTraversal(node.right(), result);
    }
}
