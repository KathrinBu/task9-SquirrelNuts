public class Main {
    public static void main(String[] args) {
        Nut nut = new Nut();
        nut.getClass();
        Tree tree = new Tree();
        tree.growArrayNuts(15);
        Squirrel squirrel=new Squirrel();
        squirrel.sum(tree.growArrayNuts(15));

    }
}
