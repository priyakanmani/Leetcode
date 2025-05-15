class Solution {
    public boolean isValid(String code) {
        Stack<String> st = new Stack<>();

        for(int i = 0; i < code.length(); ++i){
            if(i > 0 && st.isEmpty()){
                return false;
            } 

            if(code.startsWith("<![CDATA[", i)){
                i = code.indexOf("]]>", i+9);
                if(i < 0){
                    return false;
                }
                i += 2;
            } else if(code.startsWith("</", i)){
                int j = i + 2;
                i = code.indexOf(">", j);
                if(i < 0){
                    return false;
                }
                String tag = code.substring(j, i);
                if(!isValidTag(tag) || st.isEmpty() || !st.pop().equals(tag)){
                    return false;
                }
            } else if(code.startsWith("<", i)) {
                int j = i + 1;
                i = code.indexOf(">", j);
                if(i < 0){
                    return false;
                }
                String tag = code.substring(j, i);
                if(!isValidTag(tag)){
                    return false;
                }
                st.push(tag);
            }
        }

        return st.isEmpty();
    }

    private boolean isValidTag(String tag){
        int length = tag.length();

        if(length < 1 || length > 9){
            return false;
        }
        for(char ch : tag.toCharArray()){
            if(!Character.isUpperCase(ch)){
                return false;
            }
        }
        return true;
    }
}