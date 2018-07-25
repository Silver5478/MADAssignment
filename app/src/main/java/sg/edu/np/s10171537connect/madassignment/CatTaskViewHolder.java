package sg.edu.np.s10171537connect.madassignment;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import static android.support.v4.content.ContextCompat.startActivity;


public class CatTaskViewHolder extends RecyclerView.ViewHolder {
    private Button cat;

    private View view;

    public CatTaskViewHolder(View v) {
        super(v);
        view = v;
        cat = v.findViewById(R.id.cat);
        //.name = v.findViewById(R.id.TVplayer_name);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constant.catergory = cat.getText().toString();
                v.getContext().startActivity(new Intent(v.getContext(), question_select_onlinestatusActivity.class));

            }
        });

    }

    public void setText_name(String s) {
        cat.setText(s);
    }



}


