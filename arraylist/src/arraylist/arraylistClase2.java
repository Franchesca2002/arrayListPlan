package arraylist;

public class arraylistClase2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista =new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		int suma =0;
		for (int num: lista) {
			suma += num;
		}
         
		System.out.println("Suma de elementos: " + suma);
	}

}
