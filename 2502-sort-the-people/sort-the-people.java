class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int max = 0;
        Map<Integer, String> mp = new HashMap<>();
        for(int i=0;i<names.length;i++) {
            mp.put(heights[i],names[i]);
        }

        Arrays.sort(heights);
        String[] res =  new String[heights.length];

        for(int i=heights.length-1;i>=0;i--) {
            res[max] = mp.get(heights[i]);
            max++;
        }

        return res;
    }
}