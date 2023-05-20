//WAP to find the frequency of letters from b to y in "We have a good future ahead"

public class Frequency {
    String input;

    public Frequency(String input) {
        this.input = input;
    }

    void frequencyOfLetters() {
        String letters = "bcdefghijklmopqrstuvwxy";
        for (int i = 0; i < letters.length(); i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (letters.charAt(i) == input.toLowerCase().charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(letters.charAt(i) + " comes " + count + "times");
            }
        }
    }
}
