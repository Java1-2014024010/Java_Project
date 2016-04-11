package sample_0411;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr(){
		if(onOff == false){
			System.out.println("TV die");
			return;
		}
		System.out.println(onOff +" 텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");	
		}
	
	/*int volumeUP (int up_data){
		int vol=volume;
		vol+=up_data;
		return vol;*/
	
		void volumeUP(int data){
			if(onOff == false){
				System.out.println("TV die");
				return;
			}
		volume+=data;
	}
		void volumeUP(){
			if(onOff == false){
				System.out.println("TV die");
				return;
			}
			volume++;
		}
}
