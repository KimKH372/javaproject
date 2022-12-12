package ch12_collection_1024.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("kkh1"));
		hashSet.add(new String("kkh2"));
		hashSet.add(new String("kkh3"));
		hashSet.add(new String("kkh3"));
		hashSet.add(new String("kkh2"));
		
		System.out.println(hashSet);
	}
}
