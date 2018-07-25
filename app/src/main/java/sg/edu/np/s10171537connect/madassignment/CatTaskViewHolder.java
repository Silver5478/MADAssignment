package sg.edu.np.s10171537connect.madassignment;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;



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
            }
        });

    }

    public void setText_name(String s) {
        cat.setText(s);
    }



}


