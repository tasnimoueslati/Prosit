import java.util.Scanner;
public class ZooManagement1 {
    int nbrCages = 20 ;
    String zooName ="my zoo";
    public void affiche(int nbrCages  , String zooName){
        System.out.println(zooName+" comporte "+nbrCages);

    }
    Scanner sc = new Scanner(System.in);
        System.out.println("donner le nombre des cages");

    int nbcages = sc.nextInt();

        if (nbcages < 0) {
        while (nbcages<0){

            System.out.println("donner un nombre positive");
            nbcages = sc.nextInt();
            if (nbcages>0)
                break;

        } }

            System.out.println("donner le nom de zoo :");
            sc.nextLine();
    String Namezoo = sc.nextLine();
    S



}
