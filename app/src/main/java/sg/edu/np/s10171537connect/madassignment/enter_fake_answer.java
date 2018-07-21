package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class enter_fake_answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_enter_fake_answer);
    }
    public void on_Fake_answer_next_click(View v){
        Intent in = new Intent(this,show_answer.class);
        startActivity(in);
    }
}
