public class frquestion {

    public static void main(String[] args) {

        Sign s = new Sign("luca desapio soeha adshf uew", 3);

        System.out.println(s.numberOfLines());
        System.out.println(s.getLines());
    }
}

class Sign {

    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        int length = message.length();
        return (length + width - 1) / width;
    }

    public String getLines() {
        String result = "";
        int length = message.length();

        for (int i = 0; i < length; i += width) {
            int end = i + width;
            if (end > length) {
                end = length;
            }

            result += message.substring(i, end);

            if (end < length) {
                result += ";";
            }
        }
        return result;
    }
}
