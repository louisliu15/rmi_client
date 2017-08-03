package pi;

import library.MyRegistry;

public class ComputePi {
	public static void main(String[] args) {
		try {
            String name = "_Pi";
//            MyRegistry registry = new MyRegistry().getRegistry(args[0],Integer.parseInt(args[1]));
            MyRegistry registry = new MyRegistry().getRegistry("127.0.0.1");
            _Pi pi = registry.lookup(name);
//            System.out.println(pi.computePi(Integer.parseInt(args[2])));
            System.out.println(pi.computePi(2));
        } catch (Exception e) {
            System.err.println("ComputePrime exception:");
            e.printStackTrace();
        }
	}
}
