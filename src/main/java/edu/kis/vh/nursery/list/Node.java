package edu.kis.vh.nursery.list;

/**
 * @author Artur
 *  Klasa reprezentujaca wezel, jest przechowywana jako element klasy IntLinkedList
 */
public final class Node {
	/**
	 * value przechowuje wartosc wezla
	 * prev - zmienna która przechowuje referencję do poprzedniego wezla
	 * next - zmienna która przechowuje referencję do następnego wezla
	 */
	int value;
	public Node prev, next;

	/** Konstruktor klasy Node, tworzy wezel o podanej wartosci
	 * @param i zmienna, ktora jest przypisywana jako wartosc wezla
	 */
	public Node(int i) {
		value = i;
	}
	
}
