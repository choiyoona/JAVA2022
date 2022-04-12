package Pkg.Units;

import Pkg.Commons.UnitKind;

	public class Zelrot extends Unit{
	
		public Zelrot() {
			super();
			this.offense =2;
			this.health =10;
			this.unitKind =UnitKind.Protoss;
		}
		
	
			//하나의 메소드로 여러가지 형태와 성질로 표현할 수 있다. -> 다형성 예)오버로딩
		
		@Override
		public void upgrade() {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void die() {
			// TODO Auto-generated method stub
			
		}

}
