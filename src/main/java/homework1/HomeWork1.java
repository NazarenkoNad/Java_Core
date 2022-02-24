package homework1;

import homework1.animals.Cat;
import homework1.animals.Dog;
import homework1.obstacles.*;

public class HomeWork1 {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(10),
                new Wall(3),
                new Water(3)
        }); // Создаем полосу препятствий
        Team team = new Team("Дружба",
                new Cat("Линда", 50, 12, 0),
                new Dog("Джеки", 10, 5, 15),
                new Cat("Харви", 9, 14, 0));
        team.getTeamInfo();
        c.doIt(team);
        team.showResults();         // Показываем результаты

    }
}
