package Pkg_Unit;

import Pkg.Commons.*;

public class Zerling extends Unit implements IZerg{
	
	private int exp;
	
	public Zerling(){
		this.health = 10;
		this.offense = 2;
		//this.unitKind = UnitKind.Zerg;
	}
	
	//메소드
	@Override
	public void attack(Unit attackUnit, Unit receiveUnit) {
		if(attackUnit.unitKind ==receiveUnit.unitKind) {
			System.out.println("같은 종족은 공격이 불가합니다.");
		}
		else {
			receiveUnit.health = receiveUnit.health - attackUnit.offense;
			System.out.println("--------------------------------------");
			System.out.println(attackUnit.unitName + "공격합니다.");
			System.out.println(receiveUnit.unitName + "공격당합니다.");
			System.out.println(attackUnit.unitName + "남은 체력 : " + attackUnit.health);
			System.out.println(receiveUnit.unitName + "남은 체력 : " + receiveUnit.health);
			System.out.println("--------------------------------------");
			
			if(receiveUnit.health <=0) {
				this.die(receiveUnit);
			}
		}
		
	}

	@Override
	public void upgrade(Unit attackUnit) {
		attackUnit.grade++;
		attackUnit.offense++;
		System.out.println("업그레이드합니다.");
	}

	@Override
	public void die(Unit dieUnit) {
			System.out.println(dieUnit.unitName + "가 죽었습니다.");
			dieUnit.alive = Survive.die;
	}
	
	
}
