package week1_binary_tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public List<Integer> postorder(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(node, result);
        return result;
    }

    public void postOrderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left(), result);
        postOrderTraversal(node.right(), result);
        result.add(node.value());
    }
}
