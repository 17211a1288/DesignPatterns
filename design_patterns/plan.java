package design_patterns;


public abstract class plan {
	protected double rate;
	abstract void getRate();
	public void cal_Bill(int units) {
	 System.out.println(units*rate);
	}
}
