package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import calculation.Calculation;
import calculation.ZeroException;
import calculation.lengthException;
import database.CalculatorData;
public class Main implements ActionListener {
	JFrame frame=new JFrame();
	JTextArea print=new JTextArea("0");
	JButton C=new JButton("C");
	JButton CE=new JButton("CE");
	JButton revoke=new JButton("��");
	JButton one=new JButton("1");
	JButton two=new JButton("2");
	JButton three=new JButton("3");
	JButton four=new JButton("4");
	JButton five=new JButton("5");
	JButton six=new JButton("6");
	JButton seven=new JButton("7");
	JButton eight=new JButton("8");
	JButton nine=new JButton("9");
	JButton zero=new JButton("0");
	JButton sign=new JButton("��");
	JButton dot=new JButton("��");
	JButton and=new JButton("+");
	JButton minus=new JButton("-");
	JButton multiplication=new JButton("X");
	JButton division=new JButton("��");
	JButton equal=new JButton("=");
	CalculatorData sj=new CalculatorData();
	Calculation js=new Calculation();
	private Main() {
		this.initialComponent();//��ʼ���ؼ�
		this.addListener();//Ϊ��Ӧ�Ŀؼ�ע���¼�������
		this.initialFrame();//��ʼ������
	}
	private void initialComponent() {
		frame.setLayout(null);//�ղ���
		print.setBounds(15, 15, 280, 80);
		print.setEnabled(false);
		frame.add(print);//�����ʾ���
		C.setBounds(25, 110, 50, 50);
		frame.add(C);//����������
		CE.setBounds(78, 110, 50, 50);
		frame.add(CE);//���������󰴼�
		revoke.setBounds(131, 110, 50, 50);
		frame.add(revoke);//��ӳ��ؼ�
		one.setBounds(25, 163, 50, 50);
		frame.add(one);//���"1"��ť
		two.setBounds(78, 163, 50, 50);
		frame.add(two);//���"2"��ť
		three.setBounds(131, 163, 50, 50);
		frame.add(three);//���"3"��ť
		four.setBounds(25, 216, 50, 50);
		frame.add(four);//���"4"��ť
		five.setBounds(78, 216, 50, 50);
		frame.add(five);//���"5"��ť
		six.setBounds(131, 216, 50, 50);
		frame.add(six);//���"6"��ť
		seven.setBounds(25, 269, 50, 50);
		frame.add(seven);//���"7"��ť
		eight.setBounds(78, 269, 50, 50);
		frame.add(eight);//���"8"��ť
		nine.setBounds(131, 269, 50, 50);
		frame.add(nine);//���"9"��ť
		sign.setBounds(25, 322, 50, 50);
		frame.add(sign);//���"��"��ť
		zero.setBounds(78, 322, 50, 50);
		frame.add(zero);//���"0"��ť
		dot.setBounds(131, 322, 50, 50);
		frame.add(dot);//���"��"��ť
		and.setBounds(230, 110, 50, 50);
		frame.add(and);//���"+"��ť
		minus.setBounds(230, 163, 50, 50);
		frame.add(minus);//���"-"��ť
		multiplication.setBounds(230, 216, 50, 50);
		frame.add(multiplication);//���"X"��ť
		division.setBounds(230, 269, 50, 50);
		frame.add(division);//���"��"��ť
		equal.setBounds(230, 322, 50, 50);
		frame.add(equal);//���"="��ť
	}
	private void addListener() {
		this.C.addActionListener(this);
		this.CE.addActionListener(this);
		this.revoke.addActionListener(this);
		this.one.addActionListener(this);
		this.two.addActionListener(this);
		this.three.addActionListener(this);
		this.four.addActionListener(this);
		this.five.addActionListener(this);
		this.six.addActionListener(this);
		this.seven.addActionListener(this);
		this.eight.addActionListener(this);
		this.nine.addActionListener(this);
		this.zero.addActionListener(this);
		this.sign.addActionListener(this);
		this.dot.addActionListener(this);
		this.and.addActionListener(this);
		this.minus.addActionListener(this);
		this.multiplication.addActionListener(this);
		this.division.addActionListener(this);
		this.equal.addActionListener(this);
	}
	private void initialFrame() {
		frame.setTitle("������");
		frame.setSize(320, 450);
		frame.setLocation(200, 200);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.C)this.C_event();
		else if(e.getSource()==this.CE)this.CE_event();
		else if(e.getSource()==this.revoke)this.revoke_event();
		else if(e.getSource()==this.one)this.one_event();
		else if(e.getSource()==this.two)this.two_event();
		else if(e.getSource()==this.three)this.three_event();
		else if(e.getSource()==this.four)this.four_event();
		else if(e.getSource()==this.five)this.five_event();
		else if(e.getSource()==this.six)this.six_event();
		else if(e.getSource()==this.seven)this.seven_event();
		else if(e.getSource()==this.eight)this.eight_event();
		else if(e.getSource()==this.nine)this.nine_event();
		else if(e.getSource()==this.zero)this.zero_event();
		else if(e.getSource()==this.sign)this.sign_event();
		else if(e.getSource()==this.dot)this.dot_event();
		else if(e.getSource()==this.and)this.and_event();
		else if(e.getSource()==this.minus)this.minus_event();
		else if(e.getSource()==this.multiplication)this.multiplication_event();
		else if(e.getSource()==this.division)this.division_event();
		else if(e.getSource()==this.equal)this.equal_event();
	}
	private void C_event() {
		try{
			@SuppressWarnings("unused")
			int a=Integer.parseInt(print.getText().toString());
			print.setText("0");
		}catch(NumberFormatException e) {}
	}
	private void CE_event() {
		print.setText("0");
	}
	private void revoke_event() {
		try{
			int a=(Integer.parseInt(print.getText().toString()))/10;
			print.setText(String.valueOf(a));
		}catch(NumberFormatException e){}
	}
	private void one_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+1;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void two_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+2;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void three_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+3;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void four_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+4;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void five_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+5;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void six_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+6;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void seven_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+7;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void eight_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+8;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void nine_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10+9;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void zero_event() {
		try{
			int a=Integer.parseInt(print.getText().toString());
			if(a<99999999){
				a=(Integer.parseInt(print.getText().toString()))*10;
				print.setText(String.valueOf(a));
			}
		}catch(NumberFormatException e){}
	}
	private void sign_event() {
		try{
			int a=-(Integer.parseInt(print.getText().toString()));
			print.setText(String.valueOf(a));
		}catch(NumberFormatException e){}
	}
	private void dot_event() {
		// TODO С��δ��,�ȴ��ڶ��滻Ѫ
	}
	private void and_event() {
		try{
			int number=Integer.parseInt(print.getText().toString());
			sj.setNumberA(number);
			sj.setOperationSymbol("+");
			print.setText("0");
		}catch(NumberFormatException e){}
	}
	private void minus_event() {
		try{
			int number=Integer.parseInt(print.getText().toString());
			sj.setNumberA(number);
			sj.setOperationSymbol("-");
			print.setText("0");
		}catch(NumberFormatException e){}
	}
	private void multiplication_event() {
		try{
			int number=Integer.parseInt(print.getText().toString());
			sj.setNumberA(number);
			sj.setOperationSymbol("X");
			print.setText("0");
		}catch(NumberFormatException e){}
	}
	private void division_event() {
		try{
			int number=Integer.parseInt(print.getText().toString());
			sj.setNumberA(number);
			sj.setOperationSymbol("��");
			print.setText("0");
		}catch(NumberFormatException e){}
	}
	private void equal_event() {
		try{
			int number=Integer.parseInt(print.getText().toString());
			sj.setNumberB(number);
			try {
				print.setText(String.valueOf(js.Calculation(sj)));
			}
			catch(ZeroException e)
			{
				print.setText("0E");
			}
			catch(lengthException e)
			{
				print.setText("99999999E");
			}
		}catch(NumberFormatException e){}
	}
	public static void main(String[] args) {
		new Main();
	}
}