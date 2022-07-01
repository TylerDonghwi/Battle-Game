package Characters;

import EnumsForAttack.Ability;
import EnumsForAttack.AttackRange;
import EnumsForAttack.AttackType;

public abstract class Characters {

	// each character must have these following attributes
	protected int health;
	protected int attackDmg;
	protected int speed;
	protected AttackRange attackRange;
	protected AttackType attackType;
	protected Ability ability;

}
