package edu.kis.vh.nursery.list;

/**
 * @author Artur
 *  Klasa reprezentujaca wezel, jest przechowywana jako element klasy IntLinkedList
 */
final class Node {
	/**
	 * value przechowuje wartosc wezla
	 * prev - zmienna która przechowuje referencję do poprzedniego wezla
	 * next - zmienna która przechowuje referencję do następnego wezla
	 */
	int value;
	Node prev, next;

	/** Konstruktor klasy Node przyjmujacy parametr typu int, inicjuje pole value
	 * @param i zmienna, ktora jest przypisywana jako wartosc wezla
	 */
	Node(int i) {
		value = i;
	}

}
