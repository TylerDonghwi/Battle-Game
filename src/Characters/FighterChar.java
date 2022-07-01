package Characters;

import EnumsForAttack.Ability;
import EnumsForAttack.AttackRange;
import EnumsForAttack.AttackType;

public class FighterChar extends Characters {

	public FighterChar() {
		super("Fighter", 100, 100, 100, AttackRange.CLOSE, AttackType.SINGLE, Ability.NONE, 3);
	}

}
