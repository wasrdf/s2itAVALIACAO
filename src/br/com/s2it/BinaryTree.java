package br.com.s2it;

public class BinaryTree {

	private int valor;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree(int valor) {
		this.valor = valor;
		this.left = null;
		this.right = null;
	}

	public void add(int item) {
		int valorAtual = valor;
		if (item < valorAtual) {
			if (left == null) {
				left = new BinaryTree(item);
			} else {
				left.add(item);
			}
		} else {
			if (right == null) {
				right = new BinaryTree(item);
			} else {
				right.add(item);
			}
		}
	}

}
