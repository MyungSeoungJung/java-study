package ch09_Generic;


import java.util.LinkedList;

//큐(Queue) FiFo(first in first out)
//가장 먼저 들어간 것이 가장 먼저 처리됨 ex: 메시지 처리 시스템에서 자주 사용됨
public class GenericQueue <T> {
    private LinkedList<T> queue = new LinkedList<>();


    //요소 추가
    public void enqueue(T item){
        queue.addLast(item);
    }


    //요소 꺼내오기

    public T dequeue(){
        return queue.pollFirst();
    }
}
