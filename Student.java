import java.util.Scanner;

class Student_id {
	String[] student_no = new String[5];
	String[] Name = {"�Ȼ�","�Ƹ�","����","ȫ��","�达"};
	String[] address = {"�����","����","�Ȼ�","����","���ֽ�"}; //�ּ�
	String[] phome_num = {"010-0000-0000","010-0111-0100","010-0123-4564","010-4444-4444","010-5555-5666"}; //����ȣ
	String[] birth_num = {"���̽�","C","�ڹ�","C++","JS"}; //����
	int[] java1 = {40,60,20,10,50}; //����
	int[] java2 = {100,80,77,66,13}; //����2

		void sugang(String[] student_no, String[] Name) {
			for (int i=0; i<5; i++) {
				student_no[i] ="18-"+i+"256234"+i+"5";
				
				System.out.println(Name[i]+"��"+birth_num[i]+"����"+java1[i]+"���� �ݿ��߽��ϴ�");
				System.out.println(Name[i]+"�� � ����"+java2[i]+"���� �ݿ��߽��ϴ�");
				System.out.println();
			
			}
		}
		
		void bbs(String[] student_no, String[] birth_num, String[] phome_num) {
			for (int i=0; i<5; i++) {
				phome_num[i] ="010-233"+i+"5"+i+"47";
				System.out.println(student_no[i]+"�л���"+address[i]+"��� �Խñ����ۼ��߽��ϴ�.\n"+"����ó��"+phome_num[i]+"�Դϴ�.");
				System.out.println();
			}
	
		}
	
}

public class Student {
	public static void main (String args[]) {
	Student_id std = new Student_id();
	BokStudent btd = new BokStudent();
	int value = 0;
	System.out.println("�����մϴ�. 1�� ���л�, 2�� ���л�, �ƹ��ų� �Է��Ͻø� ���� �˴ϴ�.");
		do {
			Scanner scan = new Scanner(System.in);
			value = scan.nextInt();
				if (value==1) {
					std.sugang(std.student_no, std.Name);
					std.bbs(std.student_no, std.birth_num, std.phome_num);
					System.out.println("1�� ���л�, 2�� ���л�, �ƹ��ų� �Է��Ͻø� ����!");
					
				} else if (value==2) {
					btd.sugang(btd.student_no, btd.Name);
					btd.bbs(btd.student_no, btd.birth_num, btd.phome_num);
					btd.honbap(btd.bob, btd.sub_bob, btd.num_bob);
					System.out.println("1�� ���л�, 2�� ���л�, �ƹ��ų� �Է��Ͻø� ����!");
				} else {
					System.out.println("�����߽��ϴ�.");
					break;
				}
			}
				while(true); 
					
		}
	}
