class Solution {
    static HashMap<Character, Integer> hashMap = new HashMap();

    static {
        hashMap.put('q', 1); hashMap.put('w', 1); hashMap.put('e', 1);
        hashMap.put('r', 1); hashMap.put('t', 1); hashMap.put('y', 1);
        hashMap.put('u', 1); hashMap.put('i', 1); hashMap.put('o', 1); hashMap.put('p', 1);

        hashMap.put('a', 2); hashMap.put('s', 2); hashMap.put('d', 2);
        hashMap.put('f', 2); hashMap.put('g', 2); hashMap.put('h', 2);
        hashMap.put('j', 2); hashMap.put('k', 2); hashMap.put('l', 2);

        hashMap.put('z', 3); hashMap.put('x', 3); hashMap.put('c', 3);
        hashMap.put('v', 3); hashMap.put('b', 3); hashMap.put('n', 3); hashMap.put('m', 3);
    }

    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList();       

        for (String word : words) {
            if (isValidWord(word)) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }

    public boolean isValidWord(String word) {
        word = word.toLowerCase();
        int row = hashMap.get(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            if (hashMap.get(word.charAt(i)) != row) {
                return false;
            }
        }
        return true;
    }
}