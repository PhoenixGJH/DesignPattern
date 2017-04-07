package com.phoenixgjh.designpattern.builder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenixgjh.designpattern.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 构造器模式
 * Created by Phoenix on 2017/4/7.
 */

public class BuilderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        List<String> hands = new ArrayList<>();
        hands.add("left");
        hands.add("right");

        List<String> legs = new ArrayList<>();
        legs.add("leftLeg");
        legs.add("rightLeg");
        Toy toy = new Toy.Builder()
                .setHead("head")
                .setBody("Body")
                .setHands(hands)
                .setLegs(legs)
                .build();
    }
}
