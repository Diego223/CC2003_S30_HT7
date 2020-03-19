
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class Prin {

    public static void main(String[] args) {
        BinaryTree ArbolBinario = new BinaryTree();
    	Arch a;
        a = new Arch();
    	ArrayList<String> taman = new ArrayList<String>();
        ArbolBinario = a.LeerCartas();
        System.out.print("\n" + "Se ordeno INORDER");
        ArbolBinario.traverseInOrder(ArbolBinario.getRoot());
        System.out.print("\n");
        taman = a.leerTexto();
        for(int i =0; i<taman.size(); i++) {
        	if(ArbolBinario.evaSit(taman.get(i))==false){
        		System.out.print(" *" + taman.get(i) + "* ");
        	}else {
        		System.out.print(" " + ArbolBinario.busctaman(taman.get(i)) + " ");
        	}
        }
        System.out.print(".");
  
    
    }
}