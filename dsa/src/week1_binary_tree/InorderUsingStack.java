package week1_binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderUsingStack {
    public List<Integer> inorderUsingStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left();
            }
            TreeNode temp = stack.pop();
            result.add(temp.value());
            node = temp.right();
        }
        return result;
    }
}
