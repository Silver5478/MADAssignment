package sg.edu.np.s10171537connect.madassignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class QuestionTaskAdapter extends RecyclerView.Adapter<QuestionTaskViewHolder> {
    private List<Question> list;
    private Context context;


    public QuestionTaskAdapter(Context c, List<Question>l) {
        context = c;
        list = l;
    }


    @Override
    public QuestionTaskViewHolder onCreateViewHolder
            (
                    ViewGroup parent,
                    int viewType)


    {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.question_task_view_holder,
                        parent,
                        false);
        return new QuestionTaskViewHolder(item);
    }
    @Override
    public void onBindViewHolder(QuestionTaskViewHolder holder,
                                 final int position)
    {
        Question p = list.get(position);
        String n = String.valueOf(p.getId());
        String s = p.getQuestion();
        String t = p.getQType();
        holder.setText_id(n);
        holder.setText_question(s);
        holder.setText_type(t);
    }
    public int getItemCount()
    {
        return list.size();
    }
}