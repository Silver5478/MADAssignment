package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class start_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        Question TestQ = new Question();
        TestQ.setQuestion("Which year did singapore obtain independence");
        TestQ.setQType("History");
        TestQ.setQCanswer("1965");

        Constant.AddData();
//        Constant.PlayerList.get(0);

        //Test
        //Constant.PlayerList.add(Constant.Player1);

        DBHelper dbHandler = new DBHelper(this, null, 1);

        if (dbHandler.dbEmpty()) {
            dbHandler.addQuestion(TestQ);
            dbHandler.addQuestion(new Question("question", "type", "answer"));
            dbHandler.addQuestion(new Question("question", "type", "answer"));
            dbHandler.addQuestion(new Question("question", "type", "answer"));
            dbHandler.addQuestion(new Question("question", "type", "answer"));
            dbHandler.addQuestion(new Question("question", "type", "answer"));
            dbHandler.addQuestion(new Question("question", "type", "answer"));

        }
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(dbHandler.getRandomQuestionByType("History").getQuestion());
    }
    public void on_start_game_click(View v){
        Intent in = new Intent(this, start_gameActivity.class);
        startActivity(in);
    }
}
