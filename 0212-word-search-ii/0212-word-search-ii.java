//Structure of our Trie
class TrieNode{
    //To store all children
    TrieNode links[] = new TrieNode[26];
    String word = null; //it will store the word at last
}
class Solution {
    //Main method
    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length;    //number of rows
        int n = board[0].length; //number of columns
        HashSet<String> res = new HashSet<>();//It will store our results and will prevent duplicates
        TrieNode root = buildTrie(words); //build trie will build the trie with all words of words array
        //we will traverse our board only once
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(i,j,root, board, res);
            }
        }
        return new ArrayList<String>(res); //it will return our result in form of ArrayList
    }

//This method will build the Trie from words array
    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        //Start iterarting over the words array
        for(String w: words){
            TrieNode curr = root;//Make curr node pointing to root node
            //now start iterating over each character of word
            for(char ch : w.toCharArray()){
                //If the index for the ch is null, then add the char at that index
                if(curr.links[ch-'a'] == null){
                    curr.links[ch-'a'] = new TrieNode();
                }
                //now move to the reference of that charcater
                curr = curr.links[ch-'a'];
            }
            //If we come out of the character loop means, we have added that word in trie, 
            //so for the last node of trie add that word which we have completed
            curr.word = w;  
        }
//If we come out of the words loop means, we have created our trie, with all words in the array words
        //so return the root of the trie
        return root;
    }

    //Our DFS method
    public void dfs(int i, int j, TrieNode root, char[][] board, HashSet<String> res){
        //Checking edge cases
        //1. We cannot cross the border of board, if we come out of the board we will return
        if(i<0 || i >= board.length || j<0 || j >= board[0].length) return;

        char ch = board[i][j];
        //if the character is already visited or If the character is not there in trie, we will return
        if(ch == '#' || root.links[ch-'a'] == null) return;
        //It means the character is there in the Trie, so we will move to it's reference
        root = root.links[ch-'a'];
        //We will check if there is a word in root's word or not
        //If it is there we will add it to our result
        if(root.word != null) res.add(root.word);
        //Now we will mark that character as visited
        board[i][j] = '#';
        //Now we will search for it's nearby character by calling DFS on those row and columns
        dfs(i, j-1, root, board, res);   //left -> column-1 i.e., j-1
        dfs(i, j+1, root, board, res);   //right -> column+1 i.e., j+1
        dfs(i-1, j, root, board, res);   //up -> row-1,  i.e., i-1
        dfs(i+1, j, root, board, res);   //down -> row+1, i.e., i+1
        
        board[i][j] = ch; //Backtracking by making that character unvisited
    }
}