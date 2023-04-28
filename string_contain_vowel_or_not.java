public class string_contain_vowel_or_not {
 
 public static void main(String args[])
  {
   System.out.println(check_vowel("balloon"));
  }

   static boolean check_vowel(String a)
    {
       return a.toLowerCase().matches(".*[aeiou].*");
    }


}
}