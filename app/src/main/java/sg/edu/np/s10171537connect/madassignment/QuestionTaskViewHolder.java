package sg.edu.np.s10171537connect.madassignment;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class QuestionTaskViewHolder extends RecyclerView.ViewHolder{
    private TextView question;
    private TextView id;
    private TextView type;
    private View view;
    public QuestionTaskViewHolder(View v)
    {
        super(v);
        view = v;
        id = v.findViewById(R.id.TVquestion_id);
        question = v.findViewById(R.id.TVquestion);
        type = v.findViewById(R.id.TVquestion_type);
    }
    public void setText_id(String s)
    {
        id.setText(s);
    }
    public void setText_question(String s){ question.setText(s); }
    public void setText_type(String s){ type.setText(s); }
    }

