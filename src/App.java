import org.lessons.java.inheritance.Cuffie;
import org.lessons.java.inheritance.Smartphone;
import org.lessons.java.inheritance.Televisori;

public class App {
    public static void main(String[] args) throws Exception {
        Smartphone s1 = new Smartphone(
                5,
                500,
                2,
                "samsumg",
                "nome",
                11,
                5);
        System.out.println("Oggetto Smartphone prova getter memoria: " + s1.getAvailableMemory());

        Televisori t1 = new Televisori(
                "5x5",
                false,
                1,
                "noooome",
                "samsuuuungg",
                53555,
                55555);
        System.out.println("Oggetto Televisori prova getter dimensioni: " + t1.getSize());

        Cuffie c1 = new Cuffie(
                false,
                "black",
                555,
                "samuele",
                "string",
                555,
                555);
        System.out.println("Oggetto Cuffie prova getter isWireless: " + c1.getIsWireless());
    }
}
