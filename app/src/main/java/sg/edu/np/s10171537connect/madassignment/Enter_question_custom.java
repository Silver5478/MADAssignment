package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Enter_question_custom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_question_custom);
    }
    public void on_question_custom_next_click(View v){
        Intent in = new Intent(this,enter_fake_answer.class);
        startActivity(in);
    }
}
