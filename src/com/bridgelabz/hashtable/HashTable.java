package com.bridgelabz.hashtable;

//MyMapNode class to implement hashtable using linked list
class MyMapNode {
    String key;
    int value;
    MyMapNode next;

    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

//MyHashTable to implement the main functionality
class MyHashTable {
    private static final int SIZE = 10;

    //Array of linkedlist to implement hashtable
    MyMapNode[] table = new MyMapNode[SIZE];

    //Get index of current key using hashcode function
    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    //Method to add a key to the hashtable
    public void add(String key) {
        int index = getIndex(key);

        if (table[index] == null) {
            table[index] = new MyMapNode(key, 1);
            return;
        }

        MyMapNode curr = table[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                curr.value++;
                return;
            }
            if (curr.next == null){
                break;
            }
            curr = curr.next;
        }
        curr.next = new MyMapNode(key, 1);
    }

    //Remove method to remove a word from the hashtable.=
    public void remove(String key) {
        int index = getIndex(key);
        MyMapNode curr = table[index];
        MyMapNode prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {

                //If the word is the first node in the bucket.
                if (prev == null) {
                    table[index] = curr.next;
                }

                //Otherwise remove the node from the linked list.
                else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    //Method to print the hashtable
    public void print() {
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                System.out.println("Bucket " + i);
                MyMapNode curr = table[i];
                while (curr != null) {
                    System.out.println(curr.key + " -> " + curr.value);
                    curr = curr.next;
                }
                System.out.println();
            }
        }
    }
}

//Main class
public class HashTable {
    public static void main(String[] args) {

        String paragraph = "Paranoids are not paranoid because they are paranoid " +
                        "but because they keep putting themselves deliberately " +
                        "into paranoid avoidable situations";
        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.split(" ");

        MyHashTable table = new MyHashTable();
        for (String word : words) {
            table.add(word);
        }

        System.out.println("Before Removing:\n");
        table.print();

        table.remove("avoidable");

        System.out.println("After Removing 'avoidable':\n");
        table.print();
    }
}