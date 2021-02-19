
import java.io.*;
import java.net.URL;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*; 

public class tela1{

//private String cd;
//public void tela1(String str) {
//   this.str = cd;
//}

public void t1(){

//--------------//
JLabel imagem;
JLabel img1;
JButton botao;
JButton botao2;
JFrame  janela;
JRadioButton jr1,jr2;
//--------------//



//-------------------------------------------------//
jr1    =new JRadioButton("--POP--");
jr2    =new JRadioButton("--Rock--");



botao  =new JButton("Play!");
botao2 =new JButton("EXIT");
janela =new JFrame("programa de ingles");

//-------------------------------------------------//


//---------------------------------------------
janela.add(jr1);
jr1.setLocation(5,150);
jr1.setSize(80,80);


janela.add(jr2);
jr2.setLocation(5,200);
jr2.setSize(80,80);
//---------------------------------------------
	ImageIcon imagemTituloJanela = new ImageIcon("imagens/a.png");
janela.setIconImage(imagemTituloJanela.getImage());

//imagens---------------------------------------
	




	Icon xicara = new ImageIcon("imagens/icone.png");
	imagem = new JLabel(xicara);
	janela.add(imagem);
	imagem.setSize(300,50);
	imagem.setLocation(50,0);
	
//imagens-------------------------------------


//---------------janela------------------------//
	janela.setLayout(null);
	janela.add(botao);
	janela.add(botao2);
	janela.setSize(400,500);
	janela.setLocation(500,100);
//---------------janela------------------------//



//---------------botao-----------------------//
	botao.setLocation(220,400);
	botao.setSize(80, 30);

	botao2.setLocation(100,400);
	botao2.setSize(80, 30);
//---------------botao----------------------//

janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
janela.setVisible(true);
 
jr1.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 


botao.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

janela.setVisible(false);
tela2 tela1= new tela2();
tela1.t2();

} 
});  
 
} 
}); 

jr2.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

botao.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 
janela.setVisible(false);
tela3 tela1= new tela3();
tela1.t3();
} 
});  
 
} 
}); 

botao2.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 

janela.setVisible(false);
System.exit(0);
 
} 
});


janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
}
}
