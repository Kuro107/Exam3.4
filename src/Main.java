import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pocket pocket1 = new Pocket();
        Pocket pocket2 = new Pocket();
        Keys keys = new Keys();
        Paper paper = new Paper();
        ArrayList<Keepable> pocketL = new ArrayList<>();
        ArrayList<Keepable> pocketR = new ArrayList<>();
        if (pocket1.getPocketVolume() - keys.getKeysVolume() >= 0){
            pocketL.add(keys);
        }else System.out.println("Карман порвется");

        if (pocket2.getPocketVolume() - paper.getPapersVolume() >= 0){
            pocketR.add(paper);
        }else System.out.println("Карман порвется");
        System.out.println(pocketL.get(0));
        System.out.println(pocketR.get(0));

    }
}
