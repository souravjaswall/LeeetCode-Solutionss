class Solution {
    public int mostWordsFound(String[] sentences) {
    int maxword = 0;
      for(int i=0;i<sentences.length;i++) {
        String[] len = sentences[i].split(" ");
        if(len.length>maxword) {
            maxword = len.length;
        }
      }  

      return maxword;
    }
}