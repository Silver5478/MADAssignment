package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class question_list_catergories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DBHelper dbHandler = new DBHelper(this, null, 1);
        RecyclerView recyclerView;
        CatTaskAdapter adapter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_question_catergories_question);

        recyclerView = findViewById(R.id.playerscore);
        adapter = new CatTaskAdapter(this, dbHandler.getListOfCategories());
        LinearLayoutManager mLayout =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }


    public void on_question_category_next_click(View v){
        Intent in = new Intent(this, question_select_onlinestatusActivity.class);
        startActivity(in);
    }
}
