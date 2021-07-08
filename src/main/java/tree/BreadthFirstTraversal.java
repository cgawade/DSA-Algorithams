package tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstTraversal {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(3);
        bst.insert(1);
        bst.insert(7);
        bst.insert(0);
        bst.insert(2);
        bst.insert(100);

        breadthFirst(bst.root);
    }

    private static void breadthFirst(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedBlockingQueue<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.data);

            if (node.getLeftChild() != null)
                queue.add(node.leftChild);

            if (node.getRightChild() != null)
                queue.add(node.rightChild);
        }
    }


}
