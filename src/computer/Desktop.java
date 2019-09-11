package computer;

public class Desktop implements Software,Hardware{

	public void hardwareResources() {
		System.out.println("Hardware as less scope than Software");
	}

	public void softwareResources() {
		System.out.println("Software has more scopr than Hardware");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwareResources();
	}
}


