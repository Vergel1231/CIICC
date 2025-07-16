public class Task3 {
    public static void main(String[] args) {
        // Adjusted variables
        String a = "Wow";               // use string literal for interning
        String b = "Wow";               // same literal as 'a'
        String c = a + "!";             // "Wow!"
        String d = "Wow!";              // same value as c, interned

        boolean b1 = a == b;            // true: both point to same interned literal "Wow"
        boolean b2 = d.equals(b + "!"); // true: "Wow!" equals "Wow" + "!"
        boolean b3 = !c.equals(a);      // true: "Wow!" != "Wow"

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
