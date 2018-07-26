package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class enter_fake_answer extends AppCompatActivity {
    EditText fanswer;
    TextView question;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DBHelper dbHandler = new DBHelper(this, null, 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_enter_fake_answer);
        Constant.question = dbHandler.getRandomQuestionByType(Constant.catergory);

        TextView PN = findViewById(R.id.enter_fake_answer);
        PN.setText("Enter Fake answer for player" + count);
        fanswer = findViewById(R.id.fake_answer);
        question = findViewById(R.id.display_question);
        question.setText(Constant.question.getQuestion());

    }
    public void on_Fake_answer_next_click(View v){
        if(count == Constant.numPlayer ) {
            Constant.QFanswerlist.add(fanswer.getText().toString());
            Intent in = new Intent(this, select_answer.class);
            startActivity(in);
        }
        if(count <= Constant.numPlayer ) {
            Constant.QFanswerlist.add(fanswer.getText().toString());
            EditText playertext = findViewById(R.id.fake_answer);
            playertext.setText("");
        }
        count += 1;
        TextView PN = findViewById(R.id.enter_fake_answer);
        PN.setText("Enter Fake answer for player" + count);
    }
}
