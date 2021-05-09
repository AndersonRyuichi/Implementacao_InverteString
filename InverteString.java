package InverterString;

public class InverteString {
    public static void main(String[] args) {
        String input = "snemeiS tfahcsllesegneitkA";
        StringBuilder result = new StringBuilder(input.length());

        for (String s : input.split(" ")) {
            if (result.length() != 0) result.append(' ');
            for (int x = s.length() - 1; x >= 0; x--) {
                result.append(s.charAt(x));
            }
        }
        System.out.println(result);
    }
}
