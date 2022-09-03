public class TwoThreeTree {
	
	private Node2 head;
	
	public Node2 getHead() {
		return head;
	}

	public boolean insert(int value) {
		if(getNodeRecurse(head, value) != null) {
			return false;
		} else {
			Node2 current = head;
			Node2 previous = null;
			while(current != null) {
				previous = current;
				if(value > current.getValue()) {
					current = current.getRight();
				} else {
					current = current.getLeft();
				}
			}
			
			Node2 n = new Node2(value, previous);
			Node2 previousOfPrevious = null;
			Node2 sibling = null;
			boolean parentsAreGroup = false;
			boolean parentSiblingGroup = false;
			
			if(previous == null) {
				head = n;
			} else {
				boolean newNodeGoesRight = previous.getValue() < value;
				previousOfPrevious = previous.getParent();
				sibling = newNodeGoesRight ? previous.getLeft() : previous.getRight();
				
				parentsAreGroup = previousOfPrevious != null && isGroupShift(previousOfPrevious, previous, 0);
				parentSiblingGroup = sibling != null && isGroupShift(previous, sibling, 0); 

				if(newNodeGoesRight) {
					previous.setRight(n);
				} else {
					previous.setLeft(n);
				}
			}
			
			while(parentsAreGroup || parentSiblingGroup){
				if(parentsAreGroup) {
					System.out.println("parents are group");
					if(n.isMiddle(previous, previousOfPrevious)) {
						rotate(previous, n);
						rotate(previousOfPrevious, n);	
					} else if(previous.isMiddle(n, previousOfPrevious)) {
						rotate(previousOfPrevious, previous);
						n = previous;
					} else {
						n = previousOfPrevious;
					}
				} else {
					System.out.println("parent sibling group");
					if(n.isMiddle(previous, sibling)) {
						rotate(previous, n);
					} else if(sibling.isMiddle(n, previous)) {
						rotate(previous, sibling);
						n = sibling;
					} else {
						n = previous;
					}
				}

				previous = n.getParent();
				previousOfPrevious = previous == null? null : previous.getParent(); 
				sibling = previous == null ? null : previous.getValue() < n.getValue() ? previous.getLeft() : previous.getRight();
				
				boolean case1 = false;
				boolean case2 = false;
				if(previous != null && previousOfPrevious != null) {
					case1 = previousOfPrevious.getLeft() != null && previousOfPrevious.getLeft().getLeft() != null && previousOfPrevious.getLeft().getLeft().getValue() == n.getValue();
					case2 = previousOfPrevious.getRight() != null && previousOfPrevious.getRight().getRight() != null && previousOfPrevious.getRight().getRight().getValue() == n.getValue();
				}

				if(case1 || case2) {
					parentsAreGroup = previousOfPrevious != null && isGroupShift(previousOfPrevious, previous, 2);// && isGroup(previous, n, 2);
				} else {
					parentsAreGroup = previousOfPrevious != null && isGroupShift(previousOfPrevious, previous, 0);// && isGroup(previous, n, 0);
				}
				parentSiblingGroup = sibling != null && isGroupShift(previous, sibling, -2);
			}
			return true;	
		}
	}
	
	private void rotate(Node2 x, Node2  y) { 
		//GIVEN X IS PARENT OF Y
		System.out.println("rotate: " + x.getValue() + "  " + y.getValue());
		if(x.getParent() == null) {
			head = y;
		} else {
			if(x.getParent().getValue() > x.getValue()) {
				x.getParent().setLeft(y);
			} else {
				x.getParent().setRight(y);
			}
		}
		y.setParent(x.getParent());
		if(x.getValue() < y.getValue()) {
			x.setRight(y.getLeft());
			if(y.getLeft() != null) {
				y.getLeft().setParent(x);
			}
			y.setLeft(x);
			
		} else {			
			x.setLeft(y.getRight());
			if(y.getRight() != null) {
				y.getRight().setParent(x);
			}
			y.setRight(x);
		}
		x.setParent(y);
	}
	
	public boolean isGroupShift(Node2 a, Node2 b, int shift) {
		//GIVEN A IS PARENT OF B
		if((a == null || b == null) && isGroupShift(a.getParent(), a, shift)) {
			return false;
		}
		if(a.getLeft() == b) {
			return sizeDirectionalRecurse(a.getRight(), "both") == sizeDirectionalRecurse(b.getLeft(), "both") - shift;
		} else {
			return sizeDirectionalRecurse(a.getLeft(), "both") == sizeDirectionalRecurse(b.getRight(), "both") - shift;
		}
	}
	
	public Node2 getNodeRecurse(Node2 parent, int value) {
		if(parent == null) {
			return null;
		}
		if(parent.getValue() == value) {
			return parent;
		}
		if(parent.getValue() > value){
			return getNodeRecurse(parent.getLeft(), value);
		}
		return getNodeRecurse(parent.getRight(), value);
	}
	
	public int size() {
		return sizeRecurse(head);
	}
	
	public int size(int x) {
		Node2 n = getNodeRecurse(head, x);
		if(n == null) {
			return 0;
		}
		if(n.getParent() != null && isGroupShift(n.getParent(), n, 0)) {
			return sizeRecurse(n.getParent());
		}
		return sizeRecurse(n);
	}
	
	private int sizeDirectionalRecurse(Node2 node, String direction) {
		if(node == null) {
			return 0;
		} else {
			Node2 left = node.getLeft();
			Node2 right = node.getRight();
			Boolean leftIsGroup = left != null && isGroupShift(node, left, 0);
			Boolean rightIsGroup = right != null && isGroupShift(node, right, 0);
			if(direction == "both") {
				if(leftIsGroup) {
					return 1 + sizeDirectionalRecurse(left.getLeft(), "left") + sizeDirectionalRecurse(right, "right");
				}
				if(rightIsGroup) {
					return 1 + sizeDirectionalRecurse(right.getRight(), "right") + sizeDirectionalRecurse(left, "left");
				}
				return 1 + sizeDirectionalRecurse(left, "left") + sizeDirectionalRecurse(right, "right");
			} else if(direction == "left") {
				if(leftIsGroup) {
					return 1 + sizeDirectionalRecurse(left.getLeft(), "left");
				}
				return 1 + sizeDirectionalRecurse(left, "left");
			} else {
				if(rightIsGroup) {
					return 1 + sizeDirectionalRecurse(right.getRight(), "right");
				}
				return 1 + sizeDirectionalRecurse(right, "right");
			}
		}
	}
	
	private int sizeRecurse(Node2 node) {
		if(node == null) {
			return 0;
		}
		if(node.getLeft() != null && isGroupShift(node, node.getLeft(), 0)) {
			return 2 + sizeRecurse(node.getLeft().getLeft()) + sizeRecurse(node.getLeft().getRight()) + sizeRecurse(node.getRight());
		} else if(node.getRight() != null && isGroupShift(node, node.getRight(), 0)) {
			return 2 + sizeRecurse(node.getRight().getRight()) + sizeRecurse(node.getRight().getLeft()) + sizeRecurse(node.getLeft());
		}
		return 1 + sizeRecurse(node.getLeft()) + sizeRecurse(node.getRight());
	}
	
	public int get(int x) {		
		return getRecurse(head, 0, x).getValue(); 
	}
	
	private Node2 getRecurse(Node2 currentNode, int counter, int x) {
		int currentValue = sizeRecurse(currentNode.getLeft()) + counter;
		if(currentValue == x) {
			return currentNode;
		}
		if(currentValue > x){
			return getRecurse(currentNode.getLeft(), counter, x);
		}
		return getRecurse(currentNode.getRight(), currentValue + 1, x);
	}
}

class Node2 {
	private int value;
	private Node2 left;
	private Node2 right;
	private Node2 parent;
	
	public Node2(int value, Node2 parent) {
		this.value = value;
		this.parent = parent;
	}
	public int getValue() {
		return value;
	}
	public Node2 getLeft() {
		return left;
	}
	public Node2 getRight() {
		return right;
	}
	public void setLeft(Node2 left) {
		this.left = left;
	}
	public void setRight(Node2 right) {
		this.right = right;
	}
	public void setParent(Node2 parent) {
		this.parent = parent;
	}
	public Node2 getParent() {
		return parent;
	}
	public boolean isMiddle(Node2 a, Node2 b) {
		return (this.getValue() < a.getValue() && this.getValue() > b.getValue()) || (this.getValue() > a.getValue() && this.getValue() < b.getValue());
	}
}