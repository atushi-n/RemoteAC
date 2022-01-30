package com.example.remoteac;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final int carrierFrequency = 38000;

    ConsumerIrManager irM;

    Button offButton;
    Button on26x1Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        irM = (ConsumerIrManager) getSystemService(CONSUMER_IR_SERVICE);
        ((TextView) findViewById(R.id.textView)).setText(irM.hasIrEmitter() ? "この端末で使用できます" : "この端末では使用できません");

        offButton = findViewById(R.id.offButton);
        offButton.setOnClickListener(this);
        on26x1Button = findViewById(R.id.on26x1Button);
        on26x1Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int[] sendPattern = null;

        if (view.getId() == offButton.getId()) {
            sendPattern = Pattern.PowerOFF.getP();
        }

        if (view.getId() == on26x1Button.getId()) {
            sendPattern = Pattern.On26Power1.getP();
        }


        irM.transmit(carrierFrequency, sendPattern);//赤外線を送信
    }
}