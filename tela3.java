
import javax.swing.*; 
import java.awt.event.*;

public class tela3{
public void t3(){
JLabel imagem,m2;
JButton b1,b2,b3,b4,b5,b6;
JFrame janela2; 
b2  =new JButton("EXIT");
b1  =new JButton("OK!");
b3  =new JButton("Whitesnake");
b4  =new JButton("Dragon F.");
b5  =new JButton("Scorpions");
b6  =new JButton("The Batles");
janela2  =new JFrame("programa ingles");
janela2.setLayout(null);
	ImageIcon imagemTituloJanela = new ImageIcon("imagens/a.png");
janela2.setIconImage(imagemTituloJanela.getImage());	

JLabel imagem2; 
	Icon xicara1 = new ImageIcon("imagens/whitesnake.png");
	imagem2 = new JLabel(xicara1);
	janela2.add(imagem2);
	imagem2.setSize(100,100);
	imagem2.setLocation(100,10);

JLabel imagem3;
	Icon xicara2 = new ImageIcon("imagens/dragon.png");
	imagem3 = new JLabel(xicara2);
	janela2.add(imagem3);
	imagem3.setSize(100,100);
	imagem3.setLocation(200,10);

JLabel imagem4;
	Icon xicara3 = new ImageIcon("imagens/Scorpions.png");
	imagem4 = new JLabel(xicara3);
	janela2.add(imagem4);
	imagem4.setSize(100,100);
	imagem4.setLocation(100,150);



JLabel imagem5;
	Icon xicara4 = new ImageIcon("imagens/bea.png");
	imagem5 = new JLabel(xicara4);
	janela2.add(imagem5);
	imagem5.setSize(100,100);
	imagem5.setLocation(200,150);

imagem2.setVisible(true);
imagem3.setVisible(true);
imagem4.setVisible(true);
imagem5.setVisible(true);
		
	b1.setLocation(220,400);
	b1.setSize(80, 30);

	janela2.add(b2);	
	b2.setLocation(100,400);
	b2.setSize(80, 30);

	janela2.add(b3);	
	b3.setLocation(100,110);
	b3.setSize(100, 30);

	janela2.add(b4);	
	b4.setLocation(200,110);
	b4.setSize(100, 30);

	janela2.add(b5);	
	b5.setLocation(100,250);
	b5.setSize(100, 30);

	janela2.add(b6);	
	b6.setLocation(200,250);
	b6.setSize(100, 30);
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


imagem2.setVisible(true);
imagem3.setVisible(true);
imagem4.setVisible(true);
imagem5.setVisible(true);


JLabel imagem6;
	Icon xicara5 = new ImageIcon("imagens/rock.png");
	imagem6 = new JLabel(xicara5);
	janela2.add(imagem6);
	imagem6.setSize(400,450);
	imagem6.setLocation(0,0);
	janela2.add(b1);

b2.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

janela2.setVisible(false);
System.exit(0);
 
} 
});





b3.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 


janela2.setVisible(false);
c1p tela3= new c1p();
tela3.c11p();
} 
});


b4.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 


janela2.setVisible(false);
c2p tela3= new c2p();
tela3.c22p();
} 
});
b5.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 


janela2.setVisible(false);
c3p tela3= new c3p();
tela3.c33p();
} 
});
b6.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 


janela2.setVisible(false);
c4p tela3= new c4p();
tela3.c44p();
} 
});



}
}










