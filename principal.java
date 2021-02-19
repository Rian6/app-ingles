

import javax.swing.*;
import java.awt.event.*;
public class principal{
public static void main(String args[]){


JFrame a=new JFrame("inicio");
JTextField c=new JTextField();
JButton b=new JButton("ok");

JLabel abc;
abc = new JLabel("");
abc.setLocation(150,127);
abc.setSize(200, 40);
a.add(abc);


JLabel imagem2;
Icon xicara2 = new ImageIcon("imagens/barra.png");
imagem2 = new JLabel(xicara2);
a.add(imagem2);
imagem2.setLocation(50,0);
imagem2.setSize(300, 300);

a.setSize(400, 500);
a.add(b);
a.add(c);
a.setLayout(null);
a.setLocation(500,100);
a.setVisible(true);

JLabel imagem;
	Icon xicara = new ImageIcon("imagens/batata.png");
	imagem = new JLabel(xicara);
	a.add(imagem);
	imagem.setLocation(0,0);
	imagem.setSize(400,450 );
b.setSize(60, 30);
b.setLocation(150,400);

c.setSize(200, 35);
c.setVisible(true);
c.setLocation(100, 200);

imagem2.setVisible(true);
abc.setVisible(true);

b.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 
String cd=(c.getText());
JOptionPane.showMessageDialog(null,"seu nome: "+cd);

tela1 principal= new tela1();
principal.t1();

a.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
a.setVisible(false);

} 
});  

}
}
