fun main() {
    while (true) {
        println("Menú:")
        println("1.Calcular el área de un triángulo")
        println("2.Sumar dos números")
        println("3.Elevar un número al cuadrado")
        println("4.Convertir euros a dólares")
        println("5.Calcular el área y el perímetro de un cuadrado")
        println("6.Calcular el área y el volumen de un cilindro")
        println("7.Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito.")
        println("8.Calcular el promedio de tres (3) números ingresados por teclado ")
        println("9.Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.")
        println("10.Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor.")
        println("11.Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos. ")
        println("12.Dados dos números A y B, sumarlos si A es menor que B o sino restarlos. ")
        println("13.Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.")
        println("14.Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.")
        println("15.Escribir un algoritmo que determine si un año es bisiesto o no. ")
        println("16.Imprimir todos los múltiplos de 3 que hay entre 1 y 100. ")
        println("17.Imprimir los números pares entre 1 y 100.")
        println("18.mprimir los números impares del 0 al 100. ")
        println("19.Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30. ")
        println("20.scribir un programa que sume los cuadrados de los cien primeros números naturales mostrando el resultado en pantalla ")
        println("21.Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente ")
        println("22.Sumar todos los números que se digitan por teclado mientras no sea cero.")
        println("99. Salir")
        print("Ingresa una opción: ")
        val option = readLine()!!.toInt()
        when (option) {
            1 -> {
                println("Calcular el área de un triángulo")
                print("Ingresa la base: ")
                val base = readLine()!!.toInt()
                print("Ingresa la altura: ")
                val height = readLine()!!.toInt()
                val area = (base * height / 2)
                println("El área es: $area")
            }
            2 -> {
                println("Sumar dos números")
                print("Ingresa el primer número: ")
                val one = readLine()!!.toInt()
                print("Ingresa el segundo número: ")
                val two = readLine()!!.toInt()
                val sum = (one + two)
                println("La suma de los dos números es: $sum")
            }
            3 -> {
                println("Elevar un número al cuadrado")
                print("Ingresa el número: ")
                val number = readLine()!!.toInt()
                val operation = (number * number)
                println("El resultado del número elevado al cuadrado es: $operation")
            }
            4 -> {
                println("Convertir euros a dólares")
                print("Ingresa la cantidad de euros: ")
                val euros = readLine()!!.toInt()
                val dollars = (euros * 1.12)
                println("La cantidad en dólares es: $dollars")
            }
            5 -> {
                println("Calcular el área y el perímetro de un cuadrado")
                print("Ingresa el lado del cuadrado: ")
                val side = readLine()!!.toInt()
                val area = (side * side)
                val perimeter = (side + side + side + side)
                println("El área es: $area")
                println("El perímetro es: $perimeter")
            }
            6 -> {
                println("Calcular el área y el volumen de un cilindro")
                print("Ingresa la altura del cilindro: ")
                val height = readLine()!!.toInt()
                print("Ingresa el radio del cilindro: ")
                val radio = readLine()!!.toInt()
                val pi = 3.1416
                val volume = (pi * radio * radio * height)
                println("El volumen del cilindro es: $volume")
                val area = (2 * pi * radio * height + 2 * pi * radio * radio)
                println("El área del cilindro es: $area")
            }
            7 -> {
                    println("Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma" +
                            " y el área (pi*r)^2 del círculo inscrito.")
                    val pi=3.1416
                    println("ingrese el radio de la circunferencia")
                    val radio:Int = readLine()!!.toInt()
                    println("ingrese el diametro de la circunferencia")
                    val diameter:Int = readLine()!!.toInt()
                    val length :Double  = (pi*diameter)
                    println("la longitud de la circunferencia es : $length")

                    val area :Double  = (pi*radio)*(pi*radio)
                    println("la area de la circunferencia es : $area")


            }
            8 -> {                 println("Calcular el promedio de tres (3) números ingresados por teclado")
                    println("ingrese el primer numero:")
                    val one:Int = readLine()!!.toInt()
                    println("ingrese el segundo numero:")
                    val two:Int = readLine()!!.toInt()
                    println("ingrese el tercer numero:")
                    val three:Int = readLine()!!.toInt()
                    val average:Int  = (one+two+three / 3)
                    println("El promedio es: $average")
                }

            9-> {
                    println("Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.")
                    println("ingrese un numero:")
                    val one:Int = readLine()!!.toInt()
                    if (one>0)
                        println("su numero es positivo")
                    else
                        println("su numero es negativo")
                }
            10-> {
                    println("Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor.")
                    println("ingrese el primer numero:")
                    val one: Int = readLine()!!.toInt()
                    println("ingrese el segundo numero:")
                    val two:Int = readLine()!!.toInt()
                    if (one>two) {
                        println("el numero $one es mayor")
                        println("el numero $two es menor")
                    }else if (one<two) {
                        println("el numero $two es mayor")
                        println("el numero $one es menor")
                    } else
                        println("los numeros son iguales")

            }
            11-> {
            println("Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.")
            println("ingrese el primer numero:")
            val one: Int = readLine()!!.toInt()
            println("ingrese el segundo numero:")
            val two: Int = readLine()!!.toInt()
            println("ingrese el tercer numero:")
            val three: Int = readLine()!!.toInt()
            if (one < two && one < three) {
                println("El número más pequeño es: $one");
                if (two > three) {
                    println("El número más grande es:$two");
                } else {
                    println("El número más grande es:$three");
                }
            } else if (two < one && two < three) {
                println("El número más pequeño es:$two");
                if (one > three) {
                    println("El número más grande es: $one");
                } else {
                    println("El número más grande es:$three");
                }
            } else {
                println("El número más pequeño es: $three");
                if (one > two) {
                    println("El número más grande es:$one");
                } else {
                    println("El número más grande es:$two");
                }
            }
        }

            12-> {
                    println("Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.")
                    println("ingrese el primer numero:")
                    val A: Int = readLine()!!.toInt()
                    println("ingrese el segundo numero:")
                    val B: Int = readLine()!!.toInt()
                    if (A < B) {
                        val sum = (A + B)
                        println("la suma de A + B es : $sum")
                    } else if (A > B) {
                        val subtract = (A - B)
                        println("la resta de A - B es : $subtract")
                    } else
                        println("ingreso un valor aquivocado")
                }

            13-> {
                    println("Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero\n" +
                            "no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es\n" +
                            "posible.\n.")
                    println("ingrese el primer numero:")
                    val A: Int = readLine()!!.toInt()
                    println("ingrese el segundo numero:")
                    val B: Int = readLine()!!.toInt()
                    if (A==0) {
                        println("no puede ser posible la divicion ya que el valor no puede ser cero")
                    } else if (B==0) {
                        println("no puede ser posible la divicion ya que el valor no puede ser cero")
                    }else {
                        val quotient:Double = (A/B).toDouble()
                        println("la cociente de A y B es : $quotient")
                    }
                }

            14-> {
                    println("Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.")
                    println("ingrese el primer numero:")
                    val A: Int = readLine()!!.toInt()
                    println("ingrese el segundo numero:")
                    val B: Int = readLine()!!.toInt()
                    if ((A < 0) ||(B<0)) {
                        val sum = (A + B)
                        println("la suma de A + B es : $sum")
                    } else if ((A > 0) && (B>0)) {
                        val multiplication = (A * B)
                        println("la multiplicación de A y B es : $multiplication")
                    } else
                        println("ingreso un valor aquivocado")
                }

            15-> {
                    println("Escribir un algoritmo que determine si un año es bisiesto o no.")
                    println("ingrese el año que quiera:")
                    val year: Int = readLine()!!.toInt()
                    if ((year%400==0)||(year%4==0)){
                        println("el año que ingreso es un año bisiesto")
                    } else
                        println("el año ingresado no es un año bisiesto")
                }
            16-> {
                    for (i in 0..100) {
                        if(i%3==0){
                            println(i)
                        }
                    }
                }
            17-> {
                    for (i in 1..100) {
                        if(i%2==0){
                            println(i)
                        }
                    }
                }
            18-> {
                    for (i in 0..100) {
                        if(i%2==1){
                            println(i)
                        }
                    }
                }
            19-> {
                    for (i in 1..30) {
                        val square:Int=(i*i)
                        println("$square")
                    }
                }
            20-> {
                    var sum=0
                    for (i in 1..100) {
                        sum += i*i
                    }
                    println("$sum")
            }
            21-> {
                    println(
                        "Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los\n" +
                                "números comprendidos entre ellos en secuencia ascendente."
                    )
                    println("ingrese el primer numero menor:")
                    val number1: Int = readLine()!!.toInt()
                    println("ingrese el segundo numero msyor:")
                    val number2: Int = readLine()!!.toInt()
                    for (i in number1..number2){
                        println("$i")
                    }
            }
            22-> {
                    println("Sumar todos los números que se digitan por teclado mientras no sea cero.")
                    var sum=0
                    var number:Int

                    println("ingrese el primer numero:")
                    number = readLine()?.toInt() ?: 0

                    while (number!=0){
                        sum +=number
                        println("ingrese otro numeroo digite 0 para salir:")
                        number = readLine()?.toInt() ?: 0
                    }
                    println("la suma total es $sum")
                }

            99 -> break
            else -> println("Opción inválida")
        }
    }
}
