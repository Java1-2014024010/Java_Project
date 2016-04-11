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
		//System.out.println(mytv.onOff +" 텔레비전의 채널은 " + mytv.channel + "이고 볼륨은 " + mytv.volume + "입니다.");		
		mytv.pr();
		
		yourtv.channel = 207;
		yourtv.volume = 17;
		yourtv.onOff = true;
		
		//System.out.println(yourtv.onOff +" 텔레비전의 채널은 " + yourtv.channel + "이고 볼륨은 " + yourtv.volume + "입니다.");
		yourtv.pr();
		
		mytv.channel = 231;
		//testtv=null;
		//System.out.println(testtv.onOff +" 텔레비전의 채널은 " + testtv.channel + "이고 볼륨은 " + testtv.volume + "입니다.");
		testtv.pr();
	}

}
