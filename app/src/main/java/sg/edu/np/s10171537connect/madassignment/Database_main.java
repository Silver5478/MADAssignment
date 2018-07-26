package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Database_main extends AppCompatActivity {
    DBHelper dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_main);
        RecyclerView recyclerView;
        QuestionTaskAdapter adapter;
        dbHandler = new DBHelper(this, null, 1);
        recyclerView = findViewById(R.id.RvQuestions);
        adapter = new QuestionTaskAdapter(this, dbHandler.getListOfQuestions());
        LinearLayoutManager mLayout =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    public void on_cancel_click(View v){
        Intent in = new Intent(this, start_screen.class);
        startActivity(in);
    }
    public void on_create_click(View v){
        Intent in = new Intent(this, Database_Create_question.class);
        startActivity(in);
    }
    public void on_delete_click(View v){
        Intent in = new Intent(this, Database_delete.class);
        startActivity(in);
    }
}
