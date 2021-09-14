public class Main
{
	public static void main(String[] args) {
		
		List l = new List();
		
		IPCounter ipc = new IPCounter();
		int result = ipc.countIP(l.test);
		int result2 = ipc.countIP(l.getList());
		System.out.println(result);
		System.out.println(result2);
		

	}
}