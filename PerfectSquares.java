class Solution {
    Map<Integer, Integer> map = new HashMap();
   /*public int numSquares(int n) {
        if(n < 4) return n;
        int count = n; // as we can form number n with sum of atleqast n 1's.
        for(int i = 1; i* i <= n; i++) {
            count = Math.min(count, numSquares(n - i * i) + 1);
        }
        return count;
    }*/
    
    public int numSquares(int n) {
        if (n < 4)
            return n;
        if (map.containsKey(n))
            return map.get(n);
        int count = n;
        for (int i = 1; i * i <= n; i++) {
            count = Math.min(count, numSquares(n - i * i) + 1);
        }
        map.put(n, count);
        return map.get(n);
    }
}
