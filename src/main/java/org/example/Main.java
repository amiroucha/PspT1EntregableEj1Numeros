package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        try
        {
            int totNumeros = Integer.parseInt(args[0]);//numeros a generar
            int contador = 0;//para contar el numero de primos que van saliendo

            Random random = new Random();
            //random.nextInt((max - min) + 1) + min para que no se cuente solo entre el2 y 999 incluidos

            //compruebo si es primo
            while (contador < totNumeros)//mientras que no se hayan generado todos los numeros
            {
                int numero = random.nextInt(((999-2)+1)+2);
                //pongo el while, porq solo con la formula me ha salido un 0
                while(numero < 2 || numero > 999)//me aseguro de que este entre ese rango si o si
                {
                    numero = random.nextInt(((999-2)+1)+2);
                }
                if (esPrimo(numero))
                {
                    System.out.println(numero);
                    contador++;
                }
            }

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No has introducido ningun numero");
        }catch (NumberFormatException e)
        {
            System.out.println("Lo introducido no es un numero ");
        }


    }
    public static boolean esPrimo(int numero)
    {
        //empiezo a comprobar desde el 2
        //hasta la raiz cuadrada del numero generado
        for (int i = 2; i <= Math.sqrt(numero) ; i++) {
            if (numero % i == 0)//no es primo
            {
                return false;
            }
        }
        return true;//si no entra al if es primo
    }

}