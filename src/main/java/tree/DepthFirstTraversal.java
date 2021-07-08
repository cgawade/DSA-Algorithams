package tree;

public class DepthFirstTraversal {
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

        System.out.print("Preorder Traversal :  ");
        preOrder(bst.root);
        System.out.print("\nInorder Traversal :  ");
        inOrder(bst.root);
        System.out.print("\nPostorder Traversal :  ");
        postOrder(bst.root);
    }

    private static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data+ "->");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    private static void inOrder(Node root){
        if (root == null)
            return;

        inOrder(root.leftChild);
        System.out.print(root.data +"->");
        inOrder(root.rightChild);
    }

    private static void postOrder(Node root){
        if (root == null)
            return;

        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.data + "->");
    }

}
