
import java.io.*;
import javax.swing.*;

import java.awt.event.*;

public class c1p{
public void c11p(){
JLabel imagem,m2;
JButton b1,b2,b3,b4,b5,b6;
JFrame janela2; 
b2  =new JButton("EXIT");
b1  =new JButton("OK!");
b3  =new JButton("Stay with me baby");
b4  =new JButton("Outlaw");
b5  =new JButton("Medicine man");
b6  =new JButton("Fare thee well");
janela2  =new JFrame("Whitesnake");
janela2.setLayout(null);
		ImageIcon imagemTituloJanela = new ImageIcon("imagens/a.png");
janela2.setIconImage(imagemTituloJanela.getImage());
	janela2.add(b1);	
	b1.setLocation(220,400);
	b1.setSize(80, 30);
	

	janela2.add(b2);	
	b2.setLocation(120,400);
	b2.setSize(80, 30);

	janela2.add(b3);	
	b3.setLocation(0,160);
	b3.setSize(400, 30);

	janela2.add(b4);	
	b4.setLocation(0,190);
	b4.setSize(400, 30);

	janela2.add(b5);	
	b5.setLocation(0,220);
	b5.setSize(400, 30);

	janela2.add(b6);	
	b6.setLocation(0,250);
	b6.setSize(400, 30);
//////imagem////////////////////

	Icon xicara = new ImageIcon("batata.png");
	imagem = new JLabel(xicara);
	janela2.add(imagem);
	imagem.setSize(100,100);
	imagem.setLocation(100,20);

Icon x2 = new ImageIcon("b2.png");
	m2 = new JLabel(x2);
	janela2.add(m2);
	imagem.setSize(200,100);
	imagem.setLocation(100,20);

////////////////////////////////

janela2.setSize(400,500);
janela2.setLocation(500,200);
	
janela2.setVisible(true);
b1.setVisible(true);
b2.setVisible(true);
janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);

b2.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

janela2.setVisible(false);
System.exit(0);
 
} 
});

b3.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b11 c1pp= new b11();
c1pp.bb11();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
}); 

b4.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b12 c3pp= new b12();
c3pp.bb12();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});

b5.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b13 c3pp= new b13();
c3pp.bb13();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});




b6.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b14 c3pp= new b14();
c3pp.bb14();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});

}
}
