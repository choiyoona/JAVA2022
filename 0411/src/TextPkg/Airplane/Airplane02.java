package TextPkg.Airplane;

import Pkg.Commons.*;

public abstract class Airplane02 implements IZerg, IProtoss{
	   //속성
	   protected int offense;
	   protected int health;
	   //protected UnitKind unitKind;
	   
	   //상속 시켜줘야 하기에 기본 생성자는 있어야 한다.
	   public Airplane02() {
	      this.health = 40;
	   }
	   public Airplane02(int offense) {
		  this.health = 40;
	      this.offense = offense;
	   }
	   
	   //추상 메써드
	   public abstract void fly();
	   public abstract void shotGun(Airplane02 attackPlane, Airplane02 receivePlane);
	   public abstract void fall(Airplane02 receivePlane);

	
}
