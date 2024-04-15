package org.example;
/*
Bu program, kullanıcıdan Hex renk kodunu alır ve bu kodu RGB renk koduna dönüştürür.
Sonuç olarak, RGB renk kodunu ekrana basar. Tek yapmanız gereken programı çalıştırmak ve Hex renk kodunu girmektir.
Örnek :
Hex renk kodunu girin (örneğin, #ff0000): #0080ff
RGB renk kodu: 0 128 255
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hex renk kodunu girin (örneğin, #ff0000): ");
        String hexColor = scanner.nextLine();

        int[] rgbColor = hexToRgb(hexColor);
        System.out.println("RGB renk kodu: " + rgbColor[0] + " " + rgbColor[1] + " " + rgbColor[2]);
    }

    public static int[] hexToRgb(String hexColor) {
        int red = Integer.parseInt(hexColor.substring(1, 3), 16);
        int green = Integer.parseInt(hexColor.substring(3, 5), 16);
        int blue = Integer.parseInt(hexColor.substring(5, 7), 16);

        int[] rgbColor = {red, green, blue};
        return rgbColor;
    }
}