import java.lang.reflect.WildcardType;

public class Ptitchien extends Dog {

    public Ptitchien(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "Je suis un petit chien qui s'appelle " + super.name + ".";
    }

    public void bark(int times) {
        for (int i=0; i<times; i++) {
            super.bark();
        }
    }

    public static void main(String[] args) {
        Ptitchien mydog = new Ptitchien(1, "Cookie");
        System.out.println(mydog);
        mydog.bark(6);
    }
}
