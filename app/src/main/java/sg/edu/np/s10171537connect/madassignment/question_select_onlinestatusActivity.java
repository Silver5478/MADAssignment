package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class question_select_onlinestatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_select_onlinestatus);
    }
    public void on_hotseat_click(View v){
        Constant.Online = false;
    }
    public void on_online_click(View v){
        Constant.Online = true;
    }
    public void on_online_status_next_click(View v){
        Intent in = new Intent(this,select_number_of_playerActivity.class);
        startActivity(in);
    }
}
