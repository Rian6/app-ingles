
import java.io.*;
import javax.swing.*;

import java.awt.event.*;

public class c3p{
public void c33p(){
JLabel imagem,m2;
JButton b1,b2,b3,b4,b5,b6;
JFrame janela2; 
b2  =new JButton("EXIT");
b1  =new JButton("OK!");
b3  =new JButton("Big city nights");
b4  =new JButton("Rock'n'roll ban");
b5  =new JButton("You and I");
b6  =new JButton("Under the same sun");
janela2  =new JFrame("Scorpions");
janela2.setLayout(null);
ImageIcon imagemTituloJanela = new ImageIcon("imagens/a.png");
janela2.setIconImage(imagemTituloJanela.getImage());
	
	janela2.add(b1);	
	b1.setLocation(220,400);
	b1.setSize(80, 30);
	

	janela2.add(b2);	
	b2.setLocation(100,400);
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

b31 c1pp= new b31();
c1pp.bb31();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
}); 

b4.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b32 c3pp= new b32();
c3pp.bb32();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});

b5.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

a33 c3pp= new a33();
c3pp.aa33();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});




b6.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

a34 c3pp= new a34();
c3pp.aa34();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});
}
}
