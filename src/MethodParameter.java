public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Rafi", "Khalish");
        sayHello("Khalish", "Rafi");

    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
