package Trie;



public class TrieUse {
    public static void main(String[] args) {
        Trie t=new Trie();
        t.add("AND");
        t.add("NEWSTART");
        t.add("LOVE");
        t.add("ummahhh");
        //t.remove("AND");

        System.out.println(t.search("NEWSTART"));
        System.out.print(t.search("AND"));
        System.out.println(t.count());

    }
}
