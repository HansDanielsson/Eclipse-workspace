package space;

import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor {
	public String skill;

	public RedAstronaut(String inName, int inSusLevel, String inSkill) {
		super(inName, inSusLevel);
		skill = inSkill;
	}

	public RedAstronaut(String inName) {
		this(inName, 15, "experienced");
	}

	public void emergencyMeeting() {
		if (!isFrozen()) {
			int posHighSysL = -1;
			int nextHighSysL = -1;
			Player[] p = Player.getPlayers();
			Arrays.sort(p);
			int posHigh = p.length - 1;
			while ((posHigh > 0) && (p[posHigh].isFrozen() || (p[posHigh] instanceof Impostor))) {
				posHigh--;
			}
			if ((posHigh >= 0) && !(p[posHigh].isFrozen() || (p[posHigh] instanceof Impostor))) {
				posHighSysL = p[posHigh].getSusLevel();
			}
			int nextHigh = posHigh - 1;
			while ((nextHigh > 0) && (p[nextHigh].isFrozen() || (p[nextHigh] instanceof Impostor))) {
				nextHigh--;
			}
			if ((nextHigh >= 0) && !(p[nextHigh].isFrozen() || (p[nextHigh] instanceof Impostor))) {
				nextHighSysL = p[nextHigh].getSusLevel();
			}
			if (posHighSysL != nextHighSysL) {
				p[posHigh].setFrozen(true);
			}
			gameOver();
		}
	}

	public void freeze(Player p) {
		if (!(p instanceof Impostor) && !isFrozen() && !p.isFrozen()) {
			if (getSusLevel() < p.getSusLevel()) {
				p.setFrozen(true);
			} else {
				setSusLevel(2 * getSusLevel());
			}
			gameOver();
		}
	}

	public void sabotage(Player p) {
		if (!(p instanceof Impostor) && !isFrozen() && !p.isFrozen()) {
			int sLevel = p.getSusLevel();
			if (getSusLevel() < 20) {
				sLevel = (int) (1.5 * sLevel);
			} else {
				sLevel = (int) (1.25 * sLevel);
			}
			p.setSusLevel(sLevel);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof RedAstronaut) {
			RedAstronaut redAstronaut = (RedAstronaut) o;
			return (getName().equals(redAstronaut.getName())) && (isFrozen() == redAstronaut.isFrozen())
					&& (getSusLevel() == redAstronaut.getSusLevel()) && (skill.equals(redAstronaut.skill));
		}
		return false;
	}

	@Override
	public String toString() {
		String msg = super.toString() + " I am an " + skill + " player!";
		if (this.getSusLevel() > 15) {
			msg = msg.toUpperCase();
		}
		return msg;
	}
}