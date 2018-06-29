import java.io.*;

class InputStreamDemo {
	String name;
	InputStreamReader is;
	BufferedReader bf;
	
	InputStreamDemo() {
		is = new InputStreamReader(System.in);
		bf = new BufferedReader(is);
	}

	void accept() throws IOException {
		System.out.println("Enter your name");
		name = bf.readLine();
	}

	void display() {
		System.out.println("Detials-");
		System.out.println(name);
	}

	public static void main(String[] args) {
		try {
			InputStreamDemo demo = new InputStreamDemo();
			demo.accept();
			demo.display();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
	