package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (((int) character >= 65 && (int) character <= 90) || ((int) character >= 97 && (int) character <= 122))
            System.out.println("English");
        else
            System.out.println("Non English");
    }
}
