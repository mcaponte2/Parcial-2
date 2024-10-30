package logica;
import java.util.ArrayList;

public class Parcial {
	public ArrayList<Double> calcularRaices(int a, int b, int c) throws Exception{
		if (a==0) {
			throw new Exception("a no puede ser cero");
		}
		double discriminante= (b*b)-(4*a*c);
		
		if (discriminante<0) {
			throw new Exception("el discriminante tiene que ser mayor a 0, así que las raíces no son números reales");
		}
		double raizdiscriminante=Math.sqrt(discriminante);
		double primeraraiz= ((-b)+raizdiscriminante)/(2*a);
		double segundaraiz= ((-b)-raizdiscriminante)/(2*a);
		ArrayList<Double> raices= new ArrayList<>();
		raices.add(primeraraiz);
		raices.add(segundaraiz);
		return raices;
	}
	
	
	
	
	
}
