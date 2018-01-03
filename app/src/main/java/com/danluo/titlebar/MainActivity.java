package com.danluo.titlebar;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    LinearLayout mTitleBar;
    ArrayList<String> mDatas;
    TextAdapter mTextAdapter;
    int mo = 0;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        mRecyclerView = (RecyclerView) findViewById(R.id.list_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mTitleBar = (LinearLayout) findViewById(R.id.title_bar);
        mTextAdapter = new TextAdapter(this,mDatas);
        mRecyclerView.setAdapter(mTextAdapter);
        mTitleBar.post(new Runnable() {
            @Override
            public void run() {
                mTitleBar.getBackground().setAlpha(0);
            }
        });
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
//            mRecyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
//                @Override
//                public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                    int height = mTitleBar.getHeight();
//                    int c= scrollY - oldScrollY;
//                    if (c > height){
//                        mTitleBar.getBackground().setAlpha(255);
//                    }
//                }
//            });
//        }
        mRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                Log.i(TAG, "onScrollStateChanged: newState:"+newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                 mo = mo +dy;
                Log.i(TAG, "onScrolled: dx:"+dx+"-------dy:"+dy);
                int height = mTitleBar.getHeight();
                    if (dy >0) {
                        float h = mo / height;
                        mTitleBar.getBackground().setAlpha((int) (225 * h));
                    }

                if (mo > height){
                   float a =  mo / height;
                    Log.i(TAG, "onScrolled: a"+a);
                    Log.i(TAG, "onScrolled: 255*a"+a);

                }
            }
        });


    }

    protected void initData()
    {
        mDatas = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++)
        {
            mDatas.add("" + (char) i);
        }
    }



}
