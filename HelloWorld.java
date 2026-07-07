public class HelloWorld {
    public static void main(String[] args) {
        greet("World");
        greet("世界");
        greet("Git");
        greet("Claude");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
