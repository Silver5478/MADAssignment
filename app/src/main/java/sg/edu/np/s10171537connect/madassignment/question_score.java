package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class question_score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        ScoreTaskAdapter adapter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_score);
        
        recyclerView = findViewById(R.id.playerscore);
        adapter = new ScoreTaskAdapter(this, Constant.PlayerList);
        LinearLayoutManager mLayout =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    public void on_show_score_next_click(View v){
        if(Constant.numQuestion == 0) {
            Intent in = new Intent(this, question_final_score.class);
            startActivity(in);
        }
        else{
            Constant.numQuestion -= 1;
            Intent in = new Intent(this, enter_fake_answer.class);
            startActivity(in);
        }
    }
}
