package creational.builder;

public class Main {
    static Form newForm;

    public static void main(String[] args) {
        Form.FormBuilder builder = new Form.FormBuilder("Marco", "Valmores");
        builder.addAddress("Mandaluyong");
        System.out.println(builder.build().getFirstName());
    }
}
