public class Bai3Logic {
    public static String kiemTraDoiXung(String input) {
        String dao = new StringBuilder(input).reverse().toString();
        if (input.equals(dao)) {
            return "Số " + input + " ĐỐI XỨNG";
        } else {
            return "Số " + input + " KHÔNG đối xứng";
        }
    }
}