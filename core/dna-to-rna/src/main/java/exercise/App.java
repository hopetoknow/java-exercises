package exercise;

public class App {

    public static String dnaToRna(String dna) {
        StringBuilder rna = new StringBuilder();
        char letter;

        for (int i = 0; i < dna.length(); i++) {
            letter = dna.charAt(i);

            switch (letter) {
                case 'G' -> rna.append("C");
                case 'C' -> rna.append("G");
                case 'T' -> rna.append("A");
                case 'A' -> rna.append("U");
                default -> {
                    return null;
                }
            }
        }

        return rna.toString();
    }
}