import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Yan", "Serhiienko");
        System.out.println(new Gson().toJson(person));
    }
}
