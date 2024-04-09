package Literatura;

public interface Referenca extends Comparable<Referenca> {
	
	public void UpisiUFajl(String fajl);
	public int VratiGod();	
    public int compareTo(Referenca o);
}
