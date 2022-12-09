package com.example.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Second extends Fragment{
    public static Second single;
    public static Second instance(){
        if(single==null)
            single=new Second();
        return single;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstance){
        View view=inflater.inflate(R.layout.activity_main4,container,false);
        return view;
    }
}
