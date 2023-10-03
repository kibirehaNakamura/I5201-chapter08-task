public class EX8_Calc {
	public double LengthShadow(int h, double radT) {
		double x = h / Math.tan(radT);
		return x;
	}
	
	
	public double Angle2Radian(int t) {
		double radT = t * 3.14159 / 180;
		return radT;
	}
}