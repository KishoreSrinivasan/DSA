package com.problem.stackqueue;

public class StackImplementationArray {
    
    int capacity;
    int size;
    int position;
    int arr[];
    
    public StackImplementationArray(int capacity) {
        
        this.capacity = capacity;
        this.size = 0;
        this.position = -1;
        arr = new int[capacity];
    }
    
    boolean isEmpty() {
        
        if (size == 0) return true;
        
        return false;
    }
    
    boolean push(int input) {
        
        if (size>=capacity-1) return false;
        
        arr[++position] = input;
        size++;
        
        return true;
    }
    
    int pop() {
        
        if (size==0) return -1;
        
        size--;
        return arr[position--];
        
    }
    
    int peek() {
        
        if (size==0) return -1;
        
        return arr[position];
    }
    
    void print() {
        
        int index = position;
        
        while (index>=0) {
            
            System.out.print(arr[index--] + " ");
        }
    }

    public static void main(String[] args) {
        
        StackImplementationArray s = new StackImplementationArray(20);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();

    }

}
