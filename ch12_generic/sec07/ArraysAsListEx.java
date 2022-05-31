package ch12_generic.sec07;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

	public static void main(String[] args) {
		// Arrays.asList() : 绊历坷凋 按眉甸肺 备己等 List 积己 抗力
		List<String>list1 = Arrays.asList("全辨悼", "捞根锋", "己冕氢");
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		// list2 : 沥荐 1,2,3 历厘 棺 免仿
		List<Integer>list2 = Arrays.asList(1,2,3);
		
		for(Integer value : list2) {
			System.out.println(value);
		}
	}

}
