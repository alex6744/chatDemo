package com.example.firebasedemo.chatComponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firebasedemo.R;
import com.example.firebasedemo.StickMessage;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChatActivity extends AppCompatActivity {
    private Button send;
    private EditText message;
    private TextView textView;
    private RecyclerView message_view;
    private String userName,roomName;
    private DatabaseReference root ;
    private String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        userName=getIntent().getExtras().getString("user_name").toString();
        roomName=getIntent().getExtras().getString("room_name").toString();
        System.out.println(userName);
        System.out.println(roomName);
        setTitle("Room-"+roomName);
        root=FirebaseDatabase.getInstance().getReference().child("chatRoom/"+roomName);
        send=findViewById(R.id.btn_send);
        message=findViewById(R.id.send_bar);
        textView=findViewById(R.id.textView);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String ,Object> map=new HashMap<>();
                StickMessage m=new StickMessage();
                temp=root.push().getKey();
           //     root.updateChildren(map);
                DatabaseReference m1=root.child(temp);
                System.out.println(m1.toString());

                m1.setValue(new StickMessage(Calendar.getInstance().getTime().toString(),message.getText().toString(),true));
//                DatabaseReference messageRoot=root.child(temp);
//                Map<String ,Object> map2=new HashMap<>();
//                map2.put("name",userName);
//                map2.put("msg",new StickMessage(message.getText().toString(), Calendar.getInstance().getTime().toString()));
//                messageRoot.updateChildren(map2);

            }
        });
        root.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                append_chat_conversation(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                append_chat_conversation(dataSnapshot);

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    private String chat_msg,chat_user_name;

    private void append_chat_conversation(DataSnapshot dataSnapshot) {

        Iterator i = dataSnapshot.getChildren().iterator();

        while (i.hasNext()){
            boolean a=(boolean)( (DataSnapshot)i.next()).getValue();
            chat_msg = (String) ((DataSnapshot)i.next()).getValue();
            chat_user_name = (String) ((DataSnapshot)i.next()).getValue();
System.out.println(chat_msg);
            textView.append(chat_msg +" \n");
            //textView.append(chat_user_name +" : "+chat_msg +" \n");
        }


    }
}