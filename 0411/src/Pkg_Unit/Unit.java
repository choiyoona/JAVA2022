package Pkg_Unit;

import Pkg.Commons.*;

public abstract class Unit implements IZerg, IProtoss{
		public String unitName;
		protected int offense;
		protected int health;
		protected int grade;
		protected UnitKind unitKind;
		
		protected Survive alive;
		//속성
		public Unit(){
			this.grade = 0;
			this.alive = Survive.alive;
		}

		
		//메소드
		public abstract void attack(Unit attackUnit, Unit receiveUnit);
		public abstract void upgrade(Unit attackUnit);
		public abstract void die(Unit dieUnit);
		
		
}
