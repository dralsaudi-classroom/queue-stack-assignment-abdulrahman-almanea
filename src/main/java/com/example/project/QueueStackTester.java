package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
      QueueSplit(q,,oq,eq,1);
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    }

 public static <T> void QueueSplit(Queue<T> q, Queue<T> oq, Queue<T> eq,int i){
    if(q.length()==0)
        return;
     if (index % 2 == 0) {
         eq.add(element);
        } else {
         oq.add(element);
        }
     QueueSplit(q,oq,eq,i++);
}




    
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
              LinkedPQ<T> tempQueue = new LinkedPQ<>();
            while (pq.length()!=0) {
        T temp = pq.serve();
            if (temp.priority >= p) {
                tempQueue.enqueue(temp);
                pq.enqueue(temp);
            }
                else{
                     pq.enqueue(temp);
                }

        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
           if(st.empty()) 
                return false;
        boolean f ;
        T temp= st.pop();
        f = (temp.equals(e) ||  search(Stack<T> st, T e));
        st.push(temp);
        return f;
       
        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
    }
}
