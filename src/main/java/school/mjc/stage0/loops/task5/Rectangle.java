package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        int r=length;
        int c=height;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c)
                    System.out.print("8 ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}



