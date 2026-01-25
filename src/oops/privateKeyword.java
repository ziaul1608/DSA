package oops;

public class privateKeyword {
    public static class sample {
        private int pin;
        String name;

        int getPin () {
            return pin;
        }

        void setPin (int p) {
            pin = p;
        }
    }
    public static void main(String[] args) {
        sample s = new sample();
        s.name = "Ziaul";
        s.setPin(1608);
        System.out.println("ATM card holder name = " + s.name);
        System.out.println("ATM Pin = " + s.getPin());;
    }
}

