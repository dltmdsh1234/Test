package maisSrc;

public class Member {
	private int x;
	private int y;
	
	public int add(int x, int y) {
		this.x = x;
		this.y = y;
		return x+y;
	}
	
	public int mul(int x, int y) {
		this.x = x;
		this.y = y;
		return x*y;
	}
}
