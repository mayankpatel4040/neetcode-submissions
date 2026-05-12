class Twitter {
    private Map<Integer, Set<Integer>> followMap = new HashMap<>();
    private Map<Integer, List<int[]>> tweetMap = new HashMap<>();
    private static int timestamp = 0;
    
    public Twitter() {
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.putIfAbsent(userId, new ArrayList<>());
        tweetMap.get(userId).add(new int[]{timestamp++, tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        Set<Integer> subscriptions = new HashSet<>(followMap.getOrDefault(userId, new HashSet<>()));
        subscriptions.add(userId);
        
        
        for (Integer user : subscriptions) {
            List<int[]> tweets = tweetMap.getOrDefault(user, new ArrayList<>());
            for (int i = Math.max(0, tweets.size() - 10); i < tweets.size(); i++) {
                pq.add(tweets.get(i));
            }
        }
        
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty() && res.size() < 10) {
            res.add(pq.poll()[1]);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId, new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId) && followerId != followeeId) {
            followMap.get(followerId).remove(followeeId);
        }
    }
}