package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class show_answer extends AppCompatActivity {
    TextView answer1;
    TextView answer2;
    TextView answer3;
    TextView answer4;
    TextView answer5;
    List answerList;
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

        answer1.setText((Integer) answerList.get(4));
        answer2.setText((Integer) answerList.get(0));
        answer3.setText((Integer) answerList.get(1));
        answer4.setText((Integer) answerList.get(2));
        answer5.setText((Integer) answerList.get(3));

    }
    public void on_show_answer_next_click(View v){
        Intent in = new Intent(this,select_answer.class);
        startActivity(in);
    }
}
