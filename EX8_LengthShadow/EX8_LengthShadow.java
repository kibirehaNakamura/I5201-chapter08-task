public class EX8_LengthShadow {
	public static void main(String[] args) {
		EX8_Calc cl = new EX8_Calc();
		
		int h = Integer.parseInt(args[0]);
		int t = Integer.parseInt(args[1]);
		System.out.println("木の影の長さを求めます");
		System.out.println("高さ\t\t= " + h);
		System.out.println("太陽の高角度\t= " + t);
		System.out.println();
		
		double x = cl.LengthShadow(h, cl.Angle2Radian(t));
		
		System.out.println("影の長さ\t= " + x);
	}
}