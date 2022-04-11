package TextPkg.Airplane;
import Pkg.Airplane.Airplane;
import Pkg.Commons.IProtoss;

public class Corsair02 extends Airplane implements IProtoss{
		
		public Corsair02() {
			super();
		}
		
		public Corsair02(int offense) {
			super(offense);
		}

		@Override
		public void fly() {
			System.out.println("납니다");
		}

		@Override //비행선은 땅에 있는 아이들도 공격할 수 있지만 변수 타입이 다르다는 문제점이 있다
		public void shotGun(Airplane attackPlane, Airplane receivePlane) {
			if(receivePlane instanceof IProtoss){
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
		}
	
}
