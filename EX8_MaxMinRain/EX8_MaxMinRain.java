import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX8_MaxMinRain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Search sh = new Search();
		
		int[] arrayRain = new int[12];
		
		System.out.println("雨天の日数を入力");
		for(int i = 0; i < arrayRain.length; i++) {
			System.out.print((i + 1) + "月？>");
			arrayRain[i] = Integer.parseInt(br.readLine());
		}
		System.out.println();
		
		int min = sh.minimum(arrayRain);
		int max = sh.maximum(arrayRain);
		System.out.println("最も多い雨天の日\t" + max + "日");
		System.out.println("最も少ない雨天の日\t" + min + "日");
	}
}