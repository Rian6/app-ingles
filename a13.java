import javax.swing.*;
import java.awt.event.*;
public class a13{
public void aa13(){

JFrame a=new JFrame("Play");
JTextField c=new JTextField("complete a musica aki");
JButton b=new JButton("ok0");

String contador=c.getText();

JButton b1=new JButton("ok1");
a.add(b1);
b1.setSize(60, 30);
b1.setLocation(265,400);
b1.setVisible(false);

JButton b2=new JButton("ok2");
a.add(b2);
b2.setSize(60, 30);
b2.setLocation(265,400);
b2.setVisible(false);

JButton b3=new JButton("ok3");
a.add(b3);
b3.setSize(60, 30);
b3.setLocation(265,400);
b3.setVisible(false);

JButton b4=new JButton("ok4");
a.add(b4);
b4.setSize(60, 30);
b4.setLocation(265,400);
b4.setVisible(false);

JButton b5=new JButton("ok5");
a.add(b5);
b5.setSize(60, 30);
b5.setLocation(265,400);
b5.setVisible(false);

JButton b6=new JButton("ok6");
a.add(b6);
b6.setSize(60, 30);
b6.setLocation(265,400);
b6.setVisible(false);

JButton b7=new JButton("ok7");
a.add(b7);
b7.setSize(60, 30);
b7.setLocation(265,400);
b7.setVisible(false);

JButton b8=new JButton("ok8");
a.add(b8);
b8.setSize(60, 30);
b8.setLocation(265,400);
b8.setVisible(false);

JButton b9=new JButton("ok9");
a.add(b9);
b9.setSize(60, 30);
b9.setLocation(265,400);
b9.setVisible(false);

JButton b10=new JButton("ok10");
a.add(b5);
b10.setSize(60, 30);
b10.setLocation(265,400);
b10.setVisible(false);

JButton b11=new JButton("ok11");
a.add(b11);
b11.setSize(60, 30);
b11.setLocation(265,400);
b11.setVisible(false);

JButton b12=new JButton("terminar");
a.add(b12);
b12.setSize(60, 30);
b12.setLocation(265,400);
b12.setVisible(false);

JLabel qwe;
qwe = new JLabel();
qwe.setLocation(61,0);
qwe.setSize(200, 40);
int cont=0;

qwe.setText(Integer.toString(cont));
a.add(qwe);

JLabel qwe2;
qwe2 = new JLabel("pontos: ");
qwe2.setLocation(15,0);
qwe2.setSize(200, 40);
a.add(qwe2);

JLabel imagem2;
	Icon xicara2 = new ImageIcon("imagens/scorre.png");
	imagem2 = new JLabel(xicara2);
	a.add(imagem2);
	imagem2.setLocation(0,0);
	imagem2.setSize(125,38 );

JLabel imagem3;
	Icon xicara3 = new ImageIcon("letras/madona/celebration/p1.png");
	imagem3 = new JLabel(xicara3);
	a.add(imagem3);
	imagem3.setLocation(0,0);
	imagem3.setSize(400,300 );
	contador=c.getText();
	
if (contador=="what"){
cont=10;	
qwe.setText(Integer.toString(cont));	
}
	
	a.setSize(400, 500);
a.add(b);
a.add(c);
a.setLayout(null);
a.setLocation(500,100);
a.setVisible(true);
a.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);

JLabel imagem;
	Icon xicara = new ImageIcon("imagens/batata.png");
	imagem = new JLabel(xicara);
	a.add(imagem);
	imagem.setLocation(0,0);
	imagem.setSize(400,450 );
	
	a.add(b);
	b.setSize(60, 30);
b.setLocation(265,400);

c.setSize(200, 30);
c.setVisible(true);
c.setLocation(65, 400);

qwe.setVisible(true);


JLabel imagem4;
	Icon xicara4 = new ImageIcon("letras/madona/celebration/p2.png");
	imagem4 = new JLabel(xicara4);
	a.add(imagem4);
	imagem4.setLocation(0,0);
	imagem4.setSize(400,300 );
	
	imagem4.setVisible(false);
	
	JLabel imagem5;
	Icon xicara5 = new ImageIcon("letras/madona/celebration/p3.png");
	imagem5 = new JLabel(xicara5);
	a.add(imagem5);
	imagem5.setLocation(0,0);
	imagem5.setSize(400,300 );
	
	imagem5.setVisible(false);
	
	JLabel imagem6;
	Icon xicara6 = new ImageIcon("letras/madona/celebration/p4.png");
	imagem6 = new JLabel(xicara6);
	a.add(imagem6);
	imagem6.setLocation(0,0);
	imagem6.setSize(400,300 );
	
	imagem6.setVisible(false);
	
