package DSA.Tree.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }
}

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> listOfLevels = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return listOfLevels;
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                level.add(queue.poll().val);
            }
            listOfLevels.add(level);
        }
        return listOfLevels;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        LevelOrderTraversal l = new LevelOrderTraversal();
        List<List<Integer>> traversed = l.levelOrder(root);

        for (int i = 0; i < traversed.size(); i++) {
            if (i < traversed.size() - 1) {
                System.out.print(traversed.get(i) + "->");
            } else {
                System.out.print(traversed.get(i));
            }
        }
    }
}
