package sg.edu.np.s10171537connect.madassignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ScoreTaskAdapter extends RecyclerView.Adapter<ScoreTaskViewHolder> {
    private List<Player> list;
    private Context context;


    public ScoreTaskAdapter(Context c, List<Player>l) {
        context = c;
        list = l;
    }


    @Override
    public ScoreTaskViewHolder onCreateViewHolder
            (
                    ViewGroup parent,
                    int viewType)


    {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_score_task_view_holder,
                        parent,
                        false);
        return new ScoreTaskViewHolder(item);
    }
    @Override
    public void onBindViewHolder(ScoreTaskViewHolder holder,
                                 final int position)
    {
        Player p = list.get(position);
        String n = p.getPlayerName();
        String s = p.getPlayerScore().toString();
        holder.setText_name(n);
        holder.setText_score(s);
    }
    public int getItemCount()
    {
        return list.size();
    }
}