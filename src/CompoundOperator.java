public class CompoundOperator {

    public static void main(String[] args) {
        //1
        int camel = 2, giraffe = 3;
        camel = camel * giraffe;
        System.out.println(camel);

        camel *= giraffe;
        System.out.println(camel);

        //2
        long goat = 10;
        int sheep = 5;
//        sheep =  sheep * goat;
        sheep *= goat;
        System.out.println(sheep);
    }
}
