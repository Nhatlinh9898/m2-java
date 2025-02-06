

import java.util.Scanner;


public class Main {






    public static void main(String[] args) {


        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Hiển thị lời chào kèm theo tên của người dùng
        System.out.println("Hello: " + name);

//        // Đóng đối tượng Scanner  // viec dong doi tuong scanner khong dung vi tri se anh huong toi ket qua cacs buoc tiep theo
//        scanner.close();


        // Tỉ giá USD to VNĐ (giả định)
        final double exchangeRate = 23000.0;

        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner1 = new Scanner(System.in);

        // Yêu cầu người dùng nhập số tiền USD
        System.out.print("Enter the amount in USD: ");
//        double usd = scanner1.nextDouble();
        double usd = Double.parseDouble(scanner.nextLine());  // su lys ep kieu du lieu voi viec su ly xuong hang

        // Tính giá trị tiền VNĐ
        double vnd = usd * exchangeRate;

        // Hiển thị kết quả
        System.out.printf("Amount in VND: %.2f\n", vnd);

//        // Đóng đối tượng Scanner1
//        scanner1.close();


//        final double exchangeRate = 23000.0;
//
//        Scanner scanner1 = new Scanner(System.in);
//
//        System.out.print("Enter the amount in USD: ");
//        double usd = Double.parseDouble(scanner1.nextLine());
//
//        System.out.print("Enter your name: ");
//        String name1 = scanner1.nextLine();
//
//        double vnd = usd * exchangeRate;
//        System.out.printf("Hello %s, amount in VND: %.2f\n", name1, vnd);
//
//        scanner1.close();

        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner2 = new Scanner(System.in);

        // Yêu cầu người dùng nhập độ dài cạnh của hình vuông
        System.out.print("Enter the side length of the square: ");
        double sideLength = Double.parseDouble(scanner1.nextLine());

        // Tính chu vi và diện tích của hình vuông
        double perimeter = 4 * sideLength;
        double area = sideLength * sideLength;

        // Hiển thị kết quả
        System.out.printf("Perimeter of the square: %.2f\n", perimeter);
        System.out.printf("Area of the square: %.2f\n", area);

//        // Đóng đối tượng Scanner
//        scanner2.close();

// Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner3 = new Scanner(System.in);

        // Nhập điểm Toán
        System.out.print("Enter the Math score: ");
        double mathScore = Double.parseDouble(scanner2.nextLine());

        // Nhập điểm Văn
        System.out.print("Enter the Literature score: ");
        double literatureScore = Double.parseDouble(scanner2.nextLine());

        // Nhập điểm Anh
        System.out.print("Enter the English score: ");
        double englishScore = Double.parseDouble(scanner2.nextLine());

        // Tính tổng và điểm trung bình
        double totalScore = mathScore + literatureScore + englishScore;
        double averageScore = totalScore / 3;

        // Hiển thị kết quả
        System.out.printf("Total score: %.2f\n", totalScore);
        System.out.printf("Average score: %.2f\n", averageScore);

//        // Đóng đối tượng Scanner
//        scanner3.close();

        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner4 = new Scanner(System.in);

        // Nhập bán kính đường tròn
        System.out.print("Enter the radius of the circle: ");
        double radius = Double.parseDouble(scanner3.nextLine());

        // Tính chu vi và diện tích của đường tròn
        double circumference = 2 * Math.PI * radius;
        double area1 = Math.PI * radius * radius;

        // Hiển thị kết quả
        System.out.printf("Circumference of the circle: %.2f\n", circumference);
        System.out.printf("Area of the circle: %.2f\n", area1);

        // Đóng đối tượng Scanner
        scanner4.close();

    }
}