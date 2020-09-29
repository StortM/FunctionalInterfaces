public class Main {
    public static void main(String[] args) {

        //defining method without parameters and defining method
        ZeroArgument zeroArgument = () -> {
            System.out.println("intet argument");
        };
        zeroArgument.printSomething();

        //defining method with two parameters
        OneArgument<Integer> oneArgument = (Integer i) -> {
            System.out.println("The argument is " + i);
            return i;
        };
        //testing method instantiation with int
        oneArgument.printOne(10);

        //defining same interface as above with type boolean
        OneArgument<Boolean> oneArgument1 = (Boolean b) -> {
            System.out.println("Something else is " + b);
            return b;
        };
        //testing results in something slightly else
        oneArgument1.printOne(true);

        //defining method with two paramters
        TwoArguments<Integer, Integer> twoArguments = (Integer i, Integer j) -> {
            System.out.println("Product of ints is " + i*j);
        };
        twoArguments.printTwo(10,5);


    }



}
