public class BinaryTree {
 
    Node root;
    Association<String, String> asos = new Association<String, String>();
    
    
    
    private Node add(Node actual, int value, String Key) {
        if (actual == null) {
            return new Node(value, Key);
        }
     
        if (value < actual.value) {
            actual.left = add(actual.left, value, Key);
        } else if (value > actual.value) {
            actual.right = add(actual.right, value, Key);
        } else {
           
            return actual;
        }
     
        return actual;
        
    }
    
    
   
    public void add(int value, String key) {
        root = add(root, value, key);
    }
   
    public void addAsos(String a, String b) {
    	asos.insertar(a, b);
    }
    
    
    private boolean containsNodeRecursive(Node actual, int value) {
        if (actual == null) {
            return false;
        } 
        if (value == actual.value) {
            return true;
        } 
        return value < actual.value
          ? containsNodeRecursive(actual.left, value)
          : containsNodeRecursive(actual.right, value);
    }
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print( " " + "Key:" + node.Key + " " + "Valor:" + asos.get(node.Key) + "\n");
            traverseInOrder(node.right);
        }
    }
    
    
   
   public Boolean evaSit(String key) {
	   return asos.containsKey(key);
   }
   
  
   public String busctaman(String key) {
	   return asos.get(key);
   }
    
 
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
    
    
        
    
    
}