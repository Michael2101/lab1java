public class Primes{
public static void main(String[] args){

    for (int i=2;i<100;i++){ // Цикл перебирает числа в диапазоне от 2 до 100 
    if(isPrime(i)){          // Обращение к функции isPrime
        System.out.println(i + "- является простым числом");
    }
    }

}
public static boolean isPrime(int n){ // Функция которая определяет, является ли аргумент простым числом или нет
    for(int i=2; i<n;i++){
        if (n%i==0) {
            return false;
        }
    }
    return true;
}
}