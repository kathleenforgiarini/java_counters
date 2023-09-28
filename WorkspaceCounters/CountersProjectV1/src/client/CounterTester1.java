package client;

import java.util.ArrayList;
import bus.*;

public class CounterTester1 {

	public static void main(String[] args) {
		
		ArrayList<Counter> listOfCounters = new ArrayList<Counter>();
		
		ArrayList<StepCounter> listOfStepCounters = new ArrayList<StepCounter>();
		ArrayList<ModNCounter> listOfModNCounters = new ArrayList<ModNCounter>();
		
		Counter sc1 = new StepCounter(1000, 15, 5);
		listOfCounters.add(sc1);
		
		Counter mnc1 = new ModNCounter(2000, 3, 45);
		listOfCounters.add(mnc1);
		
		Counter sc2 = new StepCounter(1001, 20, 2);
		listOfCounters.add(sc2);
		
		Counter mnc2 = new ModNCounter(2001, 5, 75);
		listOfCounters.add(mnc2);
		
		System.out.println("List of counters");
		for(Counter item : listOfCounters) {
			System.out.println(item.toString());
		}
		
		for (Counter item : listOfCounters) {
			if (item instanceof StepCounter) {
				listOfStepCounters.add((StepCounter)item);
			}
			else if (item instanceof ModNCounter) {
				listOfModNCounters.add((ModNCounter)item);
			}
		}
		
		System.out.println("List of step counters");
		for(StepCounter item : listOfStepCounters) {
			System.out.println(item.toString());
		}
		
		System.out.println("List of mod N counters");
		for(ModNCounter item : listOfModNCounters) {
			System.out.println(item.toString());
		}
		
		System.exit(0);
		
	}

}

/*
List of counters
Counter [serialNumber=1000, value=15] - StepCounter [step=5]
Counter [serialNumber=2000, value=3] - ModNCounter [maxLimit=45]
Counter [serialNumber=1001, value=20] - StepCounter [step=2]
Counter [serialNumber=2001, value=5] - ModNCounter [maxLimit=75]
List of step counters
Counter [serialNumber=1000, value=15] - StepCounter [step=5]
Counter [serialNumber=1001, value=20] - StepCounter [step=2]
List of mod N counters
Counter [serialNumber=2000, value=3] - ModNCounter [maxLimit=45]
Counter [serialNumber=2001, value=5] - ModNCounter [maxLimit=75]
 */