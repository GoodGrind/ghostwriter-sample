package io.ghostwriter.sample.justcrash;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustCrash {

    private static Logger LOG = LoggerFactory.getLogger(JustCrash.class);


    static private class SomeValueClass {

        private final int val;

        private final String desc;

        SomeValueClass(int val, String desc){
            this.val = val;
            this.desc = desc;
        }

    }

    public static void main(String args[]) {
        LOG.info("Starting application 'JustCrash'");

        LOG.info("Snapper in action for built in types: ");
        try {
            int number1 = 42;
            int number2 = 0;
            final int divide = divide(number1, number2);
        }
        catch (Exception ex) {
            LOG.info("Division failed with: " + ex);
        }

        LOG.info("Snapper in action for custom types: ");
        SomeValueClass svc = new SomeValueClass(213, "Twohundredthirteen");
        try {
            doSomethingWithSomeValueClass(svc, null);
        }
        catch (Exception ex) {
            LOG.info("Caught exception: " + ex);
        }
        LOG.info("Finished executing the 'JustCrash' applicaiton");
    }

    static private int divide(int x, int y) {
        return x / y;
    }

    static private boolean doSomethingWithSomeValueClass(SomeValueClass svc, SomeValueClass svc2) {
        return svc2.equals(svc);
    }

}