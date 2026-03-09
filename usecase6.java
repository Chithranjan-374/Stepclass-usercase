public class OOPSBannerUC6 {

    // Method to generate pattern for O
    public static String getO() {
        return String.join("\n",
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** ");
    }

    // Method to generate pattern for P
    public static String getP() {
        return String.join("\n",
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     ");
    }

    // Method to generate pattern for S
    public static String getS() {
        return String.join("\n",
                " *****",
                "*     ",
                " *****",
                "     *",
                "***** ");
    }

    public static void main(String[] args) {

        String[] banner = {
                getO(),
                getO(),
                getP(),
                getS()
        };

        for (String letter : banner) {
            System.out.println(letter);
            System.out.println(); // spacing between letters
        }
    }
}
