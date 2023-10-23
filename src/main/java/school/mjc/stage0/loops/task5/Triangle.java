package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int a) {


        for (int i = 1; i < a; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }
    }}


