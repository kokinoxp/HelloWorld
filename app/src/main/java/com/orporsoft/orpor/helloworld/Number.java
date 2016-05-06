package com.orporsoft.orpor.helloworld;

/**
 * Created by AHTD 04 on 6/5/2559.
 */
public class Number {
    private int value;
    public interface OnNumberChangeListener{
        void onNumberChange(Number number);
    }
    private OnNumberChangeListener onNumberChangeListener;

    public void setOnNumberChangeListener(OnNumberChangeListener onNumberChangeListener) {
        this.onNumberChangeListener = onNumberChangeListener;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        if(this.onNumberChangeListener!=null){
            this.onNumberChangeListener.onNumberChange(this);
        }
    }
}
