package sample_0411;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television testtv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 20;
		mytv.onOff = false;
		//mytv.volume=mytv.volumeUP(30);
		mytv.volumeUP();
		//System.out.println(mytv.onOff +" �ڷ������� ä���� " + mytv.channel + "�̰� ������ " + mytv.volume + "�Դϴ�.");		
		mytv.pr();
		
		yourtv.channel = 207;
		yourtv.volume = 17;
		yourtv.onOff = true;
		
		//System.out.println(yourtv.onOff +" �ڷ������� ä���� " + yourtv.channel + "�̰� ������ " + yourtv.volume + "�Դϴ�.");
		yourtv.pr();
		
		mytv.channel = 231;
		//testtv=null;
		//System.out.println(testtv.onOff +" �ڷ������� ä���� " + testtv.channel + "�̰� ������ " + testtv.volume + "�Դϴ�.");
		testtv.pr();
	}

}
