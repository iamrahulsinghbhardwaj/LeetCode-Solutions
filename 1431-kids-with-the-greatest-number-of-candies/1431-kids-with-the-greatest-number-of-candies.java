class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int tempmax=Integer.MIN_VALUE;
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]>tempmax){
                tempmax=candies[i];
            }
        }
        
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=tempmax){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        
        return list;
    }
}