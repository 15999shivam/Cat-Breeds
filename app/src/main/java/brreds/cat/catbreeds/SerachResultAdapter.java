package brreds.cat.catbreeds;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SerachResultAdapter extends RecyclerView.Adapter<SerachResultAdapter.SearchResultViewHolder> {

    private Cat[] data;

    public SerachResultAdapter(Cat[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public SearchResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  = inflater.inflate( R.layout.search_result_item,parent,false);

        return new SearchResultViewHolder( view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchResultViewHolder holder, final int position) {
        String title = data[position].getName();
        holder.txttitle.setText(title);
//        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(this,CatDetails.class);
//                intent.putExtra("data",data[position].toString());
//
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class SearchResultViewHolder extends RecyclerView.ViewHolder{
        ImageView imgicon;
        TextView txttitle;
        LinearLayout parent_layout;
        public  SearchResultViewHolder(View itemview){
            super(itemview);
            imgicon = itemview.findViewById(R.id.imgIcon);
            txttitle= itemview.findViewById((R.id.title ));
            parent_layout = itemview.findViewById(R.id.parent_layout);
        }
    }
}
