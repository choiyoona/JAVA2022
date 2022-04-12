package Pkg.Exec;

import Pkg.AirPlanes.*;
import Pkg.Units.*;

public class Exec {

	public static void main(String[] args) {
		
		Zergling zerg1 = new Zergling();
		zerg1.name="저글링1";
		Zergling zerg2 = new Zergling();
		zerg2.name="저글링2";
		Zergling zerg3 = new Zergling();
		zerg3.name="저글링3";
		Zelrot zelrot1 = new Zelrot();
		zelrot1.name="질럿1";
		Zelrot zelrot2 = new Zelrot();
		zelrot2.name="질럿2";
		
		zerg1.attack(zerg2);
		zerg1.attack(zerg3);
		zerg1.attack(zelrot1);
		zerg1.attack(zelrot1);
		zerg1.attack(zelrot1);
		zerg1.attack(zelrot1);
		zerg1.attack(zelrot1);
		
		/*Mutal mut1 = new Mutal();
		mut1.name="뮤탈1";
		Mutal mut2 = new Mutal();
		mut1.name="뮤탈2";
		Corsair cor1= new Corsair();
		cor1.name = "콜1";
		mut1.shotGun(cor1);*/
		
		
	}

}
