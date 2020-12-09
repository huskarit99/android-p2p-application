package com.example.p2papplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.p2papplication.models.MessageChatBox;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listViewMessage;
    ArrayList<MessageChatBox> listMessage = new ArrayList<>();
    CustomAdapter customAdapter;

    LinearLayout llGrid, llShadow, llBorder;
    ArrayList<TextView> chessBoard;
    TextView A0, A1, A2, A3, A4, A5, A6, A7;
    TextView B0, B1, B2, B3, B4, B5, B6, B7;
    TextView C0, C1, C2, C3, C4, C5, C6, C7;
    TextView D0, D1, D2, D3, D4, D5, D6, D7;
    TextView E0, E1, E2, E3, E4, E5, E6, E7;
    TextView F0, F1, F2, F3, F4, F5, F6, F7;
    TextView G0, G1, G2, G3, G4, G5, G6, G7;
    TextView H0, H1, H2, H3, H4, H5, H6, H7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        mapping();
        autoFitScreen();
        customAdapter = new MainActivity.CustomAdapter();
        listViewMessage.setAdapter(customAdapter);
        init();
    }

    private void autoFitScreen() {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        float dpHeight = displayMetrics.heightPixels / displayMetrics.density;
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int count = 0;
        double scale = 0.1;
        while (470 >= dpWidth + count*scale*8) {
            count++;
        }
        System.out.println(count);
        configChessBoard(count, scale);
    }

    private void configChessBoard(int count, double scale) {
        ViewGroup.LayoutParams params;
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();

        params = llShadow.getLayoutParams();
        params.height -= (8 * count * scale * displayMetrics.density);
        params.width -= (8 * count * scale * displayMetrics.density);
        llShadow.setLayoutParams(params);

        params = llBorder.getLayoutParams();
        params.height -= (8 * count * scale * displayMetrics.density);
        params.width -= (8 * count * scale * displayMetrics.density);
        llBorder.setLayoutParams(params);

        params = llGrid.getLayoutParams();
        params.height -= (8 * count * scale * displayMetrics.density);
        params.width -= (8 * count * scale * displayMetrics.density);
        llGrid.setLayoutParams(params);

        for (int i = 0; i < 64; i++) {
            ViewGroup.LayoutParams paramsTextView = chessBoard.get(i).getLayoutParams();
            paramsTextView.width -= (count * scale * displayMetrics.density);
            paramsTextView.height -= (count * scale * displayMetrics.density);
            chessBoard.get(i).setLayoutParams(paramsTextView);
        }
    }

    private void mapping() {
        listViewMessage = findViewById(R.id.listViewMessage);
        llGrid = findViewById(R.id.llGrid);
        llShadow = findViewById(R.id.llShadow);
        llBorder = findViewById(R.id.llBorder);
        chessBoard = new ArrayList<TextView>();
        A0 = findViewById(R.id.A0);
        chessBoard.add(A0);
        A1 = findViewById(R.id.A1);
        chessBoard.add(A1);
        A2 = findViewById(R.id.A2);
        chessBoard.add(A2);
        A3 = findViewById(R.id.A3);
        chessBoard.add(A3);
        A4 = findViewById(R.id.A4);
        chessBoard.add(A4);
        A5 = findViewById(R.id.A5);
        chessBoard.add(A5);
        A6 = findViewById(R.id.A6);
        chessBoard.add(A6);
        A7 = findViewById(R.id.A7);
        chessBoard.add(A7);

        B0 = findViewById(R.id.B0);
        chessBoard.add(B0);
        B1 = findViewById(R.id.B1);
        chessBoard.add(B1);
        B2 = findViewById(R.id.B2);
        chessBoard.add(B2);
        B3 = findViewById(R.id.B3);
        chessBoard.add(B3);
        B4 = findViewById(R.id.B4);
        chessBoard.add(B4);
        B5 = findViewById(R.id.B5);
        chessBoard.add(B5);
        B6 = findViewById(R.id.B6);
        chessBoard.add(B6);
        B7 = findViewById(R.id.B7);
        chessBoard.add(B7);

        C0 = findViewById(R.id.C0);
        chessBoard.add(C0);
        C1 = findViewById(R.id.C1);
        chessBoard.add(C1);
        C2 = findViewById(R.id.C2);
        chessBoard.add(C2);
        C3 = findViewById(R.id.C3);
        chessBoard.add(C3);
        C4 = findViewById(R.id.C4);
        chessBoard.add(C4);
        C5 = findViewById(R.id.C5);
        chessBoard.add(C5);
        C6 = findViewById(R.id.C6);
        chessBoard.add(C6);
        C7 = findViewById(R.id.C7);
        chessBoard.add(C7);

        D0 = findViewById(R.id.D0);
        chessBoard.add(D0);
        D1 = findViewById(R.id.D1);
        chessBoard.add(D1);
        D2 = findViewById(R.id.D2);
        chessBoard.add(D2);
        D3 = findViewById(R.id.D3);
        chessBoard.add(D3);
        D4 = findViewById(R.id.D4);
        chessBoard.add(D4);
        D5 = findViewById(R.id.D5);
        chessBoard.add(D5);
        D6 = findViewById(R.id.D6);
        chessBoard.add(D6);
        D7 = findViewById(R.id.D7);
        chessBoard.add(D7);

        E0 = findViewById(R.id.E0);
        chessBoard.add(E0);
        E1 = findViewById(R.id.E1);
        chessBoard.add(E1);
        E2 = findViewById(R.id.E2);
        chessBoard.add(E2);
        E3 = findViewById(R.id.E3);
        chessBoard.add(E3);
        E4 = findViewById(R.id.E4);
        chessBoard.add(E4);
        E5 = findViewById(R.id.E5);
        chessBoard.add(E5);
        E6 = findViewById(R.id.E6);
        chessBoard.add(E6);
        E7 = findViewById(R.id.E7);
        chessBoard.add(E7);

        F0 = findViewById(R.id.F0);
        chessBoard.add(F0);
        F1 = findViewById(R.id.F1);
        chessBoard.add(F1);
        F2 = findViewById(R.id.F2);
        chessBoard.add(F2);
        F3 = findViewById(R.id.F3);
        chessBoard.add(F3);
        F4 = findViewById(R.id.F4);
        chessBoard.add(F4);
        F5 = findViewById(R.id.F5);
        chessBoard.add(F5);
        F6 = findViewById(R.id.F6);
        chessBoard.add(F6);
        F7 = findViewById(R.id.F7);
        chessBoard.add(F7);

        G0 = findViewById(R.id.G0);
        chessBoard.add(G0);
        G1 = findViewById(R.id.G1);
        chessBoard.add(G1);
        G2 = findViewById(R.id.G2);
        chessBoard.add(G2);
        G3 = findViewById(R.id.G3);
        chessBoard.add(G3);
        G4 = findViewById(R.id.G4);
        chessBoard.add(G4);
        G5 = findViewById(R.id.G5);
        chessBoard.add(G5);
        G6 = findViewById(R.id.G6);
        chessBoard.add(G6);
        G7 = findViewById(R.id.G7);
        chessBoard.add(G7);

        H0 = findViewById(R.id.H0);
        chessBoard.add(H0);
        H1 = findViewById(R.id.H1);
        chessBoard.add(H1);
        H2 = findViewById(R.id.H2);
        chessBoard.add(H2);
        H3 = findViewById(R.id.H3);
        chessBoard.add(H3);
        H4 = findViewById(R.id.H4);
        chessBoard.add(H4);
        H5 = findViewById(R.id.H5);
        chessBoard.add(H5);
        H6 = findViewById(R.id.H6);
        chessBoard.add(H6);
        H7 = findViewById(R.id.H7);
        chessBoard.add(H7);
    }

    private void init() {
        listMessage.add(new MessageChatBox(true, "Hello !!!"));
        listMessage.add(new MessageChatBox(false, "Hello !!!"));
        listMessage.add(new MessageChatBox(true, "Tôi tên là Nguyễn Thái Học"));
        listMessage.add(new MessageChatBox(false, "Tôi tên là Nguyễn Minh Thức"));
        listMessage.add(new MessageChatBox(false, "Cùng chơi chứ"));
        listMessage.add(new MessageChatBox(true, "Ok ông"));
        listMessage.add(new MessageChatBox(true, "Tôi trước nhé"));
        listMessage.add(new MessageChatBox(false, "Tùy ông, sao cũng được mà"));
    }


    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return listMessage.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.message, null);
            RelativeLayout rlInputMessage = view.findViewById(R.id.rlInputMessage);
            TextView tvInputMessage = view.findViewById(R.id.tvInputMessage);
            tvInputMessage.setText(listMessage.get(position).getMessage());
            if (!listMessage.get(position).getYours()) {
                rlInputMessage.setGravity(Gravity.LEFT);
                tvInputMessage.setTextColor(getColor(R.color.colorBoardDark));
                tvInputMessage.setBackground(getDrawable(R.drawable.background_receiver));
            }
            return view;
        }
    }
}