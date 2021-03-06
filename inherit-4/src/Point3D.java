// 1601609 김세현
class Point{
	private int x,y;
	public Point(int x, int y) {this.x= x; this.y=y;}
	protected int getX() {return x;}
	protected int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}
}
public class Point3D extends Point {
	int z;
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public void moveUp() {
		++z;
	}
	public void moveDown() {
		--z;
	}
	public void move(int x, int y,int z) {move(x, y); this.z=z; }
	
	public String toString() {
		return "(" + getX() + ',' + getY() + ',' + z + ")의 점" ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString()+"입니다.");
	}

}
