package bus;

public class ModNCounter extends Counter{

	private int maxLimit;

	public ModNCounter() {
		super();
	}

	public ModNCounter(long serialNumber, int value, int maxLimit) {
		super(serialNumber, value);
		this.maxLimit = maxLimit;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	@Override
	public String toString() {
		return super.toString() + " - ModNCounter [maxLimit=" + maxLimit + "]";
	}
	
	@Override
	public void reset() {
		this.setValue(1);
	}
	
}
