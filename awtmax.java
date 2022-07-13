import java.awt.*;
import java.awt.event.*;

import java.util.*;
public class awtmax extends Frame implements ActionListener{
	Label l1,l2,l3,res;
	TextField tf1,tf2,tf3,tf4;
	Button b1,b2;

	awtmax(){
	l1=new Label("first no");
	l1.setBounds(65,50,80,30);
	l2=new Label("second no");
	l2.setBounds(65,100,80,30);
	l3=new Label("third no");
	l3.setBounds(65,150,80,30);
	res=new Label("maximum");
	res.setBounds(65,200,80,30);

	tf1=new TextField();
	tf1.setBounds(150,50,150,30);
	tf2=new TextField();
	tf2.setBounds(150,100,150,30);	
	tf3=new TextField();
	tf3.setBounds(150,150,150,30);	
	tf4=new TextField();
	tf4.setBounds(150,200,150,30);

	b1=new Button("find");
	b1.setBounds(50,250,80,35);
	b2=new Button("exit");
	b2.setBounds(230,250,80,35);

	b1.addActionListener(this);
	b2.addActionListener(this);

	add(l1);
	add(l2);
	add(l3);
	add(res);

	add(tf1);
	add(tf2);
	add(tf3);
	add(tf4);

	add(b1);
	add(b2);
	
	setSize(400,400);
	setLayout(null);
	setVisible(true);		
	}

	

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b2){
	System.exit(0);
	}
	String s1=tf1.getText();
	String s2=tf2.getText();
	String s3=tf3.getText();

	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	int c=Integer.parseInt(s3);
	int val=0;
	if(e.getSource()==b1){
		if(a>b && a>c)
			val=a;
		else if(b>a && b>c)
			val=b;
		else
			val=c;
	}
	String result=String.valueOf(val);
	tf4.setText(result);
	}

public static void main(String[] args){
	new awtmax();
}

}