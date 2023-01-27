// class Solution {
//     class Node{
//         Node[] link = new Node[26];
//         boolean flag = false;
//     }
    
//     public boolean containsKey(char c, Node node){
//         return (node.link[c-'a']!=null);
//     }
    
//     public void put(char c, Node node){
//         node.link[c-'a']=(new Node());
//     }
    
//     public Node get(char c, Node node){
//         return node.link[c-'a'];
//     }
    
//     public void setEnd(Node node){
//         node.flag = true;
//     }
    
//     public boolean isFinished(Node node){
//         return node.flag;
//     }
    
//     public void insert(Node root, String word){
//         Node node = root;
        
//         for(int i=0 ; i < word.length() ; i++){
//             char c = word.charAt(i);
//             if(!containsKey(c,node)){
//                 put(c,node);
//             }
//             node = get(c,node);
//         }
        
//         setEnd(node);
//     }
    
    
//     public int solve(Node root, int j,String word){
        
//         if(j==word.length())
//             return 0;
//         Node node = root;
//         for(int i = j;i<word.length();i++){
//             char c= word.charAt(i);
//             if(!containsKey(c,node)){
//                 return -1;
//             }
            
//             if(isFinished( node )){
//                 int next=  solve(root,i+1,word);
//                 if(next!=-1)
//                     return next+1;
//             }
//             node = get(c,node);
//         }
        
//         return -1;
//     } 
    
//     public List<String> findAllConcatenatedWordsInADict(String[] words) {
//         Node root = new Node();
//         int i = 0, n = words.length;
        
//         for(i=0;i<n;i++){
//             insert(root,words[i]);
//         }
        
//         List<String> ans = new ArrayList<>();
        
//         for(String word : words){
//             int count = solve(root,0,word);
//             System.out.println(count+" "+word);
//             if(count>1){
//                 ans.add(word);
//             }
            
//         }
        
        
        
//         return ans;
//     }
// }

// /*

// ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
// ["cat","dog","catdog"]
// ["cat","catcat"]
// ["a","b","ab","abc"]

// */

class Solution {
    class TrieNode {
        boolean isLast;
        TrieNode[] child;
        TrieNode() {
            this.isLast = false;
            this.child = new TrieNode[26];
        }
    }
    private TrieNode root;

    private void insert(String word) {
        TrieNode temp = root;
        for(char c : word.toCharArray()) {
            int idx = c - 'a';
            if(temp.child[idx] == null) {
                temp.child[idx] = new TrieNode();
            }
            temp = temp.child[idx];
        }
        temp.isLast = true;
    }

    private int solve(TrieNode rt, int i, String s) {
        if(i == s.length()) {
            return 0;
        }

        //Iterating over the word to check if the word can be formed
        for(int j = i; j < s.length(); j++) {
            int idx = s.charAt(j) - 'a';
            if(rt.child[idx] == null) {
                return -1;
            }
            if(rt.child[idx].isLast) {

                //Recursively checking for the remaining string.
                int next = solve(root, j+1, s);

                //If the string can be formed with the word.
                if(next != -1) {
                    return next+1;
                }
            }
            rt = rt.child[idx];
        }

        //If no words can be formed
        return -1;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        this.root = new TrieNode();
        //Creating Trie with words
        for(String word : words) {
            insert(word);
        }

        List<String> ans = new ArrayList<>();

        for(String word : words) {
            int count = solve(root, 0, word);
            if(count > 1) {
                //Adding the word to the list, only if it is 
                //made up from concatination of more than 1 word.
                ans.add(word);
            }
        }

        return ans;
    }
}
