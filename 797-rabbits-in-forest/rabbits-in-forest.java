class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<answers.length;i++) {
            mp.put(answers[i],mp.getOrDefault(answers[i],0)+1);
        }

        int ans=0;
        for(int key:mp.keySet()){
            int grp_size = key+1;
            int grps = (int)Math.ceil((mp.get(key)*1.0)/grp_size);
            ans += grps * grp_size;
        }

        return ans;
    }
}