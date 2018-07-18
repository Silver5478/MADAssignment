package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class select_number_of_playerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_number_of_players);
    }
    public void on_num_player_next_click(View v){
        Intent in = new Intent(this,select_number_of_questionActivity.class);
        startActivity(in);
    }
}
