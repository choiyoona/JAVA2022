package Pkg.Units;

import Pkg.AirPlanes.AirPlane;
import Pkg.Commons.*;

public abstract class Unit implements IAttack, IUnits{
		//추상화
		//속성
		public String name;
		protected int offense;
		protected int health;
		protected int grade;
		protected UnitKind unitKind;
		
		public int getHealth() {
			return health;
		}
	
		public UnitKind getUnitKind() {
			return unitKind;
		}

		public Unit() {
			this.grade = 0;
		}
	
		//메소드
		@Override
		public void attack(IUnits unit) {
			
			if(unit instanceof AirPlane) {
				System.out.println("비행체 공격 불가");
			}
			else {
				//1.unit의 종족
				Unit a = (Unit) unit;
				if(a.unitKind == this.unitKind) {
					System.out.println("같은 종족 공격 불가");
				}
				else {
					//2.유닛의 종류 땅바닥에 기어댕기는 것들 / 날라다니는 것들 / Airplane / transfort태우는 것들
					if(a.health <=0) {
						a.die();
					}
					else {
					a.health = a.health- this.offense;
					System.out.println("---------------------");
					System.out.println(this.name + "가 "+a.name +"를 공격");
					System.out.println(a.name +"체력이 : " + a.health);
					System.out.println("---------------------");
					}
				}
			}
			
		}
		public abstract void upgrade();
		public abstract void die();

		
		
		
}
