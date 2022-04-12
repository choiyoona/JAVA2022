package Pkg.AirPlanes;

import Pkg.Commons.IUnits;
import Pkg.Commons.UnitKind;

public class Mutal extends AirPlane{

	public Mutal() {
		super();
		this.offense =5;
		this.health =40;
		this.unitKind = UnitKind.Zerg;
	}
	
	public Mutal(int offense) {
		super();
		this.health =40;
		this.unitKind = UnitKind.Zerg;
		this.offense = offense;
	}
	
	@Override
	public void fly() {
		
	}

	@Override
	public void Shotgun(IUnits plane) {
		
	}

	@Override
	public void fall() {
		
	}

}
