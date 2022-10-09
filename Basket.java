public class Basket {

    static String items = "";

    static int totalPrice = 0;

    public static void main(String[] args) {
        add("Кефир", 69);
        add("Молоко", 80);
        add("Сухарики", 40);
        add("Хлеб", 30);
        print("Содержимое корзины:");

        System.out.println("Общая стоимость товаров: " + getTotalPrice());
        clear();
        print("Содержимое корзины:");
        System.out.println("Общая стоимость товаров: " + getTotalPrice());


    }


        public static void add (String name,int price){
            if (isContains(name)) {
                return;
            }
            items = items + "\n" + name + " - " + price;
            totalPrice = totalPrice + price;

        }

        public static boolean isContains (String name) {
        return items.contains(name);


        }

        public static int getTotalPrice() {
        return totalPrice;
        }

        public static void clear() {
        items = "";
        totalPrice = 0;
        }

        public static void print(String title){
            System.out.println(title);
            if (items.isEmpty()){
                System.out.println("Корзина пуста");
            } else {
                System.out.println(items);
            }
        }

}
