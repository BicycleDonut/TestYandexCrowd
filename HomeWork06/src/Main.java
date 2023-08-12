import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

public class Main {
    public static void main(String[] args) {

        List<NoteBook> notebooks = Arrays.asList(
                new NoteBook(12, 2000, "win8", "blue"),
                new NoteBook(16, 250, "kali", "black"),
                new NoteBook(8, 1000, "dos", "yellow"),
                new NoteBook(16, 500, "debian", "black"),
                new NoteBook(32, 500, "solaris", "green"));

        filter(notebooks);
    }
    public static void filter(List<NoteBook> notebooks) {
        System.out.println("ноутбуки с оперативкой от:");
        Scanner sc = new Scanner(System.in);
        Integer ram = Integer.valueOf(sc.nextLine());
        System.out.println("ноутбуки с жестяком от:");
        Integer hdd = Integer.valueOf(sc.nextLine());
        for (var i : notebooks) {
            if(i.getRam()>=ram && i.getHdd()>=hdd)
                System.out.println(i);
        }
    }
}

