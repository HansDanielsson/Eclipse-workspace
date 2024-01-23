package mult;

import java.util.Random;

public class Entry extends Thread {
	Random randomgenerator = new Random();
	private static int ids;
	private boolean threadalive = true;

	public Entry() {
	}

	@Override
	public void run() {
		int timecustomerenter = 0;

		while (this.threadalive) {
			timecustomerenter = 1000 + 1000 * randomgenerator.nextInt(3);

			try {
				Thread.sleep(timecustomerenter);
				this.entry(timecustomerenter);
			} catch (InterruptedException e) {
				System.out.println("Entry Interrupted");
			}
		}
	}

	public void entry(int timecustomerenter) {
		int wichqueue = randomgenerator.nextInt(2);
		int wichfood = randomgenerator.nextInt(3);
		int timetodecide = 1000 + 1000 * randomgenerator.nextInt(3);
		String foodname = "";

		switch (wichfood) {
		case 0:
			foodname = "burger";
			break;
		case 1:
			foodname = "sandwich";
			break;
		case 2:
			foodname = "salad";
			break;
		default:
			break;
		}

		CustomerQueues.enterCustomer(wichqueue, new Customer(ids++, timetodecide, foodname));

		System.out.println("Customer #" + ids + " enters " + (timecustomerenter / 1000) + " seconds later to queue "
				+ (wichqueue + 1));
	}

	public void end() {
		this.threadalive = false;
	}
}