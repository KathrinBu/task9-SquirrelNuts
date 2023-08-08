public class Tree {

public Nut[] growArrayNuts(int number){
    Nut[] nuts=new Nut[number];
    for (int i = 0; i < nuts.length; i++) {
        nuts[i] = new Nut();
    }

return nuts;
}
}
