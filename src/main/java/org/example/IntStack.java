package org.example;

public class IntStack {
    private int[] stk; // 스택용 배열
    private int capcity; // 스택 용량

    private int ptr; // 스택 포인터

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public IntStack(int maxlen){
        ptr =0;
        this.capcity = maxlen;
        try{
            stk= new int[capcity];
        }catch (OutOfMemoryError e){
            capcity=0;
        }

    }


}
