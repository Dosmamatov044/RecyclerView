package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain extends androidx.recyclerview.widget.RecyclerView.Adapter<ViewHolder1> {

  ArrayList <String> list;



    @NonNull
    @Override
    public ViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);

       // ViewHolder1 viewHolder1=new ViewHolder1(view);

        return new ViewHolder1(view);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder1 holder, int position) {
      holder.onBind(list.get(position));



    }
}

class ViewHolder1 extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    TextView textView;

    public ViewHolder1(@NonNull View itemView) {
        super(itemView);
     textView=itemView.findViewById(R.id.textView);

    }


    public void onBind(String s) {
    textView.setText(s);



    }
}