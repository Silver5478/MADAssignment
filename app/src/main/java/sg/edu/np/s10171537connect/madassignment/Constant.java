package sg.edu.np.s10171537connect.madassignment;

import java.util.ArrayList;
import java.util.List;

public class Constant {
    static String gamemode;
    static boolean Online;
    static int numPlayer;
    static int numQuestion;
    static List QFanswerlist;
    static Question question;
    static List PlayerList;

    static public void AddData() {
        Player Player1 = new Player(1, "player1", 0, " ");
        Player Player2 = new Player(2, "player2", 0, " ");
        Player Player3 = new Player(3, "player3", 0, " ");
        Player Player4 = new Player(4, "player4", 0, " ");

/*        PlayerList.add(Player1);
        PlayerList.add(Player2);
        PlayerList.add(Player3);
        PlayerList.add(Player4);*/
    }
}

