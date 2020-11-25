public class BokStudent extends Student_id{
	
	String[] student_no = new String[5];
	String[] Name = {"복안산","학아리","생나미","초홍씨","봉김씨"};
	String[] address = {"평택시","안성시","파주시","김해","서울시"}; //주소
	String[] phome_num = {"010-8888-8888","010-7114-0560","010-0143-5656","010-4774-7777","010-9985-9999"}; //폰번호
	String[] birth_num = {"파이썬","C","자바","C++","JS"}; //과목
	int[] java1 = {42,70,80,15,85}; //성적
	int[] java2 = {12,11,87,61,19}; //성적2
	String[] bok_day = {"03/03","02/29","03/02","06/29","06/30"}; //복학날짜
	int[] head_size = {70,60,80,100,111};
	String[] bob = {"콩밥","쌀밥","진밥","떨밥","개밥"};
	String[] sub_bob = {"매운맛","순한맛","신맛","단맛","미음"};
	int[] num_bob = {5,1,2,1,3};
	
		void honbap(String[] bob, String[] sub_bob, int[] num_bob)
			{
				for (int i=0; i<5; i++) {
					System.out.println(Name[i] +"씨 밥종류 :"+bob[i]);
					System.out.println(Name[i] +"씨 반찬종류 :"+sub_bob[i]);
					System.out.println(Name[i] +"씨 머리사이즈 :"+head_size[i]);
					System.out.println(Name[i] +"씨 식판개수 :" +num_bob[i] + "개");
					System.out.println(Name[i] +"씨 복학날짜 :"+bok_day[i]);
					System.out.println();
			}
		}
}
