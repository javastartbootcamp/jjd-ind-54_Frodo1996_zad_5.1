package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    Point point = new Point();

    public void run(Scanner scanner) {
        System.out.println(System.in);
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        System.out.println("Punkt" + " (" + x + "," + y + ")" + point.quarter(x, y));
    }
}
