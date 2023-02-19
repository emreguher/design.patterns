package design.patterns.proxy;

import java.math.BigDecimal;

public interface IMuhasebe {
	
	boolean odemeAl(BigDecimal tutar);
	boolean odemeYap(BigDecimal tutar);
	BigDecimal getBakiye();

}
