public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("helloworld");
        function(1, 0);
    }

    public static void function(int value, int value2) {
        if (value2 == 0) {
            System.err.println("エラー: 0による除算はできません。");
        } else {
            System.out.println(value / value2);
        }
    }
}
