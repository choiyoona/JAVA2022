package Pkg_Unit;

import Pkg.Commons.IProtoss;
import Pkg.Commons.Survive;
import Pkg.Commons.UnitKind;

public class Zelrot extends Unit implements IProtoss{

	private int exp;
	
	public Zelrot(){
		this.health = 20;
		this.offense = 3;
		//this.unitKind = UnitKind.Protoss;
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
		System.out.println("업그레이드합니다.");
	}

	@Override
	public void die(Unit dieUnit) {
		System.out.println(dieUnit.unitName + "가 죽었습니다.");
		dieUnit.alive = Survive.die;
}
	public void walk() {
		System.out.println("걷습니다");
	}
		
}
//저글링은 set을 고칠수없다
//날아다니는 애들은 죽일 수 없다
//저그유닛은 서로를 공격할 수 없다
//Zelrot도 set속성을 가질수없다

//상대가 있어야 때린다
//오쉣 누구를 공격하는지 값을 받아야함
//추상클래스 만들기 속성 private 추상에는 getset필요없음
//overload = zerg
//



