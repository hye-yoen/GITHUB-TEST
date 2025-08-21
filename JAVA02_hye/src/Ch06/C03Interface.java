package Ch06;

interface Remocon{
	int MAX_VOL = 100;  //public static final
	int MIN_VOL = 0;	//public static rinal
	
	void powerOn();  //추상메서드
	void powerOff();
	void setVolumn(int vol);
}
interface Browser{
	void searchURL(String url);
}

class Tv implements Remocon{
	private int nowVol;
	@Override
	public void powerOn() {
		System.err.println("TV on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("TV off");
		
	}

	@Override
	public void setVolumn(int vol) {
		this.nowVol = vol;
		if(vol>=MAX_VOL) {
			this.nowVol = MAX_VOL;}
		else if(vol<=MIN_VOL) {
			this.nowVol = MIN_VOL;
		}
		else
			this.nowVol =vol;
		
		System.out.println("Tv 현재 볼륨 : " + nowVol);
	}
}

class SmartTv extends Tv implements Browser{//implements는 extends 뒤에!!!

	@Override
	public void searchURL(String url) {
		System.out.println(url + "로 이동");
		
	} 
}



class Radio implements Remocon{
	private int nowVol;

	@Override
	public void powerOn() {
		System.out.println("Radio on");
	}

	@Override
	public void powerOff() {
		System.out.println("Radio off");		
	}

	@Override
	public void setVolumn(int vol) {
		this.nowVol = vol;
		if(vol>=MAX_VOL) {
			this.nowVol = MAX_VOL;}
		else if(vol<=MIN_VOL) {
			this.nowVol = MIN_VOL;
		}
		else
			this.nowVol =vol;
		
		System.out.println("Radio 현재 볼륨 : " + nowVol);
	}
	
	
	
}


public class C03Interface {
	public static void TurnOn(Remocon controllor) { //Tv/Radio 객체
		controllor.powerOn(); //재정의?
	}
	public static void TurnOff(Remocon controllor) {
		controllor.powerOff();
	}
	
	public static void ChangeVolume(Remocon controllor,int vol) { //볼륨도 연결
		controllor.setVolumn(vol);
	}
	
	public static void Internet(Browser browser , String url) {
		browser.searchURL(url);
	}
 	

	public static void main(String[] args) {
		Tv tv = new Tv();
		Radio radio = new Radio();
		SmartTv smartTv = new SmartTv();

		TurnOn(smartTv);
		ChangeVolume(smartTv,10);
		Internet(smartTv,"www.naver.com");
	
		
		TurnOff(smartTv);
		
//		TurnOn(tv);
//		TurnOn(radio);
//		
//		ChangeVolume(tv,50);
//		ChangeVolume(tv,120);
//		ChangeVolume(radio,-10);
//		ChangeVolume(radio,50);
//		
//		TurnOff(tv);
//		TurnOff(radio);
		
	}

}
