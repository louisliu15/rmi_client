package prime;

import library.MyRegistry;

public class computePrime {

	public static void main(String[] args) {
		try {
            String name = "Prime";
//            MyRegistry registry = new MyRegistry().getRegistry(args[0],Integer.parseInt(args[1]));
            MyRegistry registry = new MyRegistry().getRegistry("127.0.0.1");
            Prime prime = registry.lookup(name);
//            System.out.println(prime.isPrime(args[2]));
            System.out.println(prime.isPrime("7"));
        } catch (Exception e) {
            System.err.println("ComputePrime exception:");
            e.printStackTrace();
        }
	}

}
