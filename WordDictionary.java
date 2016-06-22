import java.util.HashMap;

/**
 * Created by Dan Lv on 3/2/2016.
 */

public class WordDictionary {
    public TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c1 = word.charAt(i);
            if (curr.children.containsKey(c1))
                curr = curr.children.get(c1);
            else {
                TrieNode newnode = new TrieNode(c1);
                curr.children.put(c1, newnode);
                curr = newnode;
            }
            if (i == word.length() - 1) ;
            curr.isLeaf = true;
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    //  public boolean search(String word){}

    public boolean dfsSearch(TrieNode root, String s, int i) {
        if (root.children.containsKey(s.charAt(i)) == false)
            return false;
        if (i < s.length() - 1)
            return dfsSearch(root.children.get(s.charAt(i)), s, i + 1);
        else if (root.children.containsKey(s.charAt(i))) {
            if (root.children.get(s.charAt(i)).isLeaf == true)
                return true;
            else
                return false;
        }
        return true;
    }

    public boolean searchWord(String s) {
        return dfsSearch(root, s, 0);
    }
}
