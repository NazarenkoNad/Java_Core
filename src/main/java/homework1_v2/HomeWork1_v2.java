package homework1_v2;

public class HomeWork1_v2 {
    public static void main(String[] args) {
        Member member1 = new Member("Надя", 300);
        Member member2= new Member("Коля", 175);
        Member member3 = new Member("Вася", 220);
        Member member4 = new Member("Петя", 150);

        Team team = new Team("Дружба", member1, member2, member3,member4);
        Course course = new Course(50, 160, 170);

        team.info();
        course.doSport(team);
        System.out.println();
        team.winnersInfo();
    }

}
