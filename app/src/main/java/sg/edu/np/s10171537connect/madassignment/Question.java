package sg.edu.np.s10171537connect.madassignment;

import java.security.PublicKey;

public class Question {

    private String Question;
    private String QType;
    private String QCanswer;



    public void setQuestion(String question) {
        Question = question;
    }

    public String getQuestion() {
        return Question;
    }
    public void setQType(String QType) {
        this.QType = QType;
    }

    public String getQType() {
        return QType;
    }



    public String getQCanswer() {
        return QCanswer;
    }

    public void setQCanswer(String QCanswer) {
        this.QCanswer = QCanswer;
    }

    public Question(String question, String qType, String qCanswer){
        Question = question;
        QType = qType;
        QCanswer = qCanswer;

    }
}
