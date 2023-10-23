package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int size=sideLength;


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // print only stars in middle row
                if (i == size / 2) {
                    System.out.print("8");
                }
                // other than middle row, print star only at index size/2
                else {
                    if (j == size / 2) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}



