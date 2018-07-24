package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class show_answer extends AppCompatActivity {
    TextView answer1;
    TextView answer2;
    TextView answer3;
    TextView answer4;
    TextView answer5;
    List answerList;
    List<TextView> TVList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_result);
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

        answer2.setText((Integer) answerList.get(0));
        answer3.setText((Integer) answerList.get(1));
        answer4.setText((Integer) answerList.get(2));
        answer5.setText((Integer) answerList.get(3));
        answer1.setText((Integer) answerList.get(4));

        String QA = Constant.question.getQCanswer();
        for(int i=1; i<=5; i++)
        {
            if(answerList.get(i) == QA)
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
        Intent in = new Intent(this,select_answer.class);
        startActivity(in);
    }
}
