public class King extends Character {

	WeaponBehavior weapon;

	public King(){
		weapon = new AxeBehavior();
	}

	public void fight() {
		weapon.userWeapon();
	}
}