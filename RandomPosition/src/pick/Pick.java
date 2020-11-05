package pick;

import java.util.ArrayList;
import java.util.Collections;

public class Pick {

	public static void main(String[] args) {

		// 배열 생성 : new String[18]
		// 배열 : 인스턴스다
		String[] members = { "고한경", "김정현", "김효영", "남서아", "서지민", "양선경", "이도경", "이수진", "이정민", "장명지", "장윤혁", "정인수", "진효선",
				"최정은", "최지혜", "최혜인", "한우리", "한주량" };

		ArrayList<String> memberList = new ArrayList<String>();

		for (int i = 0; i < members.length; i++) {
			memberList.add(members[i]);
		}

		for (int i = 0; i < 1000; i++) {
			Collections.shuffle(memberList);
		}

		for (String name : memberList) {
			//System.out.print(name + " ");
		}
		System.out.println("자리 배치 : 개인간의 합의에 의한 자리변경은 가능합니다.");

		displayPicker(memberList, true, 1000);
	}

	public static void displayPicker(ArrayList<String> memberList, boolean chk, int delay) {
		String[][] position = new String[6][];
		position[0] = new String[2];
		position[1] = new String[4];
		position[2] = new String[3];
		position[3] = new String[3];
		position[4] = new String[3];
		position[5] = new String[3];

		System.out.println("=============================================");

		int index = 0;

		for (int i = 0; i < position.length; i++) {
			for (int j = 0; j < position[i].length; j++) {
				position[i][j] = memberList.get(index++);
			}
		}

		for (String[] pos : position) {
			for (String name : pos) {
				if (chk) {
					name = name.substring(0, 1) + "**";
				}
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(name + "\t");
			}
			System.out.println();
		}
	}

}
