package sk.it.first_type;

public class Example {
    // main method
    public static void main(String[] args) {
        Example example = new Example();
        MyInterface myInterface = example::calculateMax;

        myInterface.execute(10, 85);
    }

    public void calculateMax(int reps, int weight) {
        // why switch ?
        switch (reps) {
             
            case 10:
                System.out.println("Your max is: " + weight * (1 / 3f + 1));
                break;
            case 9:
                System.out.println("Your max is: " + weight * (1 / 4f + 1));
                break;
            case 8:
                System.out.println("Your max is: " + weight * (1 / 5f + 1));
                break;
        }
    }
}
