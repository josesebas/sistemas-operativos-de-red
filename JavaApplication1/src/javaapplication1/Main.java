package javaapplication1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Thread.currentThread;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //ArrayList<String> lista = new ArrayList<String>();
        /* Create and display the form */
        Monitor monitor =new Monitor();
        monitor.setTitle("Ventana monitor de procesos");
        monitor.setVisible(true);
        monitor.runTable();
        
       /* try {
            String process;
            // getRuntime: Returns the runtime object associated with the current Java application.
            // exec: Executes the specified string command in a separate process.
            Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
            
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            int valores=0;
            while ((process = input.readLine()) != null) {
                   
                   String aux[] = process.split(","); // <-- Print all Process here line
                   //System.out.println(aux[0] +"-"+aux[1]);                                                      // by line
                   lista.add(aux[0] +" -> "+aux[1]);
                   Thread h = new Thread(lista.get(valores));
                   h.start();
                   try {
			h.sleep(100);
                        
		Thread.State state = h.getState();
		//System.out.println(h.getName() + " estado es - " + state);
                   } catch (Exception e) {
			System.out.println(e);
		}
		
                valores++;
            }
            input.close();
        } catch (Exception err) {
        }*/
        
    }

    
    
}
