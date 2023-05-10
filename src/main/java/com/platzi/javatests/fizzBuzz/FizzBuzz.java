package com.platzi.javatests.fizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int n){
        String result="";

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }if (n % 3 ==0 && n % 5 != 0){
            return "Fizz";
        } if (n % 5 == 0 && n % 3 != 0){
            return  "Buzz";
        }  else{
            return  String.valueOf(n);
        }
    }
/* OTRA POSIBLE OPCIÓN

    public static String fizzBuzz(int num){
        return (num % 3) + (num % 5) == 0 ?  "FizzBuzz" : num % 3 == 0 ? "Fizz" : num % 5 ==0 ? "Buzz": num+"";
    }
*/
}
