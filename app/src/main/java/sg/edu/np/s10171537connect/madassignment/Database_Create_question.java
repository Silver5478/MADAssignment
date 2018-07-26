package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Database_Create_question extends AppCompatActivity {
    EditText q;
    EditText ca;
    EditText t;
    DBHelper dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database__create_question);
        q = findViewById(R.id.Enter_qustion);
        ca = findViewById(R.id.Enter_answer);
        t = findViewById(R.id.Enter_type);
        dbHandler = new DBHelper(this, null, 1);
    }
    public void on_Fake_answer_next_click(View v){
        if(q.getText() != null && t.getText() != null && ca.getText() != null) {
            dbHandler.addQuestion(new Question(q.getText().toString(), t.getText().toString(), ca.getText().toString()));
            Intent in = new Intent(this, select_answer.class);
            startActivity(in);
        }

    }
    public void on_cancel_click(View v){
        Intent in = new Intent(this, Database_main.class);
        startActivity(in);
    }
}
