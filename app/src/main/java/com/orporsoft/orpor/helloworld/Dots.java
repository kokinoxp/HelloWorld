package com.orporsoft.orpor.helloworld;

import java.util.ArrayList;

/**
 * Created by AHTD 04 on 6/5/2559.
 */
public class Dots {
    private ArrayList<Dot> dots=new ArrayList<Dot>();

    public interface  OnDotsChangeListener{
        void onDotsChange(Dots dots);
    }

    private OnDotsChangeListener onDotsChangeListener;

    public void setOnDotsChangeListener(OnDotsChangeListener onDotsChangeListener) {
        this.onDotsChangeListener = onDotsChangeListener;
    }
    public void insert(Dot dot){
        dots.add(dot);
        notifiyDotsChange();
    }
    public void clear(){
        dots.clear();
        notifiyDotsChange();
    }
    private void notifiyDotsChange() {
        if(this.onDotsChangeListener!=null){
            this.onDotsChangeListener.onDotsChange(this);
        }
    }
}
