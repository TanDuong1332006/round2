public class Bai2Logic {
    public static String daoNguoc(String input) {
        try {
            // Sử dụng StringBuilder để đảo ngược chuỗi nhanh chóng
            String ketQua = new StringBuilder(input).reverse().toString();
            return "Số đảo ngược là: " + ketQua;
        } catch (Exception e) {
            return "Lỗi định dạng!";
        }
    }
}