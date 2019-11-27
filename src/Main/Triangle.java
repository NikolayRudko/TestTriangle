package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;
    private boolean existTriangle;

    /**
     * Constructor with set parameters
     */
    public Triangle() {
        this.sideA = inputNum("A");
        this.sideB = inputNum("B");
        this.sideC = inputNum("C");
        existTriangle = triangleExist();
    }

    /**
     * Constructor for input from the console.
     *
     * @param sideA Side of triangle A.
     * @param sideB Side of triangle B.
     * @param sideC Side of triangle C.
     */
    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        existTriangle = triangleExist();
    }

    /**
     * Method for input data.
     *
     * @param str Name of the triangle side
     * @return Triangle side
     */
    private int inputNum(String str) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean trigger;

        do {
            try {
                trigger = true;
                System.out.printf("Enter side %s. Enter only a positive integer.\n", str);
                num = scanner.nextInt();
                if (num < 1) {
                    throw new MyException("Number (" + num + ") is not positive integer.");
                }

                if (num > 1000000000) {
                    throw new MyException("Number (" + num + ") more Max value.");
                }

            } catch (InputMismatchException | MyException e) {
                trigger = false;
                scanner.nextLine();
                System.out.println("\n" + e);
                System.out.println("That’s not incorrect data. Try again: ");
            }
        } while (!trigger);
        return num;
    }

    /**
     * Output to the console the existence of this triangle.
     */
    public void checkTriangleExist() {
        if (!existTriangle) {
            System.out.println("This triangle does not exist!!!");
        } else {
            System.out.println("This triangle is exist!");
        }
    }

    /**
     * Checking for the existence of a triangle
     *
     * @return Existence
     */
    public boolean triangleExist() {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

    /**
     * Defining the type of triangle
     */
    public void triangleType() {
        if (!existTriangle) {
            System.out.println("This triangle does not exist!!!");
        } else {
            if (equilateralTriangle()) {
                System.out.println("This triangle is equilateral");
            }

            if (isoscelesTriangle() && !equilateralTriangle()) {
                System.out.println("This triangle is isosceles");
            }

            if (versatileTriangle()) {
                System.out.println("This triangle is versatile");
            }
        }
    }

    /**
     * Check for an equilateral triangle.
     *
     * @return Equilateral
     */
    public boolean equilateralTriangle() {
        return existTriangle && (sideA == sideB) && (sideA == sideC);
    }

    /**
     * Check for an isosceles triangle.
     *
     * @return Isosceles
     */
    public boolean isoscelesTriangle() {
        return existTriangle && (sideA == sideB) || (sideB == sideC) || (sideC == sideA);
    }

    /**
     * Check for an versatile triangle.
     *
     * @return Versatile
     */
    public boolean versatileTriangle() {
        return existTriangle && (sideA != sideB) && (sideB != sideC) && (sideA != sideC);
    }
}
