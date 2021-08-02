package com.ITrator.study.collection;

import java.util.ArrayDeque;

public class ArrayDequeAsStack
{
    public static void main(String[] args)
    {
        //Creating an array deque
 
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
 
        //pushing elements into arrayDeque
 
        arrayDeque.push("One");
 
        arrayDeque.push("Two");
 
        arrayDeque.push("Three");
 
        arrayDeque.push("Four");
 
        arrayDeque.push("Five");
 
        //Printing the elements of arrayDeque
 
        System.out.println(arrayDeque);     //Output : [Five, Four, Three, Two, One]
 
        //popping up the elements from arrayDeque
 
        System.out.println(arrayDeque.pop());    //Output : Five
 
        System.out.println(arrayDeque.pop());    //Output : Four
    }
}