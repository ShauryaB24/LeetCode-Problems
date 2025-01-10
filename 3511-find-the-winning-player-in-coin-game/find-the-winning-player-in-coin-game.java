class Solution {
    public String winningPlayer(int x, int y) {
        int q = (int)y/4;
        int c =  0;
        for(int i=0;i<x;i++) {
            if(y>=4){
                c++;
                y = y-4;
            }
        }

        if(c%2 != 0)return "Alice";

        else 
            return "Bob";

    }
}