class Solution {
    public int mostWordsFound(String[] sentences) {
        int temp=0;
        for(int i=0;i<sentences.length;i++){
            
            String tempstr=sentences[i];
            
            String words[]=tempstr.split("\\s");
            if(words.length>temp){
                temp=words.length;
            }
        }
        
        return temp;
    }
}