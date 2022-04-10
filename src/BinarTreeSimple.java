public class BinarTreeSimple {
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

        Node root;
        BinarTreeSimple(int key)
        {
            root = new Node(key);
        }

        BinarTreeSimple()
        {
            root = null;
        }

        public static void main(String[] args)
        {
            BinarTreeSimple tree = new BinarTreeSimple();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
        }
//
}
