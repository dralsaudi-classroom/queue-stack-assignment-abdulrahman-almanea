package com.example.project;

public class QueueStackTester {
    
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
      QueueSplit(q,oq,eq,1);
    }

    
      public static <T> void QueueSplit(Queue<T> q, Queue<T> oq, Queue<T> eq,int i){
    	
        if(q.length()==0)
        return;  
        T temp =q.serve();
         if (i % 2 == 0) {
         eq.enqueue(temp);
        } else {
         oq.enqueue(temp);
        }
     QueueSplit(q,oq,eq,i+1);
     q.enqueue(temp);
}



    
     public static <T> void remove(LinkedPQ<T> pq, int p)
    {
              LinkedPQ<T> tempQueue = new LinkedPQ<>();
            while (pq.length()!=0) {
            PQElement<T> temp = pq.serve();

            if (temp.p >= p) {
                tempQueue.enqueue(temp.data, temp.p);
               
            }     
    }
            while(tempQueue.length()!=0) {
            	PQElement<T> temp = tempQueue.serve();	
            pq.enqueue(temp.data, temp.p);   }
    }
    
    public static <T> boolean search(Stack<T> st, T e)
    {
           if(st.empty()) 
                return false;
         boolean f ;
        T temp= st.pop();
        f= (temp.equals(e) ||  search(st, e));
        st.push(temp);
        
        return f;
   
    }
}
