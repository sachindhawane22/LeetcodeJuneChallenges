class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum=0;
        for(int i= 0;i<costs.length;i++){
            int costOfCityA = costs[i][0];
            int costOfCityB = costs[i][1];
            int min = minOf(costOfCityA,costOfCityB);
            System.out.println("min is "+min);
            sum=sum+min;
            System.out.println("sum is "+sum);
        }
        return sum;
        
        
    }
    public int minOf(int first, int second){
        return first < second ? first : second;
    }
}
