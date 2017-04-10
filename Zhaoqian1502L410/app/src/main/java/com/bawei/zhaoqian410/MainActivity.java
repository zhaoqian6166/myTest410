package com.bawei.zhaoqian410;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int progress=0;
    private RoundProgressBar mRoundProgressBar2;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){

                if (progress<97){
                    progress+=3;
                    mRoundProgressBar2.setProgress(progress);
                    handler.sendEmptyMessageDelayed(0,100);
                }

            }

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoundProgressBar2 = (RoundProgressBar) findViewById(R.id.roundProgressBar2);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击后开始走进度
                handler.sendEmptyMessageDelayed(0,100);

            }
        });

    }
}
