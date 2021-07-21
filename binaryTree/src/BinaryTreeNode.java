public class BinaryTreeNode {
    BinaryTreeNode left, right;
    int data;

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    public void insertElement(int value) {
        if (value <= data){
            if (left == null){
                left = new BinaryTreeNode(value);
            } else {
                left.insertElement(value);
            }
        } else {
            if (right == null){
                right = new BinaryTreeNode(value);
            } else {
                right.insertElement(value);
            }
        }
    }
}