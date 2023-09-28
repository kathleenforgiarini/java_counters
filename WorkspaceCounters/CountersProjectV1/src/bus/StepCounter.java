package bus;

public class StepCounter extends Counter {
	private int step;

	public StepCounter() {
		super();
	}

	public StepCounter(long serialNumber, int value, int step) {
		super(serialNumber, value);
		this.step = step;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	@Override
	public String toString() {
		return super.toString() + " - StepCounter [step=" + step + "]";
	}

	@Override
	public void increment() {
		this.setValue(this.getValue() + this.step);
	}
	
	@Override
	public void decrement() {
		this.setValue(this.getValue() - this.step);
	}

	//proper services of the subclass
	public void increment(int newStep) {
		this.setValue(this.getValue() + newStep);
	}
	
	public void decrement(int newStep) {
		this.setValue(this.getValue() - newStep);
	}
}
