import java.util.Scanner;

class Student_id {
	String[] student_no = new String[5];
	String[] Name = {"안산","아리","나미","홍씨","김씨"};
	String[] address = {"서울시","안중","안산","포승","여주시"}; //주소
	String[] phome_num = {"010-0000-0000","010-0111-0100","010-0123-4564","010-4444-4444","010-5555-5666"}; //폰번호
	String[] birth_num = {"파이썬","C","자바","C++","JS"}; //과목
	int[] java1 = {40,60,20,10,50}; //성적
	int[] java2 = {100,80,77,66,13}; //성적2

		void sugang(String[] student_no, String[] Name) {
			for (int i=0; i<5; i++) {
				student_no[i] ="18-"+i+"256234"+i+"5";
				
				System.out.println(Name[i]+"는"+birth_num[i]+"과목에"+java1[i]+"점을 반영했습니다");
				System.out.println(Name[i]+"는 어떤 과목에"+java2[i]+"점을 반영했습니다");
				System.out.println();
			
			}
		}
		
		void bbs(String[] student_no, String[] birth_num, String[] phome_num) {
			for (int i=0; i<5; i++) {
				phome_num[i] ="010-233"+i+"5"+i+"47";
				System.out.println(student_no[i]+"학생의"+address[i]+"목록 게시글을작성했습니다.\n"+"연락처는"+phome_num[i]+"입니다.");
				System.out.println();
			}
	
		}
	
}

public class Student {
	public static void main (String args[]) {
	Student_id std = new Student_id();
	BokStudent btd = new BokStudent();
	int value = 0;
	System.out.println("시작합니다. 1번 입학생, 2번 복학생, 아무거나 입력하시면 종료 됩니다.");
		do {
			Scanner scan = new Scanner(System.in);
			value = scan.nextInt();
				if (value==1) {
					std.sugang(std.student_no, std.Name);
					std.bbs(std.student_no, std.birth_num, std.phome_num);
					System.out.println("1번 입학생, 2번 복학생, 아무거나 입력하시면 종료!");
					
				} else if (value==2) {
					btd.sugang(btd.student_no, btd.Name);
					btd.bbs(btd.student_no, btd.birth_num, btd.phome_num);
					btd.honbap(btd.bob, btd.sub_bob, btd.num_bob);
					System.out.println("1번 입학생, 2번 복학생, 아무거나 입력하시면 종료!");
				} else {
					System.out.println("종료했습니다.");
					break;
				}
			}
				while(true); 
					
		}
	}
