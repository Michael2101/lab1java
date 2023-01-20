public class Palindrome 
{
    public static void main(String[] args)
    {
        String s1 = "potop";
        if (isPolindrome(s1)) 
        {
            System.out.println(s1 + " - палиндром");
        }
        else {
            System.out.println(s1 + " - Не является палиндромом");
        }
        for (int i=0; i < args.length;i++)
        {
            String s = args[i];
        }
    }
    public static String reverseString(String s) // Функция переварачивает слово 
    {
        String s2 = ""; 
        for (int i = s.length() - 1; i >= 0; i--)
        {   
            s2 += s.charAt(i);
        } 
        return s2;
    }

    public static boolean isPolindrome(String s) // Функция проверки является ли введенное слово палиндромом
    {
        return reverseString(s).equals(s);
    }
}