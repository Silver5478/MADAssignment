package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class question_final_score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_final_score);
    }
    public void on_show_final_score_next_click(View v){
        Intent in = new Intent(this,start_screen.class);
        startActivity(in);
    }
}
