package sortPackage;

import java.util.*;

public class BinaryTree<E> implements Tree<E> {
	
	private E data;
	private BinaryTree<E> left;
	private BinaryTree<E> right;
	private BinaryTree<E> parent;
	
	public BinaryTree(E data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	public E getData(){
		return data;
	}
	
	public BinaryTree<E> getLeft(){
		return left;
	}
	
	public BinaryTree<E> setLeft(BinaryTree<E> left){
		this.left = left;
		if(left != null){
			left.parent = this;
		}
	}
	
	public BinaryTree<E> getRight(){
		return right;
	}
	
	private BinaryTree<E> getParent(){
		return parent;
	}
	public BinaryTree<E> setRigt(BinaryTree<E> right){
		this.right = right;
		if(right != null){
			right.parent = this;
		}
	}
	@Override
	public List<E> preOrder(){
		List<E> list = new ArrayList<>();
		list.add(this.data);
		if(left != null){
			list.addAll(left.preOrder());
		}
		if(right != null){
			list.addAll(right.preOrder());
		}
		return list;
	}
	
	
	public void inOrder(Visitor<E> visitor){
		if(left != null){
			left.inOrder(visitor);
		}
		visitor.visit(data);
		if(right != null){
			right.inOrder(visitor);
	}
	
}
	
	public List<E> postOrder(){
		//TODO
	}
}
