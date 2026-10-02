class Solution {
    public List<String> generateParenthesis(int n) {
        List<Character> list = new List<>();
        if(n == 1){
            list.put('()');
        }
        return list;
    }
}