package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

         // --- Declaración de variables ---       
        // TODO: Implementación en main
        int numeroEntero= 25;
        System.out.println("Entero: " + numeroEntero);

        double precioProducto = 299.99;
        System.out.println("double en una sola linea:" + precioProducto);

        String mensajeBienvenida = "Esta es la actividad 1";
        System.out.println(mensajeBienvenida);

        // --- Identificadores ---       
        // TODO: Implementación en main

        //lower porque empieza con minuscula y  camelcase porque la siguente palabra empieza con mayuscula
        int numeroEstudiantes = 28;
        String nombreInstructor = "Sara Garcia";
        System.out.println("Estudiantes: " + numeroEstudiantes + "Instructor: " + nombreInstructor);

        //Se escribe en mayusculas separado po guiones bajos
        final String NOMBRE_MODULO = "Java";
        System.out.println("Modulo: " + NOMBRE_MODULO);

        // --- Estilos de convención de codificación ---       
        // TODO: Implementación en main

        // --- Tipos de datos primitivos ---       
        // TODO: Implementación en main

        // se declaran variables primitivas java tiene 8 tipos de datos primitivos
        byte b = 8; // numero entero pequeño
        short s = 32000; // enteros mas grandes
        int i = 100000; // entero comunes 
        long l = 123456789L; // enteros muy grandes con nota l
        float f = 3.14f; // numero decimal nota f
        double d = 2.71828; // decimales mas precisos
        boolean activo = true; // verdadero falsos
        char letra = 'J'; // un solo caracter

        // el sufijo l en 123456789l indica que es long, el sufijo f en 3.14f indica que es un float, sin la f java lo interpreta como un double o tipo de dato diferente
        
        // aqui estas concatenando texto con variables para imprimir en consola, system.out.println impime una linea y el simbolo + concatena una texto y valores 


        System.out.println("byte=" + b + "short=" + s + " int=" + i + " long=" + l);
        System.out.println("float=" + f + "double=" + d + "boolean" + activo + "char=" + letra);

        int opA = 12, opB = 5;
        System.out.println("operacion aritmetica (suma): " + (opA + opB));
        if (activo) System.out.println("Activo es true");


        // --- Tipos de datos no primitivos ---       
        // TODO: Implementación en main

        // string es objeto y int crea un arreglo de 3 enteros el indice empieza en o

        String texto = "Cadena de ejemplo";
        System.out.println("Texto: " + texto);


        int[] arreglo = new int[3];
        arreglo[0] = 7; arreglo[1] = 14; arreglo[2] = 21;
        System.out.println("Arreglo: " + arreglo[0] + ", " + arreglo[1] + ", " + arreglo[2]);

        // --- Operadores aritméticos ---       
        // TODO: Implementación en main

        // a / b2 entre enteros hace division entera resultado entero sin decimales, double realiza casting de a a double para obtener division con decimales, a % b2 devuelve el resto de la division y a++ incrementa en 1 y a-- decrementa en 1

        int a = 10, b2 = 3;
        System.out.println("Suma: " + (a + b2));
        System.out.println("División entera: " + (a / b2));
        System.out.println("División decimal: " + ((double)a / b2));
        System.out.println("Módulo: " + (a % b2));
        a++; a--; 


        // --- Operadores de asignación ---       
        // TODO: Implementación en main

        //n+5 es equivalente a n = n+5 los demas siguen la misma logica y n %=3 deja en n el resto de dividir n por 3 util para obtener paridad u otras comprobaciones

        int n = 20;
        System.out.println("Inicial: " + n);

        n += 5;
        System.out.println("Después de n += 5: " + n);

        n -= 3;
        System.out.println("Después de n -= 3: " + n);

        n *= 2;
        System.out.println("Después de n *= 2: " + n);

        n /= 4;
        System.out.println("Después de n /= 4: " + n);

        n %= 3;
        System.out.println("Después de n %= 3: " + n);



        // --- Operadores de comparación ---       
        // TODO: Implementación en main

        // ==, !=, >, <, >=, <= comparan valores y devuelven booleanos , se imprime el resultado booleano o se usa en el if

        int m = 8, n2 = 10;
        System.out.println("m == n2? " + (m == n2));
        System.out.println("m != n2? " + (m != n2));
        System.out.println("m > n2? " + (m > n2));
        System.out.println("m <= n2? " + (m <= n2));
        if (m < n2) System.out.println("m es menor que n2");


        // --- Operadores lógicos ---       
        // TODO: Implementación en main

        // && = AND (true solo si ambas son true), ||= OR (true si almenos una es true), ! = NOT(invierte el booleano), los parentesis controlan la evaluacion

        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2 => " + (cond1 && cond2));
        System.out.println("cond1 || cond2 => " + (cond1 || cond2));
        System.out.println("!cond1 => " + (!cond1));
        System.out.println("(cond1 || cond2) && !cond2 => " + ((cond1 || cond2) && !cond2));


        // --- If ---       
        // TODO: Implementación en main

        int v1 = 15, v2 = 12;
        if (v1 > v2) System.out.println("v1 > v2");

        if (v1 % 2 == 0) { System.out.println("v1 par"); }
        else { System.out.println("v1 impar"); }

        int nota = 76;
        if (nota >= 90) System.out.println("Excelente");
        else if (nota >= 70) System.out.println("Aprobado");
        else System.out.println("Reprobado");



        // -- Operador ternario --
        // TODO: Implementación en main

        int edad = 18;
        String mayoria = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        int cantidad = 12;
        double descuento = (cantidad > 10) ? 0.10 : 0.0;

        int num = 9;
        System.out.println("Paridad: " + ((num % 2 == 0) ? "Par" : "Impar"));


        // --- Switch ---       
        // TODO: Implementación en main

// --- Switch ---
// Objetivo: demostrar el uso de la estructura switch con ejemplos de texto y números

        String dia = "Miércoles";
        switch (dia) {
            case "Lunes":
                System.out.println(dia + ": 1");
                break;
            case "Martes":
                System.out.println(dia + ": 2");
                break;
            case "Miércoles":
                System.out.println(dia + ": 3");
                break;
            case "Jueves":
                System.out.println(dia + ": 4");
                break;
            case "Viernes":
                System.out.println(dia + ": 5");
                break;
            case "Sábado":
                System.out.println(dia + ": 6");
                break;
            case "Domingo":
                System.out.println(dia + ": 7");
                break;
            default:
                System.out.println(dia + ": Día inválido");
        }

        // Convertir calificación numérica en texto
        int cal = 5;
        switch (cal) {
            case 1:
                System.out.println(cal + ": Insuficiente");
                break;
            case 2:
                System.out.println(cal + ": Regular");
                break;
            case 3:
                System.out.println(cal + ": Bueno");
                break;
            case 4:
                System.out.println(cal + ": Muy Bueno");
                break;
            case 5:
                System.out.println(cal + ": Excelente");
                break;
            default:
                System.out.println(cal + ": Calificación inválida");
        }

        // Imprimir estación del año según número
        int estacion = 2;
        switch (estacion) {
            case 1:
                System.out.println(estacion + ": Primavera");
                break;
            case 2:
                System.out.println(estacion + ": Verano");
                break;
            case 3:
                System.out.println(estacion + ": Otoño");
                break;
            case 4:
                System.out.println(estacion + ": Invierno");
                break;
            default:
                System.out.println(estacion + ": Número fuera de rango");
        }

        // --- Otros ejemplos ---       
        // TODO: Implementación en main


        // password.equals se usa para comparar contenidos de string no se usa == para comparar string porque eso compara referencias no contenidos y la clasificacion de rangos para notaFina es un ejemplo de decision encadenadas

         int numero = 0;
        if (numero > 0) System.out.println("Positivo");
        else if (numero < 0) System.out.println("Negativo");
        else System.out.println("Cero");

        String password = "abc123";
        if (password.equals("abc123")) System.out.println("Contraseña correcta");
        else System.out.println("Contraseña incorrecta");

        int notaFinal = 85;
        if (notaFinal >= 90) System.out.println("Excelente");
        else if (notaFinal >= 70) System.out.println("Bueno");
        else System.out.println("Insuficiente");

    }
}