package tree;

class BinarySearchTree {

    // Represents the root of binary tree
    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {

        // Create a new node
        Node newNode = new Node(data);

        // Check whether tree is empty
        if (root == null) {
            root = newNode;
            return;
        } else {
            Node current = root;
            Node parent = null;

            while (true) {
                parent = current;

                // Data is less than the current's data, node will be inserted to the left of tree
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    public Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        } else {
            if (root.data < value)
                root.rightChild = deleteNode(root.rightChild, value);

            else if (root.data > value)
                root.leftChild = deleteNode(root.leftChild, value);

            else {
                // if node to be deleted has no child then, set the node to null
                if (root.leftChild == null && root.rightChild == null) {
                    root = null;
                }

                // if node to be deleted has only one left child
                else if (root.rightChild == null) {
                    root = root.leftChild;
                }

                // if node to be deleted has only one right child
                else if (root.leftChild == null)
                    root = root.rightChild;

                else {
                    // If node to be deleted has both left and right child
                    Node temp = minNode(root.rightChild);

                    root.data = temp.data;

                    root.rightChild = deleteNode(root.rightChild, temp.data);
                }
            }
            return root;
        }
    }

    public Node minNode(Node root) {
        if (root.leftChild != null)
            return minNode(root.leftChild);
        else
            return root;
    }

    public Node maxNode(Node root) {
        if (root.rightChild != null) {
            return maxNode(root.rightChild);
        } else
            return root;
    }

    // Display tree
    public void inOrderTraversal(Node root) {
        // check whether tree is empty
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        if (root.leftChild != null)
            inOrderTraversal(root.leftChild);

        System.out.println(root.data + " ");

        if (root.rightChild != null)
            inOrderTraversal(root.rightChild);

    }

    // Display in different order
    public void display(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        System.out.println(root.data + " ");

        if (root.leftChild != null)
            display(root.leftChild);

        if (root.rightChild != null)
            display(root.rightChild);
    }

    public boolean search(int data) {
        Node current = root;

        while (true) {
            if (current == null)
                return false;
            else if (data == current.data)
                return true;
            else if (data < current.data)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
    }

    public boolean searchV1(Node root, int data){
        if (root == null)
            return false;

        if (root.data == data)
            return true;

        if (data < root.data)
            return searchV1(root.getLeftChild(), data);
        else
            return searchV1(root.getRightChild(), data);
    }

    public int maxDepth(Node root){
        if (root == null)
            return 0;

        if (root.leftChild == null && root.rightChild == null)
            return 0;

        int leftMaxDepth = 1 + maxDepth(root.getLeftChild());
        int rightMaxDepth = 1 + maxDepth(root.getLeftChild());

        return Math.max(leftMaxDepth, rightMaxDepth);
    }

    public void mirrorTree(Node root){
        Node current = root;

        if (current == null)
            return;

        mirrorTree(current.rightChild);
        mirrorTree(current.leftChild);

        Node temp = current.getLeftChild();
        current.setLeftChild(current.getRightChild());
        current.setRightChild(temp);
    }

    public Node lowestCommonAncestor(Node root, int n1, int n2){
        if (root == null)
            return null;

        if (n1 < root.data && n2 < root.data)
            return lowestCommonAncestor(root.getLeftChild(), n1 , n2);
        else if (n1 > root.data && n2 > root.data)
            return lowestCommonAncestor(root.getRightChild(), n1, n2);

        return root;
    }
}

public class BinarySearchTreeDemo {
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


        //display the tree
        bst.inOrderTraversal(bst.root);
        //bst.display(bst.root);

        Node node = bst.minNode(bst.root);
        System.out.println("Minimum node " + node.data);

        node = bst.maxNode(bst.root);
        System.out.println("Maximum Node " + node.data);

        System.out.println("Maximum depth of tree is : "+ bst.maxDepth(bst.root));
        bst.deleteNode(bst.root, 0);
        bst.deleteNode(bst.root, 1);
        //bst.deleteNode(bst.root, 5);


        bst.inOrderTraversal(bst.root);

        System.out.println("is element present in tree : " + bst.search(5));
        System.out.println("is element present in tree : " + bst.searchV1(bst.root, 3));

        //bst.mirrorTree(bst.root);
        //bst.inOrderTraversal(bst.root);


        System.out.println(bst.root.data);
        node = bst.lowestCommonAncestor(bst.root, 0,100);
        System.out.println("Lowest Common Ancestor : "+ node.data);
    }

}
