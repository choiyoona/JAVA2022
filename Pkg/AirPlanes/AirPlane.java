package Pkg.AirPlanes;

import Pkg.Commons.*;
import Pkg.Units.*;

public abstract class AirPlane implements IShotgun{
	
	public String name;
	protected int health; //상속
	protected int offense;
	protected UnitKind unitKind;
	
	public AirPlane() {
		
	}
	
	
	public abstract void fly();
	//비행기는 하늘에 있는 놈들만 가능
	public abstract void fall();
	
}
