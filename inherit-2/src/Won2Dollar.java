// 1601609 김세현
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
		System.out.println(destString()+"를 "+ srcString()+"으로 바꿉니다.");
		System.out.print(destString()+ "를 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+ destString() + "는  "+res + srcString()+"입니다.");
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
	protected String srcString() {return "원";}
	protected String destString() {return "달러";}
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1255.50);
		toDollar.run(); // 20-05-05 시 기준 달려현황
	}

}
