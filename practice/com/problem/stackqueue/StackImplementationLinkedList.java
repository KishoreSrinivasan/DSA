package com.problem.stackqueue;

public class StackImplementationLinkedList {
    
    Node head;
    
    static class Node {
        
        int data;
        Node next;
        
        Node(int data) {
            
            this.data = data;
        }
    }
    
    public boolean isEmpty() {
        
        if (head == null) return true;
        
        return false;
    }
    
    public void push(int data) {
        
        Node node = new Node(data);
        
        if (head == null)  {
            
            head = node;
            
        } else {
            
            Node temp = head;
            head = node;
            node.next = temp;
        }        
    }
    
    public int pop() {
        
        if (head == null) return -1;
        
        Node temp = head;
        head = head.next;
        temp.next = null;
        
        return temp.data;
    }
    
    public int peek() {
        
        if (head == null) return -1;
        
        return head.data;
    }

    public static void main(String[] args) {
        
        StackImplementationLinkedList sll = new StackImplementationLinkedList();
        
        sll.push(10);
        sll.push(20);
        sll.push(30);
 
        System.out.println(sll.pop() + " popped from stack");
 
        System.out.println("Top element is " + sll.peek());

    }
}
