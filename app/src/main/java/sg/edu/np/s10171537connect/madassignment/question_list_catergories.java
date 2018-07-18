package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class question_list_catergories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_question_catergories_question);
    }

    public void on_question_category_next_click(View v){
        Intent in = new Intent(this, question_select_onlinestatusActivity.class);
        startActivity(in);
    }
}
