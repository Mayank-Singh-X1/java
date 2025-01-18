//String methods
public class string_method {
  public static void main(String[] args){

          //012345
  String b="Mayank";
  String a="     Mayank is cool guy        ";

  System.out.println(b.length());
  System.out.println(b.toUpperCase());
  System.out.println(b.toLowerCase());
  System.out.println(b.indexOf("y"));
  System.out.println(a.trim());
  System.out.println(b.substring(3));
  System.out.println(b.substring(2,3));
  System.out.println(b.replace("M","k"));
  System.out.println(b.startsWith("May"));
  System.out.println(b.endsWith("k"));
  System.out.println(b.startsWith("k"));
  System.out.println(b.charAt(4));
  System.out.println(b.indexOf("M"));
  System.out.println(b.indexOf("a",2));
  System.out.println(b.lastIndexOf("an")); 
  System.out.println(b.equalsIgnoreCase("mayank"));
  System.out.println(b.equalsIgnoreCase("ayank"));
  System.out.println("she said \"Hello\" to me");
}
}