package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class select_answer extends AppCompatActivity {

    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    Button answer5;
    List buttonList = new ArrayList<>();
    List answerList = new ArrayList<>();
    TextView question;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_select_answer);
        count = 1;

        question = findViewById(R.id.display_question);
        question.setText(Constant.question.getQuestion());
        answerList = Constant.QFanswerlist;
        answerList.add(Constant.question.getQCanswer());

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        answer5 = findViewById(R.id.answer5);

        List<Button> TVList = new ArrayList<>();
        TVList.add(answer1);
        TVList.add(answer2);
        TVList.add(answer3);
        TVList.add(answer4);
        TVList.add(answer5);

        Random r = new Random();
        int min = 0;
        int max = 4;

        for (int i = 0; i < 5; i++) {
            buttonList.add(null);
        }

        for (int i = 0; i < answerList.size(); i++) {
            int ran = r.nextInt(max-min);
            buttonList.set(ran, answerList.get(i));
        }

        for(int i=1; i<= 5; i++)
        {
            TVList.get(i-1).setText((String) buttonList.get(i-1));
        }



        TextView SA = findViewById(R.id.select_answer);
        SA.setText("Select answer for player" + count);


    }
    public void on_select_answer1_click(View v){
        if(count == Constant.numPlayer ) {
            Player p = Constant.PlayerList.get(count - 1);
            p.setSelectedAnswer(answer1.getText().toString());
            Intent in = new Intent(this, show_answer.class);
            startActivity(in);
        }
        else {
            count += 1;
            TextView SA = findViewById(R.id.select_answer);
            SA.setText("Select answer for player" + count);
        }
    }
    public void on_select_answer2_click(View v){
        if(count == Constant.numPlayer ) {
            Player p = Constant.PlayerList.get(count - 1);
            p.setSelectedAnswer(answer1.getText().toString());
            Intent in = new Intent(this, show_answer.class);
            startActivity(in);
        }
        else {
            count += 1;
            TextView SA = findViewById(R.id.select_answer);
            SA.setText("Select answer for player" + count);
        }
    }
    public void on_select_answer3_click(View v){
        if(count == Constant.numPlayer ) {
            Player p = Constant.PlayerList.get(count - 1);
            p.setSelectedAnswer(answer1.getText().toString());
            Intent in = new Intent(this, show_answer.class);
            startActivity(in);
        }
        else {
            count += 1;
            TextView SA = findViewById(R.id.select_answer);
            SA.setText("Select answer for player" + count);
        }
    }
    public void on_select_answer4_click(View v){
        if(count == Constant.numPlayer ) {
            Player p = Constant.PlayerList.get(count - 1);
            p.setSelectedAnswer(answer1.getText().toString());
            Intent in = new Intent(this, show_answer.class);
            startActivity(in);
        }
        else {
            count += 1;
            TextView SA = findViewById(R.id.select_answer);
            SA.setText("Select answer for player" + count);
        }
    }
    public void on_select_answer5_click(View v){
        if(count == Constant.numPlayer ) {
            Player p = Constant.PlayerList.get(count - 1);
            p.setSelectedAnswer(answer1.getText().toString());
            Intent in = new Intent(this, show_answer.class);
            startActivity(in);
        }
        else {
            count += 1;
            TextView SA = findViewById(R.id.select_answer);
            SA.setText("Select answer for player" + count);;
        }
    }
    }

