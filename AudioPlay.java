
// blibliotecas importadas pelo .jar
import java.net.MalformedURLException;
import java.net.URL;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class AudioPlay {
	
	public static void main(String[] args) {
		
		// Nome do arquivo a ser aberto
		String songName = "celebrationp1.mp3";
		
		// Mescla o caminho do diretório com o nome da musica
		String pathToMp3 = System.getProperty("user.dir") +"/musicas/pop/madona/m1/"+ songName;
		
		// Cria um player basico de musica utilizando a api: http://www.javazoom.net/jlgui/api.html
		BasicPlayer player = new BasicPlayer();
		
		try {
			// abre o arquivo de musica
		    player.open(new URL("file:///" + pathToMp3));
		    
		    // toca a musica
		    player.play();
		    
		    // parar musica
		    //player.stop();
		    
		    //pausar musica
		    //player.pause();
		    
		    //continuar musica pausada
		    //player.resume();
		} catch (BasicPlayerException | MalformedURLException e) {
		    e.printStackTrace();
		}	
	}
}