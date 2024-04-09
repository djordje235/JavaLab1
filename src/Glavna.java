import Literatura.Referenca;
import Literatura.Knjiga;
import Literatura.Rad;
import java.io.*;
import Izuzeci.Bozic;
public class Glavna {
     public static void main(String[] args) {
    	 
    	 Biblioteka<Referenca> biblioteka = new Biblioteka<>();
    	 
    	 InputStreamReader tast = new InputStreamReader(System.in);
    	 BufferedReader br = new BufferedReader(tast);
    	 
    	  try {
              System.out.println("Unesite godinu objavljivanja knjige: ");
              int godina = Integer.parseInt(br.readLine());

            
              if (godina == 0) {
                  throw new Bozic();
              }

              System.out.println("Unesite naslov knjige: ");
              String naslov = br.readLine();

             
              Referenca knjiga = new Knjiga(godina, naslov);
              biblioteka.staviNaPolicu(knjiga);
          } 
    	  catch (IOException e) 
    	  {
              System.out.println("Greška prilikom unosa " + e.getMessage());
          } 
    	  catch (Bozic e) 
    	  {
              System.out.println("Uhvaćen Bozic Exception. Dodaje se referenca s godinom izdanja 2024 i naslovom 'Ris papira'.");
              Referenca knjiga = new Knjiga(2024, "Ris papira");
              biblioteka.staviNaPolicu(knjiga);
          }
    	  
    	  Referenca rad1 = new Rad(2020, 123456);
    	  Referenca knjiga2 = new Knjiga(2007,"Zbirka");
          Referenca rad2 = new Rad(2019, 654321);
       

          biblioteka.staviNaPolicu(rad1);
          biblioteka.staviNaPolicu(knjiga2);
          biblioteka.staviNaPolicu(rad2);
          

          
          biblioteka.UrediPolicu();

          
       
          System.out.println("Reference su uspešno upisane u datoteke.");
         
    	 
     }
}