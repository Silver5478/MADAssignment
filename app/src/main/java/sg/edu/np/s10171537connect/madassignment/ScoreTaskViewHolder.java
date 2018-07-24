package sg.edu.np.s10171537connect.madassignment;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class ScoreTaskViewHolder extends RecyclerView.ViewHolder{
    private TextView score;
    private TextView name;
    private View view;
    public ScoreTaskViewHolder(View v)
    {
        super(v);
        view = v;
        name = v.findViewById(R.id.TVplayer_name);
        score = v.findViewById(R.id.TVplayer_score);
    }
    public void setText_name(String s)
    {
        name.setText(s);
    }
    public void setText_score(String s){ score.setText(s); }
    }

