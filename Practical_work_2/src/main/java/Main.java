import java.io.IOException;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        var p1 = new Human(20, "Анна", "Смоук", LocalDate.of(2002, 5, 14), 70);
        var p2 = new Human(16, "Иван", "Иванов", LocalDate.of(2006, 8, 1), 90);
        var p3 = new Human(60, "Глеб", "Пазл", LocalDate.of(1962, 4, 27), 99);
        var allPeople = List.of(p1, p2, p3);
        for (Human h: allPeople){
            System.out.println("Имя: "+h.getName()+"; Фамилия: "+h.getLastName()+"; Дата рождения:"+h.getDate()+"; Возвраст:"+h.getAge()+"; Вес:"+h.getWeight());
        }

        System.out.println("\n1) Сортировка по дате рождения");
        var res=allPeople.stream().sorted(Comparator.comparing(Human::getDate))
                .collect(Collectors.toList());
        for (Human h: res){
            System.out.println("Имя: "+h.getName()+"; Фамилия: "+h.getLastName()+"; Дата рождения:"+h.getDate()+"; Возвраст:"+h.getAge()+"; Вес:"+h.getWeight());
        }

        System.out.println("\n2) Фильтрация по возрасту меньше, чем 50");
        Predicate<Human> byAge = pers -> pers.getAge() < 50;
        var res2 = allPeople.stream().filter(byAge)
                .collect(Collectors.toList());
        for (Human h: res2){
            System.out.println("Имя: "+h.getName()+"; Фамилия: "+h.getLastName()+"; Дата рождения:"+h.getDate()+"; Возвраст:"+h.getAge()+"; Вес:"+h.getWeight());
        }

        System.out.println("\n3) Сортировка по весу");
        var res3=allPeople.stream().sorted(Comparator.comparing(Human::getWeight))
                .collect(Collectors.toList());
        for (Human h: res3){
            System.out.println("Имя: "+h.getName()+"; Фамилия: "+h.getLastName()+"; Дата рождения:"+h.getDate()+"; Возвраст:"+h.getAge()+"; Вес:"+h.getWeight());
        }

        System.out.println("\n4) Конкатенация всех имен в одну большую строку через пробел ");
        String res4 = allPeople.stream()
                .map(Human::getName)
                .collect(Collectors.joining(", "));
        System.out.println(res4);
    }
}
