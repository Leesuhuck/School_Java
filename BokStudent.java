public class BokStudent extends Student_id{
	
	String[] student_no = new String[5];
	String[] Name = {"���Ȼ�","�оƸ�","������","��ȫ��","���达"};
	String[] address = {"���ý�","�ȼ���","���ֽ�","����","�����"}; //�ּ�
	String[] phome_num = {"010-8888-8888","010-7114-0560","010-0143-5656","010-4774-7777","010-9985-9999"}; //����ȣ
	String[] birth_num = {"���̽�","C","�ڹ�","C++","JS"}; //����
	int[] java1 = {42,70,80,15,85}; //����
	int[] java2 = {12,11,87,61,19}; //����2
	String[] bok_day = {"03/03","02/29","03/02","06/29","06/30"}; //���г�¥
	int[] head_size = {70,60,80,100,111};
	String[] bob = {"���","�ҹ�","����","����","����"};
	String[] sub_bob = {"�ſ��","���Ѹ�","�Ÿ�","�ܸ�","����"};
	int[] num_bob = {5,1,2,1,3};
	
		void honbap(String[] bob, String[] sub_bob, int[] num_bob)
			{
				for (int i=0; i<5; i++) {
					System.out.println(Name[i] +"�� ������ :"+bob[i]);
					System.out.println(Name[i] +"�� �������� :"+sub_bob[i]);
					System.out.println(Name[i] +"�� �Ӹ������� :"+head_size[i]);
					System.out.println(Name[i] +"�� ���ǰ��� :" +num_bob[i] + "��");
					System.out.println(Name[i] +"�� ���г�¥ :"+bok_day[i]);
					System.out.println();
			}
		}
}
