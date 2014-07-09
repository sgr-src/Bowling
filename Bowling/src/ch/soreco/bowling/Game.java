package ch.soreco.bowling;

public class Game {

	private int maxscore;
	private int score;	
		
	private Frame frame;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public int getTotalscore() {
		return totalscore;
	}

	public void setTotalscore(int totalscore) {
		this.totalscore = totalscore;
	}

	private int totalscore;
	//private int previousScore1;
	//private int previousScore2;

	public void addWurf(int score){
		
	}
	
	public void addPoint(int i) {
			this.totalscore += i;
	}

	public int getTotalScore() {
		return totalscore;
	}

	public int getMaxscore() {
		return maxscore;
	}

	public void setMaxscore(int maxscore) {
		this.maxscore = maxscore;
	}

}
