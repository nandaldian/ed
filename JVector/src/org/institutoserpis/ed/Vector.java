package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int index=0;
	//	while (index < 5) {
		//	System.out.println("index=" + index);
			//index++;
		
		//}
		int[] v = new int[]{32, 15, 7, 9, 12};
		//for (int index = 0; index < 5; index++) Esto se puede replazar por lo de abajo.
		//for (int index = 0; index < v.length; index++){
			//v[index] = index * 10; En caso de querer asignarle valores al index de 10 en 10.
			// (sin inicializarlo arriba)
		//System.out.println("v["+ index + "]=" + v[index]);
		//}
		System.out.println("indexOf=" +indexOf(v, 32));
		
	}
	public static int indexOf(int[] v, int data) {
		//implementación basada en libro de Wirth Algoritmos y Estructuras de Datos
//		int index = 0;
//		while (index < v.length && v[index] != item)
//			index++;
//		if (index == v.length)
//			return -1; //no encontrado
//		return index;

		
		//otra implementación
//		for (int index = 0; index < v.length; index++)
//			if (v[index] == item)
//				return index;
//		return -1;
		
		
		//otra implentacion con for each
		int index = 0;
		for (int item : v){
			if (item == data)
				return index;
			index++;
		}
		return -1;
	}
	public static int min(int[] v) {
		int min = v[0];
//		for (int index = 1; index < v.length; index++)
//			if (v[index] < min)
//				min = v[index];
//		return min;
		
		//Alternativa con for each
		for (int item : v)
			if (item < min)
				min=item;
		return min;
		
	}
}
