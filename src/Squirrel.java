public class Squirrel {


    public void say(){
        System.out.println("nut!");
    }

    public double sum(Nut[] nuts){
        double sum=0;
        for (int i = 0; i < nuts.length; i++) {
            sum+=nuts[i].weight;
            say();
        }
        System.out.println(sum);
        return sum;
    }
}