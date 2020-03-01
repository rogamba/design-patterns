public abstract class Character {
	public WeaponBehavior weapon;

	public abstract void fight();

	public void setWepon(WeaponBehavior wb) {
		weapon = wb;
	}

}