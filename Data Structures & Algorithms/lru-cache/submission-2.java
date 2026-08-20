class Node {
    int key;
    int val;
    Node prev;
    Node next;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {

    private int cap;
    private HashMap<Integer, Node> cache;
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);

    public LRUCache(int capacity){
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void add(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;  // FIXED
        head.next = node;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.val = value;          // Also update value
            remove(node);
            add(node);
        } else {
            if (cache.size() == cap) {
                Node removed = tail.prev;
                remove(removed);
                cache.remove(removed.key);
            }

            Node node = new Node(key, value);
            cache.put(key, node);
            add(node);
        }  
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            add(node);
            return node.val;
        }
        return -1;
    }
}
