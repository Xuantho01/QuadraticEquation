import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class testQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation giaipt = new QuadraticEquation(-1,2,-1);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter value of a: ");
//        giaipt.a = scanner.nextDouble();
//        System.out.println("Enter value of b: ");
//        giaipt.b = scanner.nextDouble();
//        System.out.println("Enter value of c: ");
//        giaipt.c = scanner.nextDouble();
        giaipt.giaiPT();
    }
}
