class MyHashSet {
    // 00000000 00000000 00000000 00000010
    // above are 32 bits for 1 integer
    // 0-31 would be treated as number and specific bit will be turned on/off
    // after adding 1,2  --->  num[0] = 00000000 00000000 00000000 00000110
    // after adding 3,4,5 ---> num[0] = 00000000 00000000 00000000 00111110

    // unset scenario
    /* 
num[0] = 00000000 00011100 00000000 00111110
mask(3) = 00000000 00000000 00000000 00001000
~mask   = 11111111 11111111 11111111 11110111
AND:
00000000 00011100 00000000 00111110
& 11111111 11111111 11111111 11110111
-------------------------------------
  00000000 00011100 00000000 00110110
    
    */
    int num[];


    public MyHashSet() {

        num = new int[31251];
        
    }
    
    // set the bit if that element is present
    // using the or operator
    // | -> or operator
    public void add(int key) {
        num[getIdx(key)] |= getMask(key);
    }
    
    public void remove(int key) {
        num[getIdx(key)] &= (   ~getMask( key)  );

       
        
    }
    
    public boolean contains(int key) {
        // if mask are different it means key is there
        // it will compare the bit only
        // 1 0 1 let say in num[0]
        // key to check is 2
        // so mask of 2 is 1  0  0
        // 1 0 1 & 1 0 0 is 1 0 0 returned value is greater than 1, return true
        // if key is 0
        // then 1 0 1 & 0 0 1 is  0 0 1, return true

        return  ( num[ getIdx(key)] & getMask(key) ) !=0; 
        
    }

     private int getIdx(int key)
    {
        return (key/32);
    }
	

    private int getMask(int key)
    {
        key%=32;
        return (1<<key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */