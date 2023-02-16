public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(7654, "Space Gray", 14, "M1 Chip", 512, 16, 2019, 9999);
        System.out.println(laptop);

        UsedCar car1 = new UsedCar(5671, "White", "Mercedes-Benz", "C300", 2022, 6500, true, "auto");
        System.out.println(car1);

        Television tv1 = new Television(02331, "Samsung", 55, 2250, true, "black", 899, 10);
        System.out.println(tv1);

        Book book1 = new Book(21242, "Introduction to Java Programming", "Y. Daniel Liang", "Textbook", 2019, 355,
                "Stanford Publisher", "0133761312");
        System.out.println(book1);

        Lamp lamp1 = new Lamp(1324, "White", 5, false, 3000, "Lego", "glass", 19.99);
        System.out.println(lamp1);

        Chair chair1 = new Chair(4398, "black", "wood", 5, 13, "IKEA", false, "flat chair");
        System.out.println(chair1);

    }
}