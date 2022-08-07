package com.bridgelabz.algorithmanddatastucture;

public class OrderedLinkedList<E extends Comparable<E>> {

    Node<E> head;
    Node<E> tail;

    public void add(E key) {
        Node<E> newNode = new Node<>(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node<E> temp = head;

        if(head == null){
            System.out.println("List is Empty");
        }

        while(temp!=null){
            System.out.print(temp.key);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }

    }

    public void insert(int pos,E insertKey) {

        Node<E> insertNode=new Node<>(insertKey);
        Node<E> temp=head;
        int count=1;
        while(temp!=null){

            if(count==pos){

                insertNode.next = temp.next;
                temp.next = insertNode;
                break;

            }
            count++;
            temp=temp.next;
        }

    }

    public void pop(E deleteKey) {

        Node<E> temp=head;
        Node<E> beforeTemp = null;

        if(head == null){
            System.out.println("List is Empty");
        }

        if(head.key== deleteKey){

            head = head.next;

        }else{

            while(temp!=null){

                if(temp.key==deleteKey){

                    beforeTemp.next = temp.next;
                    temp = null;
                    break;

                }else{
                    System.out.println("Element does not exist");
                }
                beforeTemp = temp;
                temp=temp.next;
            }

        }

    }

    public int size(){
        Node<E> temp = head;
        Integer count =0;

        if(head == null){
            System.out.println("List is Empty");
        }

        while(temp!=null){
            temp = temp.next;
            count++;
        }
        System.out.println();
        System.out.println(" Size of the linked list is: "+ count);
        return count;
    }

    public void sorting(int linkedListSize){

        Node<E> temp = head;
        Node<E> beforeTemp = null;

        int passNumber = linkedListSize-1;
        while(temp!=null && passNumber!=0){

            if(beforeTemp!=null){

                if(beforeTemp.key.compareTo(temp.key) > 0 ){

                    E swapKey = beforeTemp.key;
                    beforeTemp.key = temp.key;
                    temp.key = swapKey;

                }

            }

            beforeTemp = temp;
            temp = temp.next;

            if(temp == null){
                passNumber--;
                beforeTemp = null;
                temp = head;
            }

        }

    }

}