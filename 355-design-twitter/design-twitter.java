class Twitter {
    private static int timeStamp=0;

    private class Tweet{
		public int id;
		public int time;
		public Tweet next;

		public Tweet(int id){
			this.id = id;
			time = timeStamp++;
			next=null;
		}


	}

    class User {
        int id;
        Set<Integer> followers;
        Tweet head;
        public User(int id){
            this.id = id;
            head = null;
            this.followers = new HashSet<Integer>();
            follow(id);

        }

        public void follow(int id){
            followers.add(id);
        }

        public void  unFollow(int id){
            followers.remove(id);
        }

        public void post(int tweetId){
            Tweet newTweet = new Tweet(tweetId);
            newTweet.next = head;
            head = newTweet;
        }

    }

    Map<Integer,User> users;

    public Twitter() {
        users = new HashMap<Integer,User> ();
        
    }
    
    public void postTweet(int userId, int tweetId) {
        if( !users.containsKey(userId) ){
            User user  = new User(userId);
            users.put(userId, user);
        }
        users.get(userId).post(tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {

        List<Integer> res = new LinkedList<>();

		if(!users.containsKey(userId))   return res;

		Set<Integer> followers = users.get(userId).followers;

		PriorityQueue<Tweet> q = new PriorityQueue<Tweet>( followers.size(), (a,b)->(b.time-a.time));

		for(int follower: followers){

			Tweet t = users.get(follower).head;

			if(t!=null){
				q.add(t);
			}
		}
		int n=0;

		while(!q.isEmpty() && n<10){

		  Tweet t = q.poll();
		  res.add(t.id);
		  n++;
		  if(t.next!=null)
			q.add(t.next);
		}

		return res;

        
    }
    
    public void follow(int followerId, int followeeId) {
        if(!users.containsKey(followerId)){
			User u = new User(followerId);
			users.put(followerId, u);
		}
		if(!users.containsKey(followeeId)){
			User u = new User(followeeId);
			users.put(followeeId, u);
		}
    
        users.get(followerId).follow(followeeId);
            
    }
    
    public void unfollow(int followerId, int followeeId) {

        if(followerId == followeeId || !users.containsKey(followerId) || !users.containsKey(followeeId) ){
            return;
        }

        users.get(followerId).unFollow(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */