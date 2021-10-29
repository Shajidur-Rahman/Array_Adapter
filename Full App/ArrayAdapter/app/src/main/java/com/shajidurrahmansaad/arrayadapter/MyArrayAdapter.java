package com.shajidurrahmansaad.arrayadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter extends android.widget.ArrayAdapter<ArrayMain> {
    public static final String TAG_NAME = ArrayAdapter.class.getSimpleName();

    public MyArrayAdapter(Activity context, ArrayList<ArrayMain> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.arraylayout, parent, false);
        }
        ArrayMain arrayMain = getItem(position);

        TextView TextView1 = listItemView.findViewById(R.id.textView);
        TextView1.setText(arrayMain.getFirstItem());

        TextView TextView2 = listItemView.findViewById(R.id.textView2);
        TextView2.setText(arrayMain.getSecondItem());

        TextView TextView3 = listItemView.findViewById(R.id.textView3);
        TextView3.setText(arrayMain.getSecondItem());


        return listItemView;
    }

}

