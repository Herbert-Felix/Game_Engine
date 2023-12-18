package game_engine;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	
	public static int WIDTH=480, HEIGHT=480;
	
	public Game(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	}

	public static void main(String[] args) {
		Game game = new Game();
		JFrame jframe = new JFrame();
		jframe.add(game);
		jframe.setTitle("Game Engine");
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		new Thread(game).start();
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Testando game loop frame...");
		}
		
	}

}