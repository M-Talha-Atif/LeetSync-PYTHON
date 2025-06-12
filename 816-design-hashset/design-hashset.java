class MyHashSet {
    int num[];
    public MyHashSet() {
        num = new int[31251];
    }
	
	// set the bit if that element is present
    public void add(int key) {
        num[getIdx(key)]|=getMask(key);
    }
	
	//unset the bit if a key is not present
    public void remove(int key) {
        num[getIdx(key)] &= (~getMask(key));
    }
	
	//check if bit corresponding to the key is set or not
    public boolean contains(int key) {
        return (num[getIdx(key)]&getMask(key))!=0;
    }
	
	// idx of num[] to which this key belongs
	// for key = 37, it will give 1
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
/* 


Each array item holding a group of numbers.

nums[0] -> 0-31
nums[1] -> 32-63

For 37, we divided it by 32 to find its group so we got 1 that is index as 1

nums[1] -> 37 would be here, but how to distinguish?

For distinguishing like for nums[1] where 37 is present we will use a bit for tracking 
as set or not. As I mentioned, nums[1] will have numbers from 32-63 that are total of 32 numbers.
So, each int have 32 bits. Each number will get a bit as set or not. 

Set -> 1, Unset -> 0

For Set,Unset, we take module with 32 to get position of a number.

37%32 -> 5

So, we set the 5th bit in whole of 32 bits to be set.

For 36, it would be 4
For 35, it would be 3

In this way, using a single bit in each group we stored numbers, removed and checked either they exists.

*/