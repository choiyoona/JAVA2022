package Pkg.Exec;

import Pkg.Units.Zergling;

public class Exec {

	public static void main(String[] args) {
		Zergling zerg1 = new Zergling();
		Zergling zerg2 = new Zergling();
		zerg1.unitName = "첫번째 저그";
		zerg2.unitName = "두번째 저그";
		zerg1.attack(zerg1,zerg2);
	
	}

}
