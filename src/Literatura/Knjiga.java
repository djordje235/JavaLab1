package Literatura;
import java.io.*;

public class Knjiga implements Referenca,Comparable <Referenca>
{
	
	private int god_objavljivanja;
	private String naslov;
	
	public Knjiga(int g,String nas) 
	{
		god_objavljivanja=g;
		naslov=nas;
	}
	
	public int VratiGod() 
	{
		
		return god_objavljivanja;
	}
	
	public void UpisiUFajl(String fajl)  
	{
		fajl = String.valueOf(god_objavljivanja) + ".txt";
		FileWriter fw;
		try 
		{
			fw = new FileWriter(fajl);
			BufferedWriter bw;
			bw = new BufferedWriter(fw);
			
			String s;
			s = naslov;
			
			String pom[] = s.split(" ");
			bw.write(pom[0]);
			bw.close();
		}
		catch(IOException e) 
		{
			System.out.println("Doslo je do greske!" + e);
		}
		
	}
	
	public int compareTo(Referenca o) 
	{
		return Integer.compare(this.god_objavljivanja, o.VratiGod());
	}
	
	
	
	

}
