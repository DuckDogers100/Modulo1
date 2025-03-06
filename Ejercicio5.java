/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author gerar
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String[][] datos = {
            {"Gissel", "Gomez", "  Ingenieria", "  Sin especificar"},
            {"Bripny", "Gomez", "  Ingenieria", "  Sin especificar"},
                {"Jerry", "Iscoa", "  Ingenieria", "  Sin Especificar"},
            {"Carlos", "Ordoñez", "  Ingenieria", "  Sin Especificar"},
            {"Laura", "Maradiaga", "  Ingeniería", "  Sin Especificar"}
        };

        for (String[] fila : datos) {
            System.out.println(String.join(" ", fila));
        }
    }
}