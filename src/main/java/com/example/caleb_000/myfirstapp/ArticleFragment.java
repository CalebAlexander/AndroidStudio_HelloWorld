package com.example.caleb_000.myfirstapp;

/**
 * Created by caleb_000 on 3/17/2017.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ArticleFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article, container, false);
    }
}
