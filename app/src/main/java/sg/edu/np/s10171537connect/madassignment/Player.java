package sg.edu.np.s10171537connect.madassignment;

import java.util.List;

public class Player {
    private Integer PlayerID;
    private String PlayerName;
    private Integer PlayerScore;
    private String SelectedAnswer;

    public void setPlayerID(Integer playerID) {
        playerID = PlayerID;
    }

    public Integer getPlayerID() {
        return PlayerID;
    }

    public void setPlayerName(String playerName) {
        playerName = PlayerName;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerScore(Integer playerScore) {
        playerScore = PlayerScore;
    }

    public Integer getPlayerScore() {
        return PlayerScore;
    }

    public void setSelectedAnswer(String selectedAnswer) {
        selectedAnswer = SelectedAnswer;
    }

    public String getSelectedAnswer() {
        return SelectedAnswer;
    }


    public Player(Integer playerID, String playerName, Integer playerScore, String selectedAnswer) {
        PlayerID = playerID;
        PlayerName = playerName;
        PlayerScore = playerScore;
        SelectedAnswer = selectedAnswer;
    }
}