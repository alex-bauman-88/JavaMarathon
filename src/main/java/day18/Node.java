package day18;

public class Node {
    private int number;
    private Node leftNode;
    private Node rightNode;

    public Node(int number) {
        this.number = number;
        leftNode = null;
        rightNode = null;
    }

    public int getNumber() {
        return number;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
