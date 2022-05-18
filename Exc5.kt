fun main(){


    /*
    Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
     */

    var soma = 0
    var numero = 0

    do {

        print( "Digite um numero inteiro: " )
        numero = readln().toInt()
        soma = soma + numero


    }while ( numero != 0 )


    numero + numero
    println("A soma dos valores digitados é de: $soma")


    }


