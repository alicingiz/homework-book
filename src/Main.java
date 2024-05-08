import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("city daxil edin");

        Human human = new Human("Kenan", "Alizade", (byte) 28, "baku");
        human.isStudent();
        Human human1 = new Human("resid", "memmedov", (byte) 25, "baku");
        human1.isStudent();
        Human human2 = new Human("fariz", "alizade", (byte) 23, "baku");
        human2.isStudent();
        Human human3 = new Human("samir", "eliyev", (byte) 29, "baku");
        human3.isStudent();
        Human human4 = new Human("kamil", "eli", (byte) 24, "baku");
        Human human5 = new Human("senan", "ali", (byte) 18, "baku");
        Human human6 = new Human("kamran", "veli", (byte) 26, "baku");
        Human human7 = new Human("rovsen", "ismaayil", (byte) 32, "baku");
        Human human8 = new Human("islam", "melik", (byte) 19, "baku");
        Human human9 = new Human("rauf", "veli", (byte) 27, "baku");

        Human[] humans = {human, human1, human2, human3, human4, human5, human6, human7, human8, human9};

        for (var item : humans) {
            getCountByCity(humans);

        }


    }

    public static void getCountByCity(Human[] humans) {

    }

}

