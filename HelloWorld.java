public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(greet("World"));
        System.out.println(greet("世界"));
        System.out.println(greet("Git"));
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
