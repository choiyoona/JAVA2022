package Pkg_Exec;

import Pkg.Airplane.*;
import Pkg_Unit.*;
import TextPkg.Airplane.Corsair02;

public class Exec {

	public static void main(String[] args) {
		
		Zerling zerg1 = new Zerling();
		Zerling zerg2 = new Zerling();
		zerg1.unitName = "첫번째 저그";
		zerg2.unitName = "두번째 저그";
		zerg1.attack(zerg1,zerg2);
	
		zerg1.attack(zerg1,zerg2);
		zerg2.attack(zerg2,zerg1);
		
		zerg1.upgrade(zerg1);
		
		Zelrot zel1 = new Zelrot();
		zel1.walk();
		
		Mutal mut1 = new Mutal(10);
		Corsair cor1 = new Corsair(15);
		
		mut1.fly();
		mut1.shotGun(mut1, cor1);
		mut1.shotGun(mut1, cor1);
		mut1.shotGun(mut1, cor1);
		mut1.shotGun(mut1, cor1);
		
		Corsair02 cor03 = new Corsair02();
		Corsair02 cor05 = new Corsair02();
		cor03.shotGun(cor03, cor05);
		
	}

}
