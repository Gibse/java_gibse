// 1601609 �輼��
import java.util.Scanner;

abstract class Converter {
	protected double ratio;
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	public Converter() {}
	public Converter(double ratio) {
		this.ratio = ratio;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(destString()+"�� "+ srcString()+"���� �ٲߴϴ�.");
		System.out.print(destString()+ "�� �Է��ϼ��� >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+ destString() + "��  "+res + srcString()+"�Դϴ�.");
		scanner.close();
	}
}

class Won2Dollar extends Converter	{
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
		//super(ratio);
	}
	protected double convert(double src) {
		return ratio/src;
	}
	protected String srcString() {return "��";}
	protected String destString() {return "�޷�";}
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1255.50);
		toDollar.run(); // 20-05-05 �� ���� �޷���Ȳ
	}

}
