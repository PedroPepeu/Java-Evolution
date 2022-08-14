public class Sstrng {
    public static void main(String[] args) {

        String txt = "I study computer science";
        System.out.println(txt.length());

        String testtxt = "SeE HoW It WOrK";
        System.out.println(testtxt.toUpperCase());
        System.out.println(testtxt.toLowerCase());

        String place = "where is 'gg'? it's here = gg";
        System.out.println(place.indexOf("gg"));

        String user = "Freitas";
        String email = "freitas@gmail.com";
        System.out.printf("%d %d", user, email);

        String firstName = "Pedro";
        String lastName = "Pepeu";
        System.out.println(firstName.concat(lastName));

        // java use ' + ' for both addition and concatenated

        int x = 10;
        int y = 20;
        System.out.println(x + y); // 30, because its int

        String noIdea = "10";
        String stillNoCreative = "20";
        System.out.println(noidea + stillnocreative); // 1020, in reason of it's string
        
        int imThinkingOK = 10;
        String notYet = "20";
        System.out.println(imThinkingOK + notYet); // 1020, it become all String

        // now I'm gonna use special caracters

        System.out.println("\'Vikings\'");
        System.out.println("\"Vikings\"");
        System.out.println("\\Vikings\\");
        // \n (new line)
        System.out.println( "iwerfgbpqaweiru \n yWEGF0P QWE8F");
        // \r	(Carriage Return)
        System.out.println("faerugh \r soeuirtngváe");
        // \t	(Tab)
        System.out.println("paerighb \tipawerg");
        // \b	(Backspace)
        System.out.println("ha3rgh \b apergyvhb");
        // \f	(Form Feed)
        System.out.println("JAERPGFI \f aperiguhbqe-ar");

    }
    
}
