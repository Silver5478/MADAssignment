package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class start_gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_game_screen);

    }
    public void on_normal_click(View v){
        Constant.gamemode = "Normal";
        Intent in = new Intent(this, question_list_catergories.class);
        startActivity(in);
    }
}
