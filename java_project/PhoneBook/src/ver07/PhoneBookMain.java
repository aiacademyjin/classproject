package ver07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

import ver03.Util;

public class PhoneBookMain implements Util, Menu {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//PhoneBookManager manager = new PhoneBookManager(10);
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			System.out.println("메뉴를 입력해주세요. ================");
			System.out.println(INSERT+". 저장");
			System.out.println(SEARCH+". 검색");
			System.out.println(DELETE+". 삭제");
			System.out.println(DISPLAY_ALL+". 모든 정보 출력");
			System.out.println(SAVE+". 모든 정보 저장(file 저장)");
			System.out.println(Menu.EXIT+". EXIT");
			
			System.out.println("\n>> ");
			
			int select = 0;
			
			try {
			
				select = SC.nextInt();
			
				if(!(select>0 && select<10)) {
					//System.out.println("메뉴의 선택이 옳바르지 않습니다.\n다시 선택해주세요.");
					//Exception e = new Exception("잘못된 메뉴 입력");
					BadInputException e = new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("메뉴입력이 잘못되었습니다.");
				SC.nextLine();
				continue;
			} catch (Exception e1) {
				System.out.println("메뉴입력이 잘못되었습니다.");
				SC.nextLine();
				continue;
			}
			
			switch (select) {
			case INSERT:
				manager.insertInfo();
				break;
			case SEARCH:
				manager.searchInfor();
				break;
			case DELETE:
				manager.deleteInfor();
				break;
			case DISPLAY_ALL:
				manager.showAllInfor();
				break;
			case SAVE:
				manager.save();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다. ");
				return;

			}
		}
	}
	

}
