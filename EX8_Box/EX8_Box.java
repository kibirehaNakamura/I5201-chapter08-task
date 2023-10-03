public class EX8_Box {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = Integer.parseInt(args[2]);
		
		System.out.println("画用紙から作る箱の容積を求める");
		System.out.println("a = " + a + ", b = " + b + ", x = " + x);
		
		int v = CalcCapa(a, b, x);
		System.out.println("容積 = " + v);
	}
	
	
	private static int CalcCapa(int a, int b, int x) {
		if((a <= (x * 2)) || (b <= (x * 2))) {
			System.out.println("入力値に誤りがあります！");
			System.exit(1);
		}
		
		int v = (a - (x * 2)) * (b - (x * 2)) * x;
		
		return v;
	}
}