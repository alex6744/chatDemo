//package com.example.firebasedemo.chatComponent;
//
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//public class MovieHolder extends RecyclerView.ViewHolder {
//
//
//    public TextView movieName;
//    public TextView movieDesc;
//    public ImageView imageView;
//
//    public MovieHolder(View itemView, final ItemClickListener listener) {
//        super(itemView);
//
//        movieName = itemView.findViewById(R.id.movie_name);
//        movieDesc = itemView.findViewById(R.id.textView_desc);
//        imageView=itemView.findViewById(R.id.imageView2);
//
//        itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (listener != null) {
//                    int position = getLayoutPosition();
//                    if (position != RecyclerView.NO_POSITION) {
//
//                        listener.onItemClick(position);
//                    }
//                }
//
//
//
//            }
//        });
//
//
//    }
//
//}