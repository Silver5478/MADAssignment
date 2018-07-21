package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Enter_question_custom extends AppCompatActivity {
    EditText canswer;
    EditText cquestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_question_custom);
        canswer = (EditText)findViewById(R.id.custom_answer);
        cquestion = (EditText)findViewById(R.id.custom_question);
    }
    public void on_question_custom_next_click(View v){
        Constant.question.setQCanswer(canswer.getText().toString());
        Constant.question.setQuestion(cquestion.getText().toString());
        Constant.question.setQType("Custom");
        Intent in = new Intent(this,enter_fake_answer.class);
        startActivity(in);
    }
}
