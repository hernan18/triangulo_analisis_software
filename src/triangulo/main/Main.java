package triangulo.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingrese los tres numeros");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		try {
			// Leo la linea
			linea = br.readLine();
			//hago el split y tengo un vector con los "numeros"
			String[] numeros = linea.split(" ");
			//Pregunto si tengo si o si tres argumetos
			if (numeros.length == 3) {
				try {
					Triangulo triangulo = new Triangulo();
					triangulo.setLadosTriangulos(Integer.parseInt(numeros[0]), Integer.parseInt(numeros[1]),
							Integer.parseInt(numeros[2]));
					System.out.println(triangulo.getTipoTrinagulo());
				} catch (NumberFormatException e) {
					System.out.println("Los argumentos no son numericos.");
				}
			}
			else{
				System.out.println("Debe pasar obligatoriamente tres argumentos");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
