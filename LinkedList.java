package com.bridgelabz.linkedlist;

public class LinkedList <A>{
    public Node<A> headNode = null;
    public Node<A> tailNode = null;
    public Node<A> tempNode = null;
    private Node<A> prevNode = null;

    //create methode for adding data in node
    public void add(Node<A> newNode) {
        if (headNode == null && tailNode == null && tempNode == null) {
            headNode = newNode;    // headNode =  fistNode value store
            tailNode = newNode;    // tailNode = fistNode value store
            tempNode = newNode;    // tempNode = fistNode value store

        } else {
            // for second or next node
            tempNode.setNextNode(newNode);
            tailNode = newNode;
            tailNode.setNextNode(null);
            tempNode = newNode;
        }
        System.out.println("HeadNode Data = " +headNode.getData());
        System.out.println("TailNode Data = " +tempNode.getData());

    }
    public void pop(A dataToBeRemoved) {
        if (headNode == null && tailNode == null && tailNode == null) {
            return;
        }
        Node<A> currNode = headNode;
        prevNode = headNode;

        if (dataToBeRemoved == currNode.getData()) {
            headNode = currNode.getNextNode();
            currNode.setNextNode(null);
        }
        while (dataToBeRemoved != currNode.getData()) {
            prevNode = currNode;
            currNode = currNode.getNextNode();
        }
        prevNode.setNextNode(currNode.getNextNode());
        currNode.setNextNode(null);

    }

    //method for insert in between

    public void insert(Node<A> newNodeToBeInserted, int position) {
        int index = 0;

        Node<A> currNode = headNode;

        while (index < position -2) {
            currNode = currNode.getNextNode();
            index++;
        }

        Node<A> nextNode = currNode.getNextNode();

        newNodeToBeInserted.setNextNode(nextNode);

        currNode.setNextNode(newNodeToBeInserted);
    }

}
