package Literatura;
import java.io.*;

public class Rad implements Referenca, Comparable<Referenca>
{
	private int god_objavljivanja;
	private int ISNB;
	
	public Rad(int g,int isnb) 
	{
		god_objavljivanja = g;
		ISNB = isnb;
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
			
			int zadnja_cifra;
			zadnja_cifra = ISNB % 10;
			
			bw.write(String.valueOf(zadnja_cifra));
			bw.newLine();
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