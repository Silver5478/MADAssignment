package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class show_answer extends AppCompatActivity {
    TextView answer1;
    TextView answer2;
    TextView answer3;
    TextView answer4;
    TextView answer5;
    List answerList = new ArrayList();
    List<TextView> TVList = new ArrayList<TextView>();
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_result);
        question = findViewById(R.id.display_question);
        question.setText(Constant.question.getQuestion());
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        answer5 = findViewById(R.id.answer5);
        answerList = Constant.QFanswerlist;
        answerList.add(Constant.question.getQCanswer());
        TVList.add(answer1);
        TVList.add(answer2);
        TVList.add(answer3);
        TVList.add(answer4);
        TVList.add(answer5);
        for(int i=1; i<=Constant.numPlayer; i++)
        {
            TVList.get(i).setText((String) answerList.get(i-1));
        }


        String QA = Constant.question.getQCanswer();
        for(int i=1; i<=Constant.numPlayer; i++)
            {
            if(answerList.get(i-1) == QA)
            {
                TextView ctv = TVList.get(i);
                ctv.setBackgroundColor(0x1cc4a8);
                Player p = Constant.PlayerList.get(i);
                if (p.getSelectedAnswer() == QA)
                {
                    p.setPlayerScore(p.getPlayerScore() + 1);
                }
            }
        }
    }
    public void on_show_answer_next_click(View v){
        Intent in = new Intent(this,question_score.class);
        startActivity(in);
    }
}
