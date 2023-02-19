package design.patterns.proxy;

import java.math.BigDecimal;
// Protection proxy
public class MuhasebeProxy implements IMuhasebe {
	
	private boolean kullaniciYetkiliMi;
	private Muhasebe muhasebe; 
	
	public MuhasebeProxy(boolean kullaniciYetkiliMi) {
		this.kullaniciYetkiliMi = 
				kullaniciYetkiliMi;
		// lazy loading
		if(kullaniciYetkiliMi == true) {
			muhasebe = new Muhasebe();
		}
	}
	
	
	@Override
	public boolean odemeAl(BigDecimal tutar) {

		return muhasebe.odemeAl(tutar);

	}

	@Override
	public boolean odemeYap(BigDecimal tutar) {
		
		return muhasebe.odemeYap(tutar);
	}

	@Override
	public BigDecimal getBakiye() {
		// TODO Auto-generated method stub
		return muhasebe.getBakiye();
	}

}
