class Solution {
    public int minOperations(int[] arr, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i : arr)
		{
			pq.add(i);
		}
		
		int count  =0;
		while(true)
		{
			int a = k;
			int b = k;
			if(pq.size() >= 2)
			{
				a = pq.poll();
				b = pq.poll();
			}
			if(a < k && b < k)
			{
				int value = a * 2 + b;
				if(value > 0)
				{
					pq.add(value);
				}
				else
				{
					pq.add(k);
				}
				count++;
			}
			else if(a < k && b >= k || a >= k && b < k)
			{
				return count + 1;
			}
			else 
			{
				break;
			}
		}
        return count;
    }
}