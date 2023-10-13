import codeflow.Flows;

public class Main {
    public static void main(String[] args) {

        Flows flows = new Flows();
        System.out.println("flows.methodA(\"Velkommen\");");
        flows.methodA("Velkommen");
        System.out.println("flows.methodB(\"Velkommen\");");
        flows.methodB(13);
        System.out.println("flows.methodC(\"Message\");");
        flows.methodC("Message");
        System.out.println("flows.methodD(\"Velkommen\");");
        flows.methodD("Velkommen");

    }
}