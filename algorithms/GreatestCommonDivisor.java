import java.io.IOException;
import java.io.PrintWriter;

public class GreatestCommonDivisor {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
    	int a = in.nextInt();
    	int b = in.nextInt();
    	out.println(gcd(a, b));
    }

    public void run() {
    	try {
    		in = new FastScanner(System.in);
    		out = new PrintWriter(System.out);
    		solve();
    		out.close();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
	
	public static void main(String[] args) {
		new GreatestCommonDivisor().run();	
	}

	public int gcd(int a, int b) {
		while (b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}

		return a;
	}
}