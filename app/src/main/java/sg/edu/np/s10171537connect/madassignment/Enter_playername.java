package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class Enter_playername extends AppCompatActivity{
    EditText PlayerName;
    int count = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_playername);
        TextView PN = findViewById(R.id.TVplayername);
        PN.setText("Enter player" + count + "'s name");

    }
    public void on_enter_playername_next_click(View v){
        if(count == Constant.numPlayer ) {
            Player p = Constant.PlayerList.get(0);
            EditText playertext = findViewById(R.id.TXplayername);
            p.setPlayerName(playertext.getText().toString());
            Intent in = new Intent(this, question_ready.class);
            startActivity(in);
        }
        count += 1;
        TextView PN = findViewById(R.id.TVplayername);
        PN.setText("Enter player" + count + "'s name");
    }
}
