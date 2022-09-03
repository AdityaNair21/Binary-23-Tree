import java.util.ArrayList;

public class Tester {
	
	
	//works
	public static void TaylorVideo2Example() {
		TwoThreeTree t = new TwoThreeTree();
		
		t.insert(5);
		System.out.println(t.toString());
		t.insert(0);
		System.out.println(t.toString());
		t.insert(10);
		System.out.println(t.toString());
		t.insert(20);
		System.out.println(t.toString());
		t.insert(-5);
		System.out.println(t.toString());
		t.insert(7);
		System.out.println(t.toString());
		t.insert(2);
		System.out.println(t.toString());
		t.insert(-1);
		System.out.println(t.toString());
		t.insert(11);
		System.out.println(t.toString());
		t.insert(37);
		System.out.println(t.toString());		
		t.insert(17);
		System.out.println(t.toString());
		
		ArrayList<Integer> arr = getArrayList(t);
		printGroup(t, arr);
		
		t.insert(18);
		System.out.println(t.toString());
		
		ArrayList<Integer> arr2 = getArrayList(t);
		printGroup(t, arr2);
		
	}
	
	//works
	public static void WhiteboardExample() {

		TwoThreeTree t = new TwoThreeTree();
		
		t.insert(10);
		t.insert(50);
		t.insert(5);
		t.insert(40);
		t.insert(100);
		t.insert(200);
		t.insert(1);
		t.insert(7);
		t.insert(30);
		t.insert(45);
		t.insert(75);
		t.insert(150);
				
		System.out.println(t.toString());
		
		ArrayList<Integer> arr2 = getArrayList(t);
		printGroup(t, arr2);
		
		t.insert(250);
		t.insert(4);
		t.insert(3);
		
		System.out.println(t.toString());
		
		ArrayList<Integer> arr = getArrayList(t);
		printGroup(t, arr);
		
		
	}
	
	//works
	public static void GoogleSlides() {
 		//TEST 3 GOOGLE SLIDES TEST WORKS
		TwoThreeTree t = new TwoThreeTree();
		System.out.println(t.toString());
		t.insert(20);
		System.out.println(t.toString());
		t.insert(18);
		System.out.println(t.toString());
		t.insert(11);
		System.out.println(t.toString());
		t.insert(14);
		System.out.println(t.toString());
		t.insert(16);
		System.out.println(t.toString());
		t.insert(12);
		System.out.println(t.toString());
		ArrayList<Integer> arr = getArrayList(t);
		printGroup(t, arr);
		t.insert(10);
		System.out.println(t.toString());
		
		ArrayList<Integer> arr2 = getArrayList(t);
		printGroup(t, arr2);
	}
	
	//works
	public static void TaylorVideo1Example() {
		//TAYLOR VIDEO 1 EXAMPLE
		TwoThreeTree t = new TwoThreeTree();
		t.insert(5);
		t.insert(10);
		t.insert(20);
		t.insert(8);
		t.insert(7);
		t.insert(15);
		t.insert(30);
		t.insert(11);
		System.out.println(t.toString());
		
		
	}
	
	
	//works
	public static void FourLayerTest() {
		//TEST 1 Four LAYERS WORKDS
		TwoThreeTree t = new TwoThreeTree();
		t.insert(50);
		System.out.println(t.toString());
		t.insert(24);
		System.out.println(t.toString());
		t.insert(2);
		System.out.println(t.toString());
		t.insert(14);
		System.out.println(t.toString());
		t.insert(30);
		System.out.println(t.toString());
		t.insert(39);
		System.out.println(t.toString());
		t.insert(34);
		System.out.println(t.toString());
		t.insert(46);
		System.out.println(t.toString());
		t.insert(48);
		System.out.println(t.toString());
		t.insert(10);
		System.out.println(t.toString());		
		t.insert(26);
		System.out.println(t.toString());
		t.insert(44);
		System.out.println(t.toString());
		t.insert(42);
		System.out.println(t.toString());
		t.insert(56);
		System.out.println(t.toString());
		t.insert(58);
		System.out.println(t.toString());
		
		ArrayList<Integer> arr = getArrayList(t);
		printGroup(t, arr);
	}
	
	//works
	public static void RANDOM5LAYERTEST() {
		
		//TEST2 RANDOM WORKS
		
		TwoThreeTree t = new TwoThreeTree();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < 52; i++) {
			int rand = (int)(Math.random()*100);
			while(arr.contains(rand)) {
				rand = (int)(Math.random()*100);
			}
			arr.add(rand);
		}

		arr.set(0, 48);
		arr.set(1, 87);
		arr.set(2, 31);
		arr.set(3, 76);
		arr.set(4, 16);
		arr.set(5, 51);
		arr.set(6, 38);
		
		arr.set(7, 47);
		arr.set(8, 23);
		arr.set(9, 86);
		arr.set(10, 96);
		arr.set(11, 72);
		arr.set(12, 12);
		arr.set(13, 17);
		arr.set(14, 26);
		arr.set(15, 5);
		
		arr.set(16, 41);
		arr.set(17, 49);
		
