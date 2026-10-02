class Solution {
    public void generate(List<String> result, int max, int open, int close, String UnProcessed){
        if(UnProcessed.length() == (2*max)){
            result.add(UnProcessed);
            return;
        }
        if(open<max){
            generate(result,max,open+1,close,UnProcessed+"(");
        }
        if(close<open){
            generate(result,max,open,close+1,UnProcessed+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate(result,n,0,0,"");
        return result;
    }
}