package Pkg.Units;

import Pkg.Commons.*;

public abstract class Unit {
	public String unitName;
	protected int offense;
	protected int health;
	protected int grade;
	//protected UnitKind unitKind;
	protected Death death;//죽었는지 살았는지
	
	
	//속성
	public Unit() {
		this.grade = 0;
		this.death = death.alive;//시작은 살아있음.
	}
	
	//메소드
	public abstract void attack(Unit attackUnit, Unit receiveUnit);
	public abstract void upgrade(Unit attackUnit);
	public abstract void die(Unit dieUnit);
		
}
