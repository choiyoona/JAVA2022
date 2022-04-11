package Pkg.Airplane;

import Pkg.Commons.*;

public abstract class Airplane {
   
   //속성
   protected int offense;
   protected int health;
   public UnitKind unitKind;
   
   protected Survive alive;
   
   //상속 시켜줘야 하기에 기본 생성자는 있어야 한다.
   public Airplane() {
      this.health = 40;
   }
   public Airplane(int offense) {
	  this.health = 40;
      this.offense = offense;
      this.alive = Survive.alive;
   }
   
   //추상 메써드
   public abstract void fly();
   public abstract void shotGun(Airplane attackPlane, Airplane receivePlane);
   public abstract void fall(Airplane receivePlane);

}