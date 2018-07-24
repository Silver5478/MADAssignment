package sg.edu.np.s10171537connect.madassignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CatTaskAdapter extends RecyclerView.Adapter<CatTaskViewHolder> {
    private List<String> list;
    private Context context;

    public CatTaskAdapter(Context c, List<String>l) {
        context = c;
        list = l;
    }


    @Override
    public CatTaskViewHolder onCreateViewHolder
            (
                    ViewGroup parent,
                    int viewType)


    {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cat_task_view_holder,
                        parent,
                        false);
        return new CatTaskViewHolder(item);
    }
    @Override
    public void onBindViewHolder(CatTaskViewHolder holder,
                                 final int position)
    {
        String catergory = list.get(position);
        holder.setText_name(catergory);

    }
    public int getItemCount()
    {
        return list.size();
    }
}