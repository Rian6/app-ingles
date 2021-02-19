
import java.io.*;
import javax.swing.*;

import java.awt.event.*;

public class c1pp{
public void c11pp(){
JLabel imagem,m2;
JButton b1,b2,b3,b4,b5,b6;
JFrame janela2; 
b2  =new JButton("EXIT");
b3  =new JButton("Formation");
b4  =new JButton("If I were a boy");
b5  =new JButton("Love on top");
b6  =new JButton("Hold up");
janela2  =new JFrame("Beyonce");
janela2.setLayout(null);
		ImageIcon imagemTituloJanela = new ImageIcon("imagens/a.png");
janela2.setIconImage(imagemTituloJanela.getImage());
	

	janela2.add(b2);	
	b2.setLocation(150,400);
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

a11 c1pp= new a11();
c1pp.aa11();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
}); 

b4.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

a12 c1pp= new a12();
c1pp.aa12();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});

b5.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

a13 c1pp= new a13();
c1pp.aa13();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});




b6.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

a14 c1pp= new a14();
c1pp.aa14();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});

}
}
