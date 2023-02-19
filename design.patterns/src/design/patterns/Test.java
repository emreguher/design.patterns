package design.patterns;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import design.patterns.factorymethod.ILogger;
import design.patterns.factorymethod.LoggerFactory;
import design.patterns.proxy.*;
import design.patterns.proxy.MuhasebeProxy;
import design.patterns.singleton.Board;
import design.patterns.singleton.Dunya;
import design.patterns.templatemethod.*;

public class Test {

	public static void main(String[] args) {
		
		Board b = Board.getBoard();
		b.showBoard();
		b.setCharacter("1", "X");
		b.setCharacter("2", "O");
		b.showBoard();
		
		Board b2 = Board.getBoard();
		b2.showBoard();
		
	// Singleton DP test - başlangıç	
		Dunya dunya = Dunya.getDunya();
		
		dunya.setNufus(9000000000L);
		dunya.setKitalar(Arrays.asList("Asya","Avrupa","Amerika"));
		
		Dunya world = Dunya.getDunya();
		
		world.setNufus(900000000);
		
		//System.out.println(world.getNufus());
	// Singleton DP test - bitiş
		
/////////////////////////////////////////
		
	// Proxy DP test - başlangıç
		
		boolean kullaniciYetkiliMi = true;
		BigDecimal girdi = new BigDecimal(1000);
		BigDecimal cikti = new BigDecimal(300);
		
		IMuhasebe proxy = new MuhasebeProxy(kullaniciYetkiliMi);
		
		try {
			proxy.odemeAl(girdi);
			proxy.odemeYap(cikti);
			//System.out.println(proxy.getBakiye());
		} catch (NullPointerException e) {
			System.out.println("Yetkisiz kullanım. "
					+ "Lüften sistem yöneticinize başvurun");
		}
		
		
		//Muhasebe m = new Muhasebe();
		
	// Proxy DP test - bitiş
		
/////////////////////////////////////////
		
		// Template Method DP test - başlangıç	
		
		SiparisSureciTemplate internet = new InternettenSiparis();
		//internet.siparisGerceklestir();
		
		SiparisSureciTemplate magaza = new MagazadanSatis();
		//magaza.siparisGerceklestir();
		
		// Template Method DP test - bitiş	
		
/////////////////////////////////////////
		
		// Factory Method DP test - başlangıç
		// SOLID depency inversion
		ILogger logger = LoggerFactory.createLogger();
		logger.writeLog("internetten 1 ürün satıldı.");
		List<String> logs = logger.readLog();
		
		for (String log : logs) {
			System.out.println(log);
		}
		// Factory Method DP test - bitiş
	}
}
