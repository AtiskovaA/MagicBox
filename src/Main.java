public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(3);
        magicBox.add("Anya");
        magicBox.add("Pasha");
        magicBox.add("Roma");
        magicBox.add("Na");
        System.out.println(magicBox.pick());

        MagicBox<Integer> magicBox1 = new MagicBox<>(3);
        magicBox1.add(110);
        magicBox1.add(10);
        magicBox1.add(200);
        magicBox1.add(20);
        System.out.println(magicBox1.pick());

    }
}