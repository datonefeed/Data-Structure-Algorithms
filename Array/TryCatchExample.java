// public class TryCatchExample {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3};

//         try {
//             // Truy cập phần tử không tồn tại trong mảng
//             int number = numbers[5];
//             System.out.println("Số: " + number);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Lỗi: Chỉ số mảng vượt quá giới hạn.");
//         }

//         System.out.println("Chương trình tiếp tục chạy sau khi xử lý lỗi.");
//     }
// }
// da thay doi tai dong 16

public class TryCatchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        // Kiểm tra chỉ số trước khi truy cập
        int index = 5;
        if (index >= 0 && index < numbers.length) {
            int number = numbers[index];
            System.out.println("Số: " + number);
        } else {
            System.out.println("Lỗi: Chỉ số mảng vượt quá giới hạn.");
        }

        System.out.println("Chương trình tiếp tục chạy.");
    }
}
