package ch12_generic.sec08;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector ����
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		list.remove(2);
		list.remove(3);
		
		for(Board b : list) {
			System.out.println(b);
		}
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
