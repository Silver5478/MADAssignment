package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class select_answer extends AppCompatActivity {
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    Button answer5;
    List answerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_select_answer);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        answer5 = findViewById(R.id.answer5);
        answerList = Constant.QFanswerlist;
        answerList.add(Constant.question.getQCanswer());


        answer1.setText((Integer) answerList.get(0));
        answer2.setText((Integer) answerList.get(1));
        answer3.setText((Integer) answerList.get(2));
        answer4.setText((Integer) answerList.get(3));
        answer5.setText((Integer) answerList.get(4));
    }
    public void on_select_answer_next_click(View v){
        Intent in = new Intent(this,show_answer.class);
        startActivity(in);
    }
}
