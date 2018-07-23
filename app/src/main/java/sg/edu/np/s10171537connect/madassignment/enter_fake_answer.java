package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class enter_fake_answer extends AppCompatActivity {
    EditText fanswer;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_enter_fake_answer);
        fanswer = findViewById(R.id.fake_answer);
        count = 1;
    }
    public void on_Fake_answer_next_click(View v){
        if(count == Constant.numPlayer ) {
            Constant.QFanswerlist.add(fanswer.getText().toString());
            Intent in = new Intent(this, show_answer.class);
            startActivity(in);
        }
        count += 1;
    }
}
