package compute;

import java.math.BigDecimal;

import compute.*;
import library.MyRegistry;

public class ComputeEngine {
	public static void main(String args[]) {
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
            String name = "Compute";
//            MyRegistry registry = new MyRegistry().getRegistry(args[0],Integer.parseInt(args[1]));
            MyRegistry registry = new MyRegistry().getRegistry("127.0.0.1");
            
            Compute comp = (Compute) registry.lookup(name);
//            Pi task = new Pi(Integer.parseInt(args[2]));
            Pi task = new Pi(Integer.parseInt("5"));
            
            BigDecimal pi = comp.executeTask(task);
            System.out.println(pi);
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }    

}
