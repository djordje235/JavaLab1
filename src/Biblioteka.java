import java.io.*;
import java.io.IOException;
import java.util.*;

import Literatura.Referenca;

class Biblioteka<T extends Referenca> {
    private ArrayList<T> lista = new ArrayList<>();

    
    public void staviNaPolicu(T ref) {
        lista.add(ref);
    }

 
 
     public void UrediPolicu() {
         Collections.sort(lista);
           try 
           {
                int brojReferenci = lista.size();
                DataOutputStream out = new DataOutputStream(new FileOutputStream("broj.bin"));
                out.writeInt(brojReferenci);
                out.close();

                  
                if (!lista.isEmpty()) 
                {
                     String imeDatotekeNajstarijeg = lista.get(0).VratiGod() + ".txt";
                     lista.get(0).UpisiUFajl(imeDatotekeNajstarijeg);

                     String imeDatotekeNajmladjeg = lista.get(lista.size() - 1).VratiGod() + ".txt";
                     lista.get(lista.size() - 1).UpisiUFajl(imeDatotekeNajmladjeg);
                }
            
          } 
          catch (IOException e) 
           {
        	System.out.println("Doslo je do greske!" + e);
           }
    }
     
}
