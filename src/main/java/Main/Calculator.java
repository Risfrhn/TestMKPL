/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

/**
 *
 * @author HP
 */
public class Calculator {

    // Method with long parameter list
    public int calculate(int num1, int num2, int num3, int num4, int num5) {
        // Method with too many responsibilitiess
        int result = num1 + num2 - num3 * num4 / num5;
        return result;
    }

    // Method with magic number
    public boolean isPositive(int num) {
        // Magic number: 0
        return num > 0;
    }

    // Method with duplicated code
    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Method with public field
    public int publicField = 10;

    // Method with unused private field
    private int unusedField;

    // Method with inconsistent naming convention
    public int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}

