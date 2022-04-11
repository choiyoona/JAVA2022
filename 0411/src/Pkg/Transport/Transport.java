package Pkg.Transport;

public abstract class Transport {
		protected int health;
		protected int pickupNum;
		
		public Transport() {
			
		}
		public Transport(int health, int pickupNum) {
			this.health = health;
			this.pickupNum = pickupNum;
		}
		
		//메소드
		public abstract void fly();
		
		public abstract void pickup();
	
}
