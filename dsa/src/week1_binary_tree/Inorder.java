package week1_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Inorder {

    public List<Integer> inorder(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(node, result);
        return result;
    }

    public void inOrderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left(), result);
        result.add(node.value());
        inOrderTraversal(node.right(), result);
    }
}
