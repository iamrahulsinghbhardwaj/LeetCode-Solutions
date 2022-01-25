class Solution {
    public void setZeroes(int[][] matrix) {
        
        int ans[][]=new int[matrix.length][matrix[0].length];
        
        int m=matrix.length;
        int n=matrix[0].length;
      //  System.out.println(m+" "+n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=matrix[i][j];
            }
        }
        
            
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(matrix[i][j]==0){
                  convert(ans,i,j,m,n);
              }
            }
        }  
        
           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               matrix[i][j]=ans[i][j];
            }
         }
        
    }
    
    
    public static void convert(int ans[][],int l,int k,int m,int n){
        
        for(int i=0;i<m;i++){
            ans[i][k]=0;
        }
        
        for(int j=0;j<n;j++){
            ans[l][j]=0;
        }
    }
}