package design.patterns.templatemethod;

public class MagazadanSatis extends SiparisSureciTemplate {

	@Override
	public void urunSec() {
		System.out.println("Müşteri ürünü seçti");
		System.out.println("Müşteri ürünü kasaya getirdi");
		System.out.println("Kasada ürünün barkodu okundu");

	}

	@Override
	public void odemeYap() {

		System.out.println("Müşteri ödeme şeklini seçti.");
		System.out.println("Müşteri ödeme yaptı");
	}

	@Override
	public void urunuTeslimEt() {
		System.out.println("Ürün müşteriye elden teslim edildi.");

	}

}
