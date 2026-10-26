class MyHashSet {

    private List<Integer> nums;

    public MyHashSet() {
        this.nums = new ArrayList<>();
    }
    
    public void add(int key) {
       if (!nums.contains(key)) {
        nums.add(key);
       }
    }
    
    public void remove(int key) {
        nums.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return nums.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */