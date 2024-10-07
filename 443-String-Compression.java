class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int idx = 0;
        while (i < n) {
            int temp = 1;
            char ch = chars[i];
            while (i + temp < n && chars[i + temp] == ch) temp++;
            if (temp == 1) chars[idx++] = ch;
            else {
                chars[idx++] = ch;
                String count = temp + "";
                for (char c : count.toCharArray())
                    chars[idx++] = c;
            }
            i += temp;
        }
        return idx;
    }
}