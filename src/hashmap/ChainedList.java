package hashmap;

import java.util.Iterator;

public class ChainedList<T> implements Iterable<T>{
    Node first;
    Node last;
    Node nodeNow;
    int count = 0;

    public ChainedList() {
    }
    
    void add(Object o){
        if(first == null)
        {
            first = new Node(o);
            last =first;
            count++;
            return;
        }
        Node newNode = new Node(o);
        last.setNext(newNode);
        last = newNode;
        count++;
    }
    
    public void addFirst(Object o){
        Node second = first;
        first = new Node(o);
        first.setNext(second);
    }
    
    public void removeFirst()
    {
        this.first = this.first.getNext();
        first.before = null;
    }
    
    int size()
    {
        return count;
    }
    
    T get(int index)
    {
        return (T)getNode(index).o;
    }
    
    Node getNode(int index)
    {
        if (index >= count)
            return new Node(new Object());
        
        Node now = first;
        for(int i = 0;i < index;i++)
        {
            now =  now.getNext();
        }
        return now;
    }
    
    T getFirst(){
        return (T)first.o;
    }
    
    T next()
    {
        if (first != null && nodeNow == null)
        {
            nodeNow = first;
            return (T)nodeNow.o;
        }else if(nodeNow ==null)
        {
            return null;
        }
        else
        {
            nodeNow = nodeNow.getNext();
            return nodeNow == null ? null : (T)nodeNow.o;
        }
    }
    
     T back()
    {
        if (first != null)
        {
            nodeNow = first;
            return (T)nodeNow.o;
        }else if(nodeNow ==null)
        {
            return null;
        }
        else
        {
            nodeNow = nodeNow.getBefore();
            return nodeNow == null ? null : (T)nodeNow.o;
        }
    }
        
    boolean contains(Object o)
    {
        if(first != null)
        {
            Node nod = first;
            do{
                if(nod.o != null && o != null)
                if(nod.o.equals(o))
                {
                    return true;
                }
                
                if(nod.o == o)
                {
                    return true;
                }
            }while((nod = nod.getNext()) != null);
        }
        return false;
    }
    
    public void removeLast()
    {
        this.last = this.last.getBefore();
        this.last.next = null;
    }
    
    T getLast(){
        return last == null ? null : (T)last.o;
    }

    void addAll(ChainedList<T> list) {
        for(T node : list)
        {
            add(node);
        }
    }
    
     @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = -1;

            @Override
            public boolean hasNext() {
                return getNode(currentIndex).getNext() != null;
            }

            @Override
            public T next() {
                currentIndex++;
                return get(currentIndex);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}

class Node{
    Object o;
    Node next;
    Node before;

    public Node(Object o) {
        this.o = o;
    }
 
    public void setNext(Node next) {
        this.next = next;
        this.next.before = this;
    }
    
    public void setBefore(Node before) {
        this.before = before;
        this.before.next = this;
    }

    public Node getBefore() {
        return before;
    }
    
    public Node getNext() {
        return next;
    }
}

