public class Sample {

    String name;
    Sample(){

        System.out.println("Constructor called");
        name = "Java";
    }

    public static void main(String[] args) {

        Sample s = new Sample();
        System.out.println("The name is" + s.name);


    }
}
