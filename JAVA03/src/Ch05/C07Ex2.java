package Ch05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C07GUI extends JFrame implements ActionListener,KeyListener,MouseListener {
	JButton btn1; //멤버면수로 만들어버리기!(지역변수 x) 
	JButton btn2; //생성자밖에서도 사용
	JButton btn3;
	JButton btn4;
	JTextArea area1;
	JTextField txt1;
	
	public C07GUI(String title){
		//Frame기본 설정
		super("title"); //위에 파일명 저장
		setBounds(100,100,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x 버튼에 대한 종료 설정
		
		//panel 설정 (컴포넌트 그룹화 설정)
		JPanel panel = new JPanel();
		Color color = new Color(0,67,155);
		panel.setBackground(color);
		panel.setLayout(null); //컴포넌트 위치 자유롭게 설정하기 위해 null 설정
		
		
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(270,10,110,30);
		btn2 = new JButton("1:1요청");
		btn2.setBounds(270,50,110,30);
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(270,90,110,30);
		btn4 = new JButton("입력");
		btn4.setBounds(270,300,110,30);
		
		area1 = new JTextArea(); //여러줄 text 입력
		JScrollPane scroll = new JScrollPane(area1); //스크롤 기능
		scroll.setBounds(10,10,250,280);
		
		txt1 = new JTextField();
		txt1.setBounds(10,300,250,30);
		
		
		//Event 처리
		btn1.addActionListener(this); //btn1을 이벤트의 감시항목 추가
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt1.addKeyListener(this);
		
		area1.addMouseListener(this);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(scroll);
		panel.add(txt1);
		
		
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
		}else if(e.getSource() == btn4){
			System.out.println("입력버튼 클릭");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//사용자가 키를 눌렀다가 뗏을때
//		System.out.println("KeyTyped..." + e.getKeyChar());
//		System.out.println("KeyTyped..." + e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//사용자가 키를 누르는 순간
//		System.out.println("keyPressed..." + e.getKeyChar());
//		System.out.println("keyPressed..." + e.getKeyCode());
		// enter ==10 (한글 x)
		if(e.getKeyCode() ==10) {
			String message = txt1.getText();
			System.out.println("message : " + message);
			area1.append(message+"\n");
			txt1.setText("");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//사용자가 키를 땟을때
//		System.out.println("keyPressed..." + e.getKeyChar());
//		System.out.println("keyPressed..." + e.getKeyCode());
		//한글 조합은 다른 keytype
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
		System.out.println("클림됨");
		int offset=area1.viewToModel(e.getPoint());
		System.out.println("offset : "+ offset);
		int row = area1.getLineEndOffset(offset);
		System.out.println("row : "+ row);
		int startOffset = area1.getLineStartOffset(row);
		int endOffset = area1.getLineEndOffset(row);
		String str = area1.getText(startOffset,endOffset - startOffset);
		System.out.println("str : " + str);
		
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
}


public class C07Ex2 {
	public static void main(String[] args) {
		new C07GUI("ㅎㅎㅎㅎㅎㅎ");
		
	}
}