		arr.set(18, 79);
		arr.set(19, 99);
		arr.set(20, 22);
		arr.set(21, 42);
		arr.set(22, 80);
		arr.set(23, 68);
		arr.set(24, 89);
		arr.set(25, 81);
		arr.set(26, 7);
		arr.set(27, 45);
		arr.set(28, 25);
		arr.set(29, 74);
		arr.set(30, 73);
		arr.set(31, 84);
		arr.set(32, 35);
		arr.set(33, 60);
		arr.set(34, 58);
		
		arr.set(35, 95);
		arr.set(36, 39);
		arr.set(37, 1);
		arr.set(38, 43);
		arr.set(39, 90);
		arr.set(40, 4);
		
		arr.set(41, 50);
		arr.set(42, 36);
		arr.set(43, 28);
		arr.set(44, 18);
		arr.set(45, 14);
		arr.set(46, 33);
		arr.set(47, 54);
		arr.set(48, 77);
		arr.set(49, 64);
		arr.set(50, 34);
		arr.set(51, 32);
		

		

		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		for(int i = 0; i < 52; i++) {//13
			System.out.println("inserting " + arr.get(i) + "\n");
			t.insert(arr.get(i));
			
			System.out.println(t.toString());
		}
		ArrayList<Integer> arr2 = getArrayList(t);
		printGroup(t, arr2);

	}


	
	public static void RandomTest2() {
		int[] arr = {91, 5, 32, 41, 31, 38, 87, 1, 17, 3, 34, 8, 44, 25, 46, 92, 12, 43, 20, 21, 79, 84, 82, 88};//, 92, 12, 43, 20, 21, 79, 84, 82, 88};
		for(int i = 0; i < arr.length; i++) {
			int total = 0;
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					total++;
				}
			}
			if(total >= 2) {
				System.out.println(arr[i]);
			}
		}
		
		TwoThreeTree t = new TwoThreeTree();
		for(int j = 0; j < arr.length; j++) {
			
			t.insert(arr[j]);
			System.out.println(t.toString());
		}
		ArrayList<Integer> arr2 = getArrayList(t);
		printGroup(t, arr2);
		
	}
	
	
//	public static void RandomTest3() {
//		
//	}
	
	
	
	
	//works till 31 at least
	public static void IncreasingTest() {
		TwoThreeTree t = new TwoThreeTree();
		
//		t.insert(1);
//		System.out.println(t.toString());
//		t.insert(2);
//		System.out.println(t.toString());
//		t.insert(3);
//		System.out.println(t.toString());
//		t.insert(4);
//		System.out.println(t.toString());
//		t.insert(5);
//		System.out.println(t.toString());
//		t.insert(6);
//		System.out.println(t.toString());
//		t.insert(7);
//		System.out.println(t.toString());
//		t.insert(8);
//		System.out.println(t.toString());
//		t.insert(9);
//		System.out.println(t.toString());
//		t.insert(10);
//		System.out.println(t.toString());		
//		t.insert(11);
//		System.out.println(t.toString());
//		t.insert(12);
//		System.out.println(t.toString());
//		t.insert(13);
//		System.out.println(t.toString());
//		t.insert(14);
//		System.out.println(t.toString());
//		t.insert(15);
//		System.out.println(t.toString());
		
		int max = 30;
		for(int i = 1; i <= max; i++) {
			t.insert(i);
			System.out.println(t.toString());
		}
		//ArrayList<Integer> arr = new ArrayList<Integer>();
//		for(int i = 0; i < max; i++) {
//			System.out.println(t.get(i) == i+1);
//			
//		}
		//System.out.println(t.get(1));
		
		ArrayList<Integer> arr2 = getArrayList(t);
		printGroup(t, arr2);

		for(int i = 1; i <= max; i++) {
			System.out.println(t.size(i));
		}

		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		IncreasingTest();
		//WhiteboardExample();
		//GoogleSlides();
		//TaylorVideo2Example();
		//TaylorVideo1Example();
		//FourLayerTest();
		//RANDOM5LAYERTEST();
		
	}
	
	
	
	public static ArrayList<Integer> getArrayList(TwoThreeTree t) {
		Node2 n = t.getHead();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		getArrayListRecurse(arr, n);
		return arr;
		
	}
	
	static void getArrayListRecurse(ArrayList<Integer> arr, Node2 n) {
		if(n != null) {
			arr.add(n.getValue());
			getArrayListRecurse(arr, n.getLeft());
			getArrayListRecurse(arr, n.getRight());
		}
		
	}
	
	static void printGroup(TwoThreeTree t, ArrayList<Integer> arr2) {
		for(int i = 0; i < arr2.size(); i++) {
			for(int j = 0; j < arr2.size(); j++) {
				if(t.isGroupShift(t.getNodeRecurse(t.getHead(), arr2.get(i)), t.getNodeRecurse(t.getHead(), arr2.get(j)),0)) {
					System.out.println("group: " + arr2.get(i) + " and " + arr2.get(j));
				}
			}
		}
	}
	
	
	
}
