
import java.io.*;
import javax.swing.*;

import java.awt.event.*;

public class c2p{
public void c22p(){
JLabel imagem,m2;
JButton b1,b2,b3,b4,b5,b6;
JFrame janela2; 
b1  =new JButton("OK!");
b3  =new JButton("Valley of the damned");
b4  =new JButton("Black fire");
b5  =new JButton("Cry for eternity");
b6  =new JButton("Symphony of the night");
janela2  =new JFrame("Dragonforce");
janela2.setLayout(null);
ImageIcon imagemTituloJanela = new ImageIcon("imagens/a.png");
janela2.setIconImage(imagemTituloJanela.getImage());
	
	janela2.add(b1);	
	b1.setLocation(220,400);
	b1.setSize(80, 30);
	
	janela2.add(b3);	
	b3.setLocation(0,160);
	b3.setSize(400, 30);

	janela2.add(b4);	
	b4.setLocation(0,190);
	b4.setSize(100, 30);

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
janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);


b3.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b21 c1pp= new b21();
c1pp.bb21();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
}); 

b4.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b22 c3pp= new b22();
c3pp.bb22();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});

b5.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b23 c3pp= new b23();
c3pp.bb23();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});




b6.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

b24 c3pp= new b24();
c3pp.bb24();


janela2.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
janela2.setVisible(false);

} 
});

}
}
