package Ch05;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	C03GUI(String title){
		//Frame기본 설정
		super("title"); //위에 파일명 저장
		setBounds(100, 100, 500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x 버튼에 대한 종료 설정
		
		//panel Setting (컴포넌트 그룹화 설정)
		JPanel panel = new JPanel();
		Color col = new Color(255,255,0);
		panel.setBackground(col);
		panel.setLayout(null); 
		//컴포넌트 위치 자유롭게 설정하기 위해 null 설정
		
		//Frame에 Panel추가
		add(panel);  
		
		
		setVisible(true); //보여줄지 결정(ture/false)
		
		
		
	}
}

public class C03SwingMain {
	public static void main(String[] args) {
		new C03GUI("세번째 프레임 창 입니다.");
		
	}
}
