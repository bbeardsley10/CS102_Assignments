package Assignment08;


/**
 * BinarySearchTree
 */
public class BinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.insert(5);
        myTree.insert(3);
        myTree.insert(2);
        myTree.insert(4);
        myTree.insert(6);
        myTree.insert(7);
        myTree.properOrder();
        myTree.removeKey(3);
        System.out.println();
        System.out.println();
        System.out.println("Tree with the Key 3 is removed");
        myTree.properOrder();
    }


    //Class that sets up the tree with left and right 
    class Node {
        int key;
        Node left;
        Node right;

        public Node (int num){
            key = num;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {root = null;}

    //Recursive function that inserts a new key in the Binary Search Tree
    void insert(int key) { root = insertNode(root, key); }

    Node insertNode(Node root, int key){


        if(root == null){
            root = new Node(key);
            return root;
       }
       //Follows down the tree path and sets the values
       if (key < root.key){
        root.left = insertNode(root.left, key);
       }
       else if(key > root.key){
        root.right = insertNode(root.right, key);
       }
       return root;
    }

    //Functions that displays the correct order of the Binary Search Tree
    void properOrder() { nodeInOrder(root);}

    void nodeInOrder(Node root){
        if( root != null){
            nodeInOrder(root.left);
            System.out.print(root.key + " ");
            nodeInOrder(root.right);
        }
    }

    //Functions that removes an existing key in the Binary Search Tree
    void removeKey(int key) { root = removeNode(root, key); }


    Node removeNode(Node root, int key)
    {
        if(root == null)
        {
            return root.right;
        }

        //Goes down the tree correctly checking the keys of the roots
        if(key < root.key){
            root.left = removeNode(root.left, key);
        }else if(key > root.key){
            root.right = removeNode(root.right, key);
        }
        
        //Checks to see if the key is the same as the key currently in the root 

        else{

            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            //Gets the children and sets the value to the smallest in the right 
            root.key = minimumValue(root.right);

            //Removes the smallest key on the right
            root.right = removeNode(root.right, root.key);
        }
        

        return root;
    }   


    int minimumValue(Node root)
    {
        int minValue = root.key;
        while(root.left != null) {
            minValue = root.left.key;
            root = root.left;
        
        }
        return minValue;
    }
    

}
