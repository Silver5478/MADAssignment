package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

public class Database_delete extends AppCompatActivity {
    DBHelper dbHandler;
    EditText did;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_delete);
        RecyclerView recyclerView;
        QuestionTaskAdapter adapter;
        dbHandler = new DBHelper(this, null, 1);
        did = findViewById(R.id.Delete_id);

        recyclerView = findViewById(R.id.RvQuestions);
        adapter = new QuestionTaskAdapter(this, dbHandler.getListOfQuestions());
        LinearLayoutManager mLayout =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    public void on_Delete_click(View v){
        if(did.getText() != null){
            dbHandler.deleteQuestion(Integer.parseInt(did.getText().toString()));
            Intent in = new Intent(this, Database_main.class);
            startActivity(in);
        }
    }
    public void on_cancel_click(View v){
        Intent in = new Intent(this, Database_main.class);
        startActivity(in);
    }
}
