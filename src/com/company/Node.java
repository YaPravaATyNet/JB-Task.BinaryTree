package com.company;

public class Node {
    public StringBuilder value;
    public Node left;
    public Node right;

    Node(StringBuilder value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder res = value;
        if (left != null) {
            res.append(" " + left.toString());
        }
        if (right != null) {
            res.append(" " + right.toString());
        }
        return res.toString();
    }
}

