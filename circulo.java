package ejercicio1;

public class circulo {
	
	public double pi;
	public int id, radio;
	
	public circulo() {
		pi = 3.1416; 	
		radio = id = 17; 
	}
	 
	public double calcularcircunferencia() 
	{
		return (2*pi)*id;
	}
	
	public void cambiavalor(int x) {
		x = id;
	}
	
	public double calculararea()
	{
		return pi*(id*id);
	}

}
