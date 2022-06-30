package com.tns.framework;


public abstract class NormalAcc extends ShopAcc {

	// final private class variable
	private final static float deliveryCharges = 40.0f;

	// Constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
	}

	// to access private variable we need getter and setter
	public static float getDeliveryCharges() {
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float book) {

	}

	@Override
	public String toString() {
		return super.toString() + " NormalAcc{" + "deliveryCharges=" + deliveryCharges + '}';
	}
}
