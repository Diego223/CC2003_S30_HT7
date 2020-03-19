
class Node {
	String Key;
    int value;
    Node left;
    Node right;
  
    Node(int value, String Key) {
    	this.Key = Key;
        this.value = value;
        right = null;
        left = null;
    }  
    
}