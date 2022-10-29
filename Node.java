package com.bridgelabz.linkedlist;

public class Node <A>{
    private A data;

    private Node<A> nextNode;
    public Node(A data) {
        this.data = data;
        // System.out.println("NODE-" +data);
    }


    public void setNextNode(Node<A> nextNode) {
        this.nextNode = nextNode;
    }


    public A getData() {
        return data;
    }

    public void setData(A data) {
        this.data = data;
    }

    ///
    public Node<A> getNextNode() {
        return nextNode;
    }
}
