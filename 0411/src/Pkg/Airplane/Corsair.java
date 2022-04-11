package Pkg.Airplane;

import Pkg.Commons.Survive;

public class Corsair extends Airplane{
	
	public Corsair() {
		super();
	}
	
	public Corsair(int offense) {
		super(offense);
		this.unitKind=unitKind.Protoss;
	}

	@Override
	public void fly() {
		
		System.out.println("납니다");
		
	}

	@Override
	public void shotGun(Airplane attackPlane, Airplane receivePlane) {
		if(attackPlane.unitKind == receivePlane.unitKind){
			System.out.println("같은 종족은 공격할 수 없습니다.");
		}
		else {
			receivePlane.health-=attackPlane.offense*2;
			System.out.println("공격자 : 피가" + attackPlane.health + "남았습니다.");
			System.out.println("피습자 : 피가" + receivePlane.health + "남았습니다.");
			if(receivePlane.health<=0) {
				this.fall(receivePlane);
			}
		}
	}

	@Override
	public void fall(Airplane receivePlane) {
		System.out.println("추락하였습니다.");
		receivePlane.alive = Survive.die;
	}
}
