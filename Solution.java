import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), m = fs.nextInt();
			int ans = (m + 1) / 2;
			if (m % 2 == 0) {
				ans++;
			}
			System.out.println(ans);
		}
		fs.close();
	}
}
