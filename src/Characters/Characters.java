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
	protected int cost; // cost when building teams

	public Characters(int health, int attackDmg, int speed, AttackRange attackRange, AttackType attackType,
			Ability ability, int cost) {
		super();
		this.health = health;
		this.attackDmg = attackDmg;
		this.speed = speed;
		this.attackRange = attackRange;
		this.attackType = attackType;
		this.ability = ability;
		this.cost = cost;
	}

	/**
	 * attack
	 * 
	 * @param target
	 */
	public void attack(Characters target) {

		target.health -= this.attackDmg;
	}

}
