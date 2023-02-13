public class Order {

    static String[] products;
    static int ctn;

    public static void main(String[] args) {

        products = new String[]{"milk", "water", "buckwheat", "oil", "bear", "juce"};

        for (String product : products) {
            ctn++;
            System.out.println(ctn + ") " + product);
        }
    }
}
