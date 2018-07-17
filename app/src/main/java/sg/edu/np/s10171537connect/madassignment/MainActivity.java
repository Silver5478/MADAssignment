package sg.edu.np.s10171537connect.madassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Question TestQ = null;
        TestQ.setQuestion("Which year did singapore obtain independence");
        TestQ.setQType("History");
        TestQ.setQCanswer("1965");

    }
}
