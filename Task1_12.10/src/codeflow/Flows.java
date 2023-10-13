package codeflow;

public class Flows {

    public void methodA(String input){
        System.out.println("D");
        if(input.equals("Velkommen")){
            System.out.println("e");
            methodC("Message");
        }
           System.out.println("e");
           System.out.println(methodD(input));
    }

    public int methodB(int number){
        if(!(number < 16)){
            System.out.println("d.\n");
        }
        return 13;
    }

    public void methodC(String msg){
        System.out.println("t\n");
        if(!msg.equals("Message")){
            System.out.println("i");
        }
    }

    public int methodD(String input){
        System.out.println("r\n");
       // System.out.println(methodB());
        return methodB(20);

    }

}
