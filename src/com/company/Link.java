package com.company;

public class Link {

    public String bookName;
    public int solds;
    public Link next;

    public Link(String bookName, int solds){
        this.bookName = bookName;
        this.solds = solds;
    }

    public void print(){
        System.out.println(bookName+" "+ solds);
    }

    public String toString(){
        return bookName;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
