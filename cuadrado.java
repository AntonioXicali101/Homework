package ejercicio1;

public class cuadrado {
	
	public int id, x;
	
	public cuadrado() {
		x= id =174527;
	}
	
	public double calcularPerimetro() 
	{
		return (int) id*4;
	}

	public void cambiaLongitud(int x) {
		id=x;
	}
	
	public double calcularArea()
	{
		return (int) id*id;
		
	}
	
	public float diagonal()

	{
		return (float) Math.sqrt((x*x)+(x*x));
	}
	
}
