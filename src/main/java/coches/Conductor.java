package coches;

public class Conductor {
	
	private IVehiculo vehiculo;
	
	public Conductor() {
		// TODO Auto-generated constructor stub
	}

	public Conductor(IVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public IVehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(IVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	@Override
	public String toString() {
		return "\t "+vehiculo;
	}

}
