class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        HashSet<String> hset = new HashSet<>();
        for(String email:emails)
        {
            StringBuilder s = new StringBuilder();
            boolean flag = true;
            for(int i=0;i<email.length();i++)
            {
                if(email.charAt(i)=='+')
                    flag = false;
                else if(email.charAt(i)!='.' && flag==true && email.charAt(i)!='@')
                    s.append(email.charAt(i));
                if(email.charAt(i)=='@')
                {
                    s.append(email.substring(i));
                    break;
                }
            }
            hset.add(s.toString());
        }
        return hset.size();
    }
}