public class ToyRaffle {

    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Машинка", 10, 20);
        Toy toy2 = new Toy(2, "Динозаврик", 200, 40);
        Toy toy3 = new Toy(3, "Кукла", 200, 90);
        Toy toy4 = new Toy(4, "Вертолет", 50, 30);
        Toy toy5 = new Toy(5, "Кубики", 200, 90);
        Toy toy6 = new Toy(6, "Робот", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}
