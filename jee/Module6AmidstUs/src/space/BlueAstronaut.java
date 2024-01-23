package space;

import java.util.Arrays;

public class BlueAstronaut extends Player implements Crewmate {
	public int numTask;
	public int taskSpeed;

	public BlueAstronaut(String inName, int inSusLevel, int inNumTask, int inTaskSpeed) {
		super(inName, inSusLevel);
		numTask = inNumTask;
		taskSpeed = inTaskSpeed;
	}

	public BlueAstronaut(String inName) {
		this(inName, 15, 6, 10);
	}

	public void emergencyMeeting() {
		if (!isFrozen()) {
			int posHighSysL = -1;
			int nextHighSysL = -1;
			Player[] p = Player.getPlayers();
			Arrays.sort(p);
			int posHigh = p.length - 1;
			while ((posHigh > 0) && (p[posHigh].isFrozen() || (p[posHigh] instanceof Crewmate))) {
				posHigh--;
			}
			if ((posHigh >= 0) && !(p[posHigh].isFrozen() || (p[posHigh] instanceof Crewmate))) {
				posHighSysL = p[posHigh].getSusLevel();
			}
			int nextHigh = posHigh - 1;
			while ((nextHigh > 0) && (p[nextHigh].isFrozen() || (p[nextHigh] instanceof Crewmate))) {
				nextHigh--;
			}
			if ((nextHigh >= 0) && !(p[nextHigh].isFrozen() || (p[nextHigh] instanceof Crewmate))) {
				nextHighSysL = p[nextHigh].getSusLevel();
			}
			if (posHighSysL != nextHighSysL) {
				p[posHigh].setFrozen(true);
			}
			gameOver();
		}
	}

	public void completeTask() {
		if ((numTask > 0) && !isFrozen()) {
			if (taskSpeed > 20) {
				numTask -= 2;
			} else {
				numTask--;
			}
			if (numTask < 0) {
				numTask = 0;
			}
			if (numTask == 0) {
				System.out.println("I have completed all my tasks");
				setSusLevel(getSusLevel() / 2);
			}

		}
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof BlueAstronaut) {
			BlueAstronaut blueAstronaut = (BlueAstronaut) o;
			return (getName().equals(blueAstronaut.getName())) && (isFrozen() == blueAstronaut.isFrozen())
					&& (getSusLevel() == blueAstronaut.getSusLevel()) && (numTask == blueAstronaut.numTask)
					&& (taskSpeed == blueAstronaut.taskSpeed);
		}
		return false;
	}

	@Override
	public String toString() {
		String msg = super.toString() + " I have " + numTask + " left over.";
		if (this.getSusLevel() > 15) {
			msg = msg.toUpperCase();
		}
		return msg;
	}
}