class MyCircularQueue {

    private ArrayDeque<Integer> buffer;
    private int capacity;

    public MyCircularQueue(int k) {
        buffer = new ArrayDeque<>();
        capacity  = k;

    }
    
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        buffer.add(value);
        return true;
    }
    
    public boolean deQueue() {
         if (isEmpty()) {
            return false;
        }
        buffer.poll();
        return true;
    }
    
    
    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return buffer.getFirst();
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return buffer.getLast();    
    }
    
    public boolean isEmpty() {
        return buffer.isEmpty();
    }
    
    public boolean isFull() {
        return buffer.size() == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */