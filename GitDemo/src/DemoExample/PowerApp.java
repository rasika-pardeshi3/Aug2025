package DemoExample;

public class PowerApp {

	public static void main(String[] args) {
		int base=5, index=4;
		int p=1;
		for(int i=1; i<index; i++)
		{
			p=p*base;
		}
		System.out.println("Base is "+p);
	}

}
