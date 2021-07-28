package com.example.hormonyOS.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;

public class SecondAbilitySlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        DependentLayout mLayout = new DependentLayout(this);
        mLayout.setWidth(DependentLayout.LayoutConfig.MATCH_PARENT);
        mLayout.setHeight(DependentLayout.LayoutConfig.MATCH_PARENT);

        ShapeElement background = new ShapeElement();
        background.setRgbColor(new RgbColor(255,255,255));
        mLayout.setBackground(background);

        Text text =new Text(this);
        text.setText("Hi there");
        text.setWidth(DependentLayout.LayoutConfig.MATCH_PARENT);
        text.setTextSize(100);
        text.setTextColor(Color.BLACK);

        // 设置文本的布局
        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(DependentLayout.LayoutConfig.MATCH_CONTENT, DependentLayout.LayoutConfig.MATCH_CONTENT);
        textConfig.addRule(DependentLayout.LayoutConfig.CENTER_IN_PARENT);
        text.setLayoutConfig(textConfig);
        mLayout.addComponent(text);
        super.setUIContent(mLayout);

    }
}
