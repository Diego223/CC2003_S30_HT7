

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;




public class Arch {
	File archivo = null;
    FileReader bufferleer = null;
    BufferedReader buffer = null;
    BinaryTree arbo = new BinaryTree();
    ArrayList<String> taman = new ArrayList<String>();
	
	public BinaryTree LeerCartas() 
	{
		
				int cont = 0;
				try {
					
					String path = System.getProperty("user.dir");
			        archivo = new File ( path + "\\dictionary.txt");
			        bufferleer = new FileReader (archivo);
			        buffer = new BufferedReader(bufferleer);

			         String l;
			         String[] a;
			         String b = "";
			         String c = "";
			         ArrayList<String> ingles1 = new ArrayList<String>();
			         ArrayList<String> ingles = new ArrayList<String>();
			         ArrayList<String> espanol = new ArrayList<String>();
			         
			         while((l=buffer.readLine())!=null)
			         {
			        	 a = l.split(", ");
			        	 
			        	 ingles1.add(a[0].substring(1,a[0].length()));
			        	 ingles.add(a[0].substring(1,a[0].length()));
			        	 espanol.add(a[1].substring(0,a[1].length()-1));
			        	 
			        	cont++;
			         }
			         
			         Collections.sort(ingles1);
			         for (int i = 0; i < ingles1.size(); i++) {
			        	 arbo.addAsos(ingles1.get(i), espanol.get(ingles.indexOf(ingles1.get(i))));
			        	 arbo.add(i+1, ingles1.get(i)); 
			         }
			         
			         
		        } catch (Exception ex) 
				{
		            ex.printStackTrace();
		        }finally
				{
		          
		            try
		            {                    
		               if( null != bufferleer ){   
		                  bufferleer.close();     
		               }                  
		            }catch (Exception e2){ 
		               e2.printStackTrace();
		            }
		         }
				return arbo;
				
			}
	
	public ArrayList<String> leerTexto() 
	{
				int cont = 0;
				try {
					String path = System.getProperty("user.dir");
			        archivo = new File ( path + "\\text.txt");
			        bufferleer = new FileReader (archivo);
			        buffer = new BufferedReader(bufferleer);

			         String l;
			         String[] a;
			         
			         
			         while((l=buffer.readLine())!=null)
			         {
			        	 
			        	 a = l.split(" ");
			        	 for(int i =0; i<a.length-1; i++) {
			        		 taman.add(a[i]);
			        	 }
			        	 String ah = a[a.length-1];
			        	 ah = ah.substring(0,ah.length()-1);
			        	 taman.add(ah);
			        	 
			        	 
			        	cont++;
			         }
			         
		        } catch (Exception ex) 
				{
		            ex.printStackTrace();
		        }finally
				{
		           
		            try
		            {                    
		               if( null != bufferleer ){   
		                  bufferleer.close();     
		               }                  
		            }catch (Exception e2){ 
		               e2.printStackTrace();
		            }
		         }
				return taman;
				
			}

    

    
}