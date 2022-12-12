package ch12_map.treemap_1024;

import ch12_collection_1024.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "kkh3");
		Member memberLee = new Member(1001, "kkh1");
		Member memberHong = new Member(1004, "kkh4");
		Member memberSon = new Member(1002, "kkh2");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
