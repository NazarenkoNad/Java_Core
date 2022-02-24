package homework1_v2;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

public class Course {

    private int[] obsts;

    public Course(int obst1, int obst2, int obst3) {
        this.obsts = new int[]{obst1, obst2, obst3};
    }

    public void doSport(Team team) {

        for (int i = 0; i < team.getMembers().length; i++) {
            for (int j = 0; j < obsts.length; j++) {
                team.getMembers()[i].setWinner(false);
              //  System.out.println(team.getMembers()[i]);
               // System.out.println(obsts[j]);
              //  System.out.println(team.getMembers()[i].isWinner());
                if (team.getMembers()[i].getHeightOfJump() < obsts[j]) {
                    team.getMembers()[i].setWinner(false);
                   // System.out.println(team.getMembers()[i].isWinner());
                    break;
                } else {
                    team.getMembers()[i].setWinner(true);
                 //   System.out.println(team.getMembers()[i].isWinner());
                }
            }
        }
    }
}
