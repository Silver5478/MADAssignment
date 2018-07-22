package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class question_ready extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_catergory_ready);

    }
    public void on_ready_next_click(View v){
        if(Constant.gamemode == "Normal"){
            Intent in = new Intent(this,enter_fake_answer.class);
            startActivity(in);}
        if(Constant.gamemode == "Custom"){
            Intent in = new Intent(this,Enter_question_custom.class);
            startActivity(in);}
    }

}
