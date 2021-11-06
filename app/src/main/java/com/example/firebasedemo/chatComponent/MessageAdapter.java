//package com.example.firebasedemo.chatComponent;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.squareup.picasso.Picasso;
//
//import java.util.ArrayList;
//
//public class MessageAdapter extends  RecyclerView.Adapter<com.example.numad21fa_hungchitngai.MovieHolder>{
//    private final ArrayList<Movie> itemList;
//    private ItemClickListener listener;
//    private Context context;
//
//    public MessageAdapter(Context context, ArrayList<Movie> itemList) {
//        this.context=context;
//        this.itemList = itemList;
//    }
//    public void setOnItemClickListener(ItemClickListener listener) {
//
//        this.listener = listener;
//    }
//    @Override
//    public com.example.numad21fa_hungchitngai.MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card, parent, false);
//        return new com.example.numad21fa_hungchitngai.MovieHolder(view, listener);
//    }
//
//    @Override
//    public void onBindViewHolder(com.example.numad21fa_hungchitngai.MovieHolder holder, int position) {
//        Movie currentItem = itemList.get(position);
//
//        holder.movieName.setText(currentItem.getMovieName());
//        holder.movieDesc.setText(currentItem.getMoveDesc());
//        //holder.itemDesc.setText(currentItem.getItemDesc());
//
////        holder.itemDesc.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Intent intent=new Intent(Intent.ACTION_VIEW);
////                String url=currentItem.getItemDesc();
////
////
////                intent.setData(Uri.parse(url));
////                context.startActivity(intent);
////            }
////        });
//
//        Picasso.get()
//                .load("https://image.tmdb.org/t/p/w500"+currentItem.getPoster())
//                .into(holder.imageView);
//    }
//
//    @Override
//    public int getItemCount() {
//
//        return itemList.size();
//    }
//
//}
