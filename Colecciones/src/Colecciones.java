
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * La colleccion Set no puede contener elementos duplicados
		 * Sólo tiene los elementos heredados de Collection
		 * Exiten diferentes tipos de emplementaciones.
		 * 
		 * HashSet: Esta implementacion almacena los elementos en una tabla
		 * hash. Es la que mejor rendimiento tiene.
		 * Los elementos no tienen un orden.
		 * 
		 * TreeSet: Es el mas lento, pero ordena los numeros de mayor a menor o
		 * las letas de A-B.
		 */
		/*Set<String> frutas = new LinkedHashSet();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}*/
		//System.out.println(frutas.contains("Mango"));
		//System.out.println(frutas.contains("Cuayaba"));
		//System.out.println(frutas.size());
		
		/*
		 * La interfaz list define una sucesrion de elementos.
		 * Si admite elementos duplicados
		 * Añade nuevos metodos que podemos usar.
		 * Acceso personalposicional a elementos: manipula elementos en 
		 * funcion de su posición en lista.
		 * 
		 * Busqueda de elementos: Busca un elemento concreto de la lista
		 * y devuelve su posición.
		 * Rango de operación: permite realizar ciertas operaciones sobre 
		 * rangos de elementos de la propia lista
		 *  
		 */
		/*List<String> frutas = new LinkedList<String>();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		int pera = frutas.indexOf("Pera");
		System.out.println(pera);
		System.out.println(frutas.get(pera));
		
		/*
		 * La interfaz Map asocia claves a valores.
		 * No puede contener claves deuplicadas y cada 
		 * clave solo puede tener asociado un valor.
		 * 
		 * Implementaciones
		 * HasMap
		 * TreeMap
		 * LinkedHasdMap
		 */
		Map<Integer, String> diccionario = new LinkedHashMap<Integer, String>();
		diccionario.put(1, "Carlos Eduardo");
		diccionario.put(2, "Eduardo Carlos");
		diccionario.put(3, "Penelope Eduardo");
		
		System.out.println(diccionario.get(1));
		
		for(Map.Entry<Integer, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
