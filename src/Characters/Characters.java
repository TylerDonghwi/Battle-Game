package Characters;

import EnumsForAttack.Ability;
import EnumsForAttack.AttackRange;
import EnumsForAttack.AttackType;

public abstract class Characters {

	// each character must have these following attributes

	protected String name;
	protected int health;
	protected int attackDmg;
	protected int speed;
	protected AttackRange attackRange;
	protected AttackType attackType;
	protected Ability ability;
	protected int cost; // cost when building teams
	protected boolean dead;

	public Characters(String name, int health, int attackDmg, int speed, AttackRange attackRange, AttackType attackType,
			Ability ability, int cost) {
		this.name = name;
		this.health = health;
		this.attackDmg = attackDmg;
		this.speed = speed;
		this.attackRange = attackRange;
		this.attackType = attackType;
		this.ability = ability;
		this.cost = cost;
		this.dead = false;
	}

	/**
	 * attack
	 * 
	 * @param target
	 */
	public void attack(Characters target) {
		System.out.println(this.name + " attacked " + target.name + "!");
		target.health -= this.attackDmg;
		System.out.println(this.name + " delt " + this.attackDmg + "!");
		System.out.println("Remaining health for " + target.name + " is " + target.health + "!");
		checkIfDead(target);
	}

	protected void checkIfDead(Characters target) {
		if (target.health == 0) {
			dead = true;
		}
		System.out.println(target.name + " died");
	}

}
