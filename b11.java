
import javax.swing.*;
import java.awt.event.*;
public class b11{
public void bb11(){

JFrame a=new JFrame("Play");
JTextField c=new JTextField("complete a musica aki");
JButton b=new JButton("ok");

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

String escolha=c.getText();

JLabel imagem2;
	Icon xicara2 = new ImageIcon("imagens/scorre.png");
	imagem2 = new JLabel(xicara2);
	a.add(imagem2);
	imagem2.setLocation(0,0);
	imagem2.setSize(125,38 );

JLabel imagem3;
	Icon xicara3 = new ImageIcon("letras/madona/celebration/pt1.png");
	imagem3 = new JLabel(xicara3);
	a.add(imagem3);
	imagem3.setLocation(0,0);
	imagem3.setSize(400,300 );

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
b.setSize(60, 30);
b.setLocation(265,400);

c.setSize(200, 30);
c.setVisible(true);
c.setLocation(65, 400);

qwe.setVisible(true);

JLabel imagem4;
	Icon xicara4 = new ImageIcon("letras/madona/celebration/pt2.png");
	imagem4 = new JLabel(xicara4);
	a.add(imagem4);
	imagem4.setLocation(0,0);
	imagem4.setSize(400,300 );

b.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){


imagem.setVisible(false);
imagem4.setVisible(true);
imagem3.setVisible(false);
JLabel imagem90;


	Icon xicara90 = new ImageIcon("imagens/batata.png");
	imagem90 = new JLabel(xicara90);
	a.add(imagem90);
	imagem90.setLocation(0,0);
	imagem90.setSize(400,450 );


} 
});

}
}


