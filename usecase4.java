public class BannerUC4 {

    public static void main(String[] args) {

        // Banner stored in array
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", " ", "*"),
                String.join("", "*", " ", "T", "O", " ", "J", "A", "V", "A", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Print using enhanced loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
