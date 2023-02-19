package design.patterns.proxy;

import java.math.BigDecimal;

public class Muhasebe implements IMuhasebe {

	private BigDecimal bakiye = new BigDecimal(0);
	
	@Override
	public boolean odemeAl(BigDecimal tutar) {
		bakiye = bakiye.add(tutar);
		
		return true;
	}

	@Override
	public boolean odemeYap(BigDecimal tutar) {
		bakiye = bakiye.subtract(tutar);
		
		return true;
	}

	@Override
	public BigDecimal getBakiye() {
		// TODO Auto-generated method stub
		return bakiye;
	}

}
