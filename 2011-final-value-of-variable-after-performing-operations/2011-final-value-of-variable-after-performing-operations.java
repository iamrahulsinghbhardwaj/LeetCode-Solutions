class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        
        for(int i=0;i<operations.length;i++){
          //  System.out.print(operations[i]);
            if(operations[i].equals("++X")){
               ++ans;
            }else if(operations[i].equals("X++")){
               ++ans;
            }else if(operations[i].equals("--X")){
               --ans;
            }else{
                ans--;
            }
        }
        
        return ans;
    }
}