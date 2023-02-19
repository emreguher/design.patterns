package design.patterns.templatemethod;

public abstract class SiparisSureciTemplate {

	// public static final int[] PAKETLENMEYEN_URUNLER =
	// {11,34,57};

	private boolean hediyeMi;

	public abstract void urunSec();

	public boolean isHediyeMi() {
		return hediyeMi;
	}

	public void setHediyeMi(boolean hediyeMi) {
		this.hediyeMi = hediyeMi;
	}

	public abstract void odemeYap();

	public abstract void urunuTeslimEt();

	private void hediyePaketle() {
		try {
			System.out.println("Hediye paketlendi");
		} catch (Exception e) {
			System.out.println("Seçtiğiniz ürün paketlemeye uygun değil");
		}

	}

	private void stoktanDus(int urunId, int adet) {
		
	}
	// template method
	public final void siparisGerceklestir() {
		urunSec();
		odemeYap();

		if (hediyeMi == true) {
			hediyePaketle();
		}
		
		urunuTeslimEt();
		stoktanDus(1,5);
	}

}
