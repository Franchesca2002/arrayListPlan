package arraylist;

public class arraylistClase1 {

	public static void main(String[] args) {
		
		ArrayList<Double> calificaciones = new ArrayList<>();
		calificaciones.add(8.5);
		calificaciones.add(7.0);
		calificaciones.add(9.2);
		calificaciones.add(6.8);
		calificaciones.add(5.5);
		
		// calcular promedio
		
		double total = 0;
		for (double calificacionActual: calificaciones) {
			total += calificacionActual;
			
		}
		
		double promedio =total/calificaciones.size();
		
		//mostrar el promedio
		System.out.println("El promedio de las calificaciones es:" + promedio);
		

	}

}
