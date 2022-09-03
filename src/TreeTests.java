import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;



public class TreeTests {

	@Test
	public void increasingTest() {
		Tree t = new Tree();

		
		int max = 50;
		for(int i = 1; i <= max; i++) {
			t.insert(i);
		}

		
		for(int i = 0; i < max; i++) {
			assertEquals(t.get(i), i+1);
			int j = i + 1;
			System.out.println(t.get(i) + " = " + j);
		}
		
		
		
	}
	
	
//	@Test
//	public void randomTest() {
//		Tree t = new Tree();
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		
//		
//		int max = 1000000;
//		int elements = 500;
//		for(int i = 0; i < elements; i++) {
//			int j = (int)(Math.random()*max);
//			t.insert(j);
//			set.add(j);
//		}
//		
//		
//		ArrayList<Integer> set2 = new ArrayList<Integer>(set);
//		for(int i = 0; i < set2.size(); i++) {
//			int j = set2.get(i);
//			assertEquals(j, t.get(i));
//			//System.out.println(j + " = " + t.get(i));
//		}
//	}

}
