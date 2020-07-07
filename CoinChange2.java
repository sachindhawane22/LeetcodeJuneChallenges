class Solution {
    public int change(int amount, int[] coins) {
        List coinsList =new ArrayList();
        for(int i =0;i<coins.length;i++){
            coinsList.add(coins[i]);
        }
        int ways[] = new int[amount+1];
        ways[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            //if(coinsList.contains(i)){
                for (int j = coins[i]; j <= amount; j++) {
                    ways[j] = ways[j] + ways[j - coins[i]];
                }
            //}
       }



        return ways[amount];
    }
}
