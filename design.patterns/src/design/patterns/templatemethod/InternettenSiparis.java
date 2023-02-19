package design.patterns.templatemethod;

public class InternettenSiparis extends SiparisSureciTemplate {

	@Override
	public void urunSec() {
		System.out.println("Kullanıcı seçtiği ürünüğ sepete attı");
		System.out.println("Kullanıcı ürünün hediye olup olmayacağına karar verdi.");
		setHediyeMi(true);
		System.out.println("Kullanıcıdan teslimat adresi alınır");

	}

	@Override
	public void odemeYap() {
		System.out.println("Kullanıcı ödeme şeklini seçti");
		System.out.println("Kullanıcı ödeme bilgilerini girdi.");
		System.out.println("Kullanıcıdan ödeme al.");

	}

	@Override
	public void urunuTeslimEt() {
		System.out.println("Kullanıcı teslimat yöntemi seçti");
		System.out.println("Ürün kargolandı.");

	}

}
