public class OOPSBannerUC7 {

    // Static inner class to store character and pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern[] patterns = {

            new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }),

            new CharacterPattern('P', new String[]{
                    "***** ",
                    "*    *",
                    "***** ",
                    "*     ",
                    "*     "
            }),

            new CharacterPattern('S', new String[]{
                    " *****",
                    "*     ",
                    " *****",
                    "     *",
                    "***** "
            })
        };

        String word = "OOPS";

        for (char c : word.toCharArray()) {

            for (CharacterPattern cp : patterns) {
                if (cp.getCharacter() == c) {

                    for (String line : cp.getPattern()) {
                        System.out.println(line);
                    }
                    System.out.println();
                }
            }
        }
    }
}
