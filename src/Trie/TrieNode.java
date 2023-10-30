package Trie;

public class TrieNode {
    public int childCount;
    char data;
    boolean isTerminal;
    TrieNode children[];

    public TrieNode(char data){
        this.data=data;
        this.isTerminal=false;
        this.children=new TrieNode[26];
        childCount=0;
    }
}
 class Trie{

     int numwords=0;

    private TrieNode root;

    //initialisation of the root node by assigning it a null value
    public Trie(){
        root=new TrieNode('\0');
    }

    public void add(String word){
        addHelper(root,word);
        numwords++;


    }

     private void addHelper(TrieNode root, String word) {
        if(word.length()==0){
            root.isTerminal=true;
            return;
        }
        int childIndex=word.charAt(0)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            numwords++;
        }
        addHelper(child,word.substring(1));
     }

     public boolean search(String word){
        return searchHelper(root,word);

     }

     private boolean searchHelper(TrieNode root, String word) {
        if(word.length()==0){
            return root.isTerminal;
        }
        int childIndex=word.charAt(0)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            return false;
        }

         return searchHelper(child,word.substring(1));
     }

    public void remove(String word){
        removeHelper(root,word);

    }

     private void removeHelper(TrieNode root, String word) {
        if(word.length()==0){
            root.isTerminal=false;
            return;
        }

        int childIndex=word.charAt(0)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            return;
        }
        removeHelper(child,word.substring(1));
        if(!child.isTerminal && child.childCount==0){
            root.children[childIndex]=null;
            numwords--;
        }

     }
     public int count(){

        return numwords;
     }


     //In this every root creates an array of 26 length and the index of the respective child node is stored in it
}
