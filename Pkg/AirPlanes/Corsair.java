package Pkg.AirPlanes;


import Pkg.Commons.*;
import Pkg.Units.Unit;

public class Corsair extends AirPlane implements IShotgun{

	public Corsair() {
		super();
		this.offense =5;
		this.health =40;
		this.unitKind = UnitKind.Protoss;
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Shotgun(IUnits plane) {	
		if(plane instanceof AirPlane) {
			AirPlane a = (AirPlane)plane;
			//1.unit의 종족
			if(a.unitKind == this.unitKind) {
				System.out.println("같은 종족 공격 불가");
			}
			else {
				//2.유닛의 종류 땅바닥에 기어댕기는 것들 / 날라다니는 것들 / Airplane / transfort태우는 것들
				if(a.health <=0) {
					a.fall();//생명이 다 되면 죽기.
				}
				else {
				a.health = a.health - this.offense*2; //총을 쏘는 상대가 Mutal이면 공격력 2배로 적용
				System.out.println("---------------------");
				System.out.println(this.name + "가 "+a.name +"를 공격");
				System.out.println(a.name +"체력이 : " + a.health);
				System.out.println("---------------------");
				}
			}	
			
		}
		else if(plane instanceof Unit){
			Unit b = (Unit)plane;
			int c = b.getHealth(); 
			if(b.getUnitKind() ==this.unitKind) {
				c = b.getHealth()-this.offense;
			}
			else {
				//2.유닛의 종류 땅바닥에 기어댕기는 것들 / 날라다니는 것들 / Airplane / transfort태우는 것들
				if(c <=0) {
					b.die();//생명이 다 되면 죽기.
				}
				else {
				c = c - this.offense*2; //총을 쏘는 상대가 Mutal이면 공격력 2배로 적용
				System.out.println("---------------------");
				System.out.println(this.name + "가 "+b.name +"를 공격");
				System.out.println(b.name +"체력이 : " + c);
				System.out.println("---------------------");
				}
			}	
			
		}
		
		
	}
	

	@Override
	public void fall() {
		// TODO Auto-generated method stub
		
	}


}