	JLabel imagem7;
	Icon xicara7 = new ImageIcon("letras/madona/celebration/p5.png");
	imagem7 = new JLabel(xicara7);
	a.add(imagem7);
	imagem7.setLocation(0,0);
	imagem7.setSize(400,300 );
	
	imagem7.setVisible(false);
	
	JLabel imagem8;
	Icon xicara8 = new ImageIcon("letras/madona/celebration/p6.png");
	imagem8 = new JLabel(xicara8);
	a.add(imagem8);
	imagem8.setLocation(0,0);
	imagem8.setSize(400,300 );
	
	imagem8.setVisible(false);
	
	JLabel imagem9;
	Icon xicara9 = new ImageIcon("letras/madona/celebration/p7.png");
	imagem9 = new JLabel(xicara9);
	a.add(imagem9);
	imagem9.setLocation(0,0);
	imagem9.setSize(400,300 );
	
	imagem9.setVisible(false);
	
	JLabel imagem10;
	Icon xicara10 = new ImageIcon("letras/madona/celebration/p8.png");
	imagem10 = new JLabel(xicara10);
	a.add(imagem10);
	imagem10.setLocation(0,0);
	imagem10.setSize(400,300 );
	
	imagem10.setVisible(false);
	
	JLabel imagem11;
	Icon xicara11 = new ImageIcon("letras/madona/celebration/p9.png");
	imagem11 = new JLabel(xicara11);
	a.add(imagem11);
	imagem11.setLocation(0,0);
	imagem11.setSize(400,300 );
	
	imagem11.setVisible(false);
	
	JLabel imagem12;
	Icon xicara12 = new ImageIcon("letras/madona/celebration/p10.png");
	imagem12 = new JLabel(xicara12);
	a.add(imagem12);
	imagem12.setLocation(0,0);
	imagem12.setSize(400,300 );
	
	imagem12.setVisible(false);
	
	JLabel imagem13;
	Icon xicara13 = new ImageIcon("letras/madona/celebration/p11.png");
	imagem13 = new JLabel(xicara13);
	a.add(imagem13);
	imagem13.setLocation(0,0);
	imagem13.setSize(400,300 );
	
	JLabel imagem14;
	Icon xicara14 = new ImageIcon("letras/madona/celebration/p12.png");
	imagem14 = new JLabel(xicara14);
	a.add(imagem14);
	imagem14.setLocation(0,0);
	imagem14.setSize(400,300 );
	
	JLabel imagem15;
	Icon xicara15 = new ImageIcon("letras/madona/celebration/p13.png");
	imagem15 = new JLabel(xicara15);
	a.add(imagem15);
	imagem15.setLocation(0,0);
	imagem15.setSize(400,300 );
	
	JLabel imagem16;
	Icon xicara16 = new ImageIcon("letras/madona/celebration/p14.png");
	imagem16 = new JLabel(xicara16);
	a.add(imagem16);
	imagem16.setLocation(0,0);
	imagem16.setSize(400,300 );
	
	imagem13.setVisible(false);
	imagem.setVisible(false);
b.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){


imagem.setVisible(false);
imagem4.setVisible(true);
imagem3.setVisible(false);
b.setVisible(false);
b1.setVisible(true);

} 
});

b1.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b1.setVisible(false);
	b2.setVisible(true);
	imagem4.setVisible(false);
	imagem5.setVisible(true);
	int contador;
} 
});

b2.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b2.setVisible(false);
	b3.setVisible(true);
	imagem5.setVisible(false);
	imagem6.setVisible(true);

} 
});

b3.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b3.setVisible(false);
	b4.setVisible(true);
	imagem6.setVisible(false);
	imagem7.setVisible(true);

} 
});

b4.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b4.setVisible(false);
	b5.setVisible(true);
	imagem7.setVisible(false);
	imagem8.setVisible(true);

} 
});

b5.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b5.setVisible(false);
	b6.setVisible(true);
	imagem8.setVisible(false);
	imagem9.setVisible(true);

} 
});

b6.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b6.setVisible(false);
	b7.setVisible(true);
	imagem9.setVisible(false);
	imagem10.setVisible(true);

} 
});

b7.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b7.setVisible(false);
	b8.setVisible(true);
	imagem10.setVisible(false);
	imagem11.setVisible(true);

} 
});

b8.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b8.setVisible(false);
	b9.setVisible(true);
	imagem11.setVisible(false);
	imagem12.setVisible(true);

} 
});

b9.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b9.setVisible(false);
	b10.setVisible(true);
	imagem12.setVisible(false);
	imagem13.setVisible(true);

} 
});

b10.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){
	
	b11.setVisible(true);
	imagem14.setVisible(true);

} 
});
}
}