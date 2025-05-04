package tp_3.ejercicio_6;

import tp_3.ejercicio_1.GeneralTree;

public class Ejercicio {
	
	public static void main(String[] args) {
		RedDeAguaPotable red = new RedDeAguaPotable(getRedDeAgua());
		double minimoCaudal = red.minimoCaudal(1000);
		System.out.println(minimoCaudal);
	}
	
	public static GeneralTree<Character> getRedDeAgua(){
		GeneralTree<Character> raiz = new GeneralTree<Character> ('A');
		
		GeneralTree<Character> nodo_1 = new GeneralTree<Character> ('B');
		GeneralTree<Character> nodo_2 = new GeneralTree<Character> ('C');
		GeneralTree<Character> nodo_3 = new GeneralTree<Character> ('D');
		GeneralTree<Character> nodo_4 = new GeneralTree<Character> ('E');
		GeneralTree<Character> nodo_2_1 = new GeneralTree<Character> ('F');
		GeneralTree<Character> nodo_2_2 = new GeneralTree<Character> ('G');
		GeneralTree<Character> nodo_3_1 = new GeneralTree<Character> ('H');
		GeneralTree<Character> nodo_3_2 = new GeneralTree<Character> ('I');
		GeneralTree<Character> nodo_3_3 = new GeneralTree<Character> ('J');
		GeneralTree<Character> nodo_3_4 = new GeneralTree<Character> ('K');
		GeneralTree<Character> nodo_3_5 = new GeneralTree<Character> ('P');
		GeneralTree<Character> nodo_3_3_1 = new GeneralTree<Character> ('M');
		GeneralTree<Character> nodo_3_3_2 = new GeneralTree<Character> ('N');
		GeneralTree<Character> nodo_2_2_1 = new GeneralTree<Character> ('L');

		
		raiz.addChild(nodo_1);
		raiz.addChild(nodo_2);
		raiz.addChild(nodo_3);
		raiz.addChild(nodo_4);
		
		nodo_2.addChild(nodo_2_1);
		nodo_2.addChild(nodo_2_2);
		
		nodo_2_2.addChild(nodo_2_2_1);
		
		nodo_3.addChild(nodo_3_1);
		nodo_3.addChild(nodo_3_2);
		nodo_3.addChild(nodo_3_3);
		nodo_3.addChild(nodo_3_4);
		nodo_3.addChild(nodo_3_5);
		
		nodo_3_3.addChild(nodo_3_3_1);
		nodo_3_3.addChild(nodo_3_3_2);

		return raiz;
	}

}
