class LRUCache {
    public Map<Integer,Node> map;
    public Node head;
    public Node tail;
    public int capacity;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;

    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            Node curr = map.get(key);

            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
            curr.prev = head;
            curr.next = head.next;
            head.next.prev = curr;
            head.next = curr;


            return map.get(key).val;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.get(key).val = value;
            Node curr = map.get(key);

            // update position
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
            curr.prev = head;
            curr.next = head.next;
            head.next.prev = curr;
            head.next = curr;
            


        } else {
            if (this.capacity == map.size()) {
                // get rid of oldest
                
                map.remove(tail.prev.key);
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;

                
            }

            // add newest
            Node newNode = new Node (key, value);
            head.next.prev = newNode;
            newNode.next = head.next;
            head.next = newNode;
            newNode.prev = head;
            map.put(key, newNode);
        }
    }

    class Node {
        int key;
        int val;

        Node prev;
        Node next;

        public Node (int key, int val){
            this.key = key;
            this.val = val;
        }
    }
}
