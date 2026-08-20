class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> parenteses = new HashMap<>();
        parenteses.put('}', '{');
        parenteses.put(')', '(');
        parenteses.put(']', '[');

        Stack<Character> stack = new Stack<>();


        for(char c: s.toCharArray()){
            if(parenteses.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() == parenteses.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
             stack.push(c);
            }
        }

        return stack.isEmpty();

        
    }
}
