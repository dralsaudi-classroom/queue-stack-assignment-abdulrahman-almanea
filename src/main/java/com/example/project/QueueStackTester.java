package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
      QueueSplit(q,oq,eq,1);
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
   
    }
}
