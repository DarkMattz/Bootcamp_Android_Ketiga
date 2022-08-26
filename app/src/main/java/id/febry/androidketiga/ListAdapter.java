package id.febry.androidketiga;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private ArrayList<String> data;

    public ListAdapter(ArrayList<String> data){
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvData;
        private final ImageView imgData;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvData = itemView.findViewById(R.id.tv_data);
            imgData = itemView.findViewById(R.id.img_data);
        }

        public TextView getTvData() {
            return tvData;
        }

        public ImageView getImgData() {
            return imgData;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTvData().setText(data.get(position));
        if(position % 2 == 0){
            holder.getImgData().setVisibility(View.VISIBLE);
        } else {
            holder.getImgData().setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
