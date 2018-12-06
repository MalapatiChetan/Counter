package com.example.malapatichetan.counting;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {
    TextView text;
     String data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b,container,false);

        if (savedInstanceState==null){


        }
        else {
            data= (String) savedInstanceState.get("text");
            TextView myText =(TextView)view.findViewById(R.id.textView);
            myText.setText(data);
        }

        return view;


    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        text = (TextView)getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("text",data);
    }

    public void changeText(String data){
      this.data=data;
        text.setText(data);
    }
}
