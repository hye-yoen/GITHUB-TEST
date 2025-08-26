package Ch05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	C04GUI(String title){
		super(title);
		setBounds(100, 100, 500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel Setting
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//Component Setting
		JButton btn1 = new JButton("BTN01");
		btn1.setBounds(10,10,100,30);
		JButton btn2 = new JButton("BTN01");
		btn2.setBounds(120,10,100,30);
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,50,210,30);
		JTextArea area1 = new JTextArea();
//		area1.setBounds(10,90,210,300);
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,90,210,300);
		
		//ponel에 Conponent 추가
		
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(area1);
		panel.add(scroll1);
		
		add(panel);  //Frame에 Panel추가
		
		setVisible(true);
		
		
		
		
	}
}

public class C04SwingMain {
	public static void main(String[] args) {
		new C04GUI("네번째 프레임 창 입니다.");
		
	}
}
