package com.company;

public class LinkList {
    public Link firstLink;

    public LinkList() {
        firstLink = null;

    }

    public boolean isEmpty(){
        return (firstLink == null);
    }

    //public void insertFirstLink(Link link){
    public void insert(String bookName, int solds){
        Link newLink = new Link(bookName, solds);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link removeFirst() {

        Link linkReference = firstLink;

        if(!isEmpty()){
            firstLink = firstLink.next;
        } else{
            System.out.println("LinkList is empty");
        }

        return linkReference;
    }

    public void print() {
        Link theLink = firstLink;

        while (theLink != null){
            theLink.print();
            theLink = theLink.next;
        }
    }

    public Link find(String bookName){
        Link theLink = firstLink;
        if(!isEmpty()){
            while (theLink.bookName != bookName){
                if(theLink.next == null){
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("LinkLisy is empty");
            return null;
        }

        return theLink;
    }

    public Link removeLink(String bookName){
        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while (currentLink.bookName != bookName){
            if (currentLink.next == null){
                return null;
            } else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }

        if(currentLink == firstLink){
            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }

        return currentLink;
    }

    public static void main(String[] args) {

        LinkList linkedList = new LinkList();
        linkedList.insert("Book 1", 100);
        linkedList.insert("Book 2", 200);
        linkedList.insert("Book 3", 300);
        linkedList.print();
System.out.println("---------------------------");
        linkedList.removeFirst();
        linkedList.print();
        System.out.println("---------------------------");
        linkedList.removeLink("Book 1");
        linkedList.print();

    }
}
