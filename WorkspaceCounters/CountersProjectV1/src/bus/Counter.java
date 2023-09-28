package bus;

public class Counter {
	
	//private data members
	private long serialNumber;
	private int value;
	
	// -1- overloaded constructors
	public Counter() {
		super();
	}
	
	public Counter(long serialNumber, int value) {
		super();
		this.serialNumber = serialNumber;
		this.value = value;
	}

	
	// -2- getters/setters
	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Counter [serialNumber=" + serialNumber + ", value=" + value + "]";
	}

	//public counter services
	public void increment() {
		this.value ++;
	}
	
	public void decrement() {
		this.value --;
	}
	
	public void reset() {
		this.value = 0;
	}
}




























































