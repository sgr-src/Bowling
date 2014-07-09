package ch.soreco.bowling.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import ch.soreco.bowling.Game;

public class GameTest {

	private Game game;
	
	@Before
	public void startGame(){
		this.game = new Game();
	}
	
	@Test
	public void testGutterGame() {
		for (int i = 0; i < 20; i++) {
			game.addPoint(0);
		}
		assertEquals(0, game.getTotalScore());
	}
	
	@Test
	public void testTotalScore(){
		assertEquals(true, (this.game.getTotalScore() <= 300) && (this.game.getTotalScore() >= 0 ));
	}
	
	@Test
	public void testOneShots() {
		for (int i = 0; i < 20; i++) {
			game.addPoint(1);
		}
		assertEquals(20, game.getTotalScore());
	}
	
	@Test
	public void testGoldenGame(){
		for (int i = 0; i < 12; i++) {
			game.addPoint(10);
		}
		assertEquals(300, game.getTotalScore());
		
	}
	
}
