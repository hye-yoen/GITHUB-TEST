package Ch05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05GUI extends JFrame implements ActionListener{
	JButton btn1; //멤버면수로 만들어버리기!(지역변수 x) 
	JButton btn2; //생성자밖어서도 사용
	JButton btn3;
	JButton btn4;
	
	C05GUI(String title){
		//Frame기본 설정
		super("title"); //위에 파일명 저장
		setBounds(100,100,400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x프레임에 대한 종료 설정
		
		//panel 설정 (컴포넌트 그룹화 설정)
		JPanel panel = new JPanel();
		Color color = new Color(0,67,155);
		panel.setBackground(color);
		panel.setLayout(null); //컴포넌트 위치 자유롭게 설정하기 위해 null 설정
		
		JTextArea area1 = new JTextArea(); //여러줄 text 입력
		JScrollPane scroll1 = new JScrollPane(area1); //스크롤 기능
		scroll1.setBounds(10,10,250,280);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,300,250,30);
		
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(270,10,110,30);
		btn2 = new JButton("1:1요청");
		btn2.setBounds(270,50,110,30);
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(270,90,110,30);
		btn4 = new JButton("입력");
		btn4.setBounds(270,300,110,30);
		
		//Event 처리
		btn1.addActionListener(this); //btn1을 이벤트의 감시항목 추가
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		panel.add(scroll1);
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		
		add(panel);
		
		//Frame 표시 여부
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(btn1);
//		System.out.println("BTN 클릭" + e.getSource());
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장버튼 클릭");
		}
		else if(e.getSource() ==btn2) {
			System.out.println("1:1 요청 버튼 클릭");
		}
		else if(e.getSource() == btn3) {
			System.out.println("대화기록 삭제 버튼 클릭");
		}else {
			System.out.println("입력버튼 클릭");
		}
		
	}
}
public class C056Ex {
	public static void main(String[] args) {
		new C05GUI("ex번째 프레임 창 입니다.");
		
	}
}
