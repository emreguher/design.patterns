package design.patterns.singleton;

import java.util.List;
// Singleton DP örneği
/**
 * 
 * @author izzet.bozoglu
 *
 */
public class Dunya {
	// 2. adım
	private static final Dunya DUNYA = new Dunya();
	
	private long nufus;
	private List<String> kitalar;
	private List<String> okyanuslar;
	private List<String> ulkeler;
	
	// 1. adım
	private Dunya() {
	
	}
	
	// 3. adım
	public static Dunya getDunya() {
		return DUNYA;
	}
	
	public long getNufus() {
		return nufus;
	}
	public void setNufus(long nufus) {
		this.nufus = nufus;
	}
	public List<String> getKitalar() {
		return kitalar;
	}
	public void setKitalar(List<String> kitalar) {
		this.kitalar = kitalar;
	}
	public List<String> getOkyanuslar() {
		return okyanuslar;
	}
	public void setOkyanuslar(List<String> okyanuslar) {
		this.okyanuslar = okyanuslar;
	}
	public List<String> getUlkeler() {
		return ulkeler;
	}
	public void setUlkeler(List<String> ulkeler) {
		this.ulkeler = ulkeler;
	}

}
