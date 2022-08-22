package com.zoolatech.lecture4.tasks._2;

public class BinarySearchTree {
    private Node rootNode;
    public BinarySearchTree () {
        rootNode = null;
    }

    private static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;
        public Node (int value) {
            this.value = value;
            leftChild = null;
            rightChild = null;
        }
    }

    private void addRecursive (Node current, int value) {
        if (current.value < value) {
            if (current.rightChild == null) {
                current.rightChild = new Node(value);
            } else {
                addRecursive(current.rightChild, value);
            }
        } else if (current.value > value) {
            if (current.leftChild == null) {
                current.leftChild = new Node(value);
            } else {
                addRecursive(current.leftChild, value);
            }
        }
    }

//    private Node addRecursive(Node current, int value) {
//        if (current == null) {
//            return new Node(value);
//        }
//        if (value < current.value) {
//            current.leftChild = addRecursive(current.leftChild, value);
//        } else if (value > current.value) {
//            current.rightChild = addRecursive(current.rightChild, value);
//        }
//        return current;
//    }
    public void add(int value) {
        if (rootNode == null) {
            rootNode = new Node(value);
        } else {
            addRecursive(rootNode, value);
        }
    }

}