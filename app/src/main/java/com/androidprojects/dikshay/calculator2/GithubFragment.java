package com.androidprojects.dikshay.calculator2;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dikshay on 3/7/2015.
 */
public class GithubFragment extends Fragment {
    TextView githubLink;
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container,Bundle savedInstanceState)
    {
        View rootView = layoutInflater.inflate(R.layout.githubfragment,container,false);
        githubLink = (TextView)rootView.findViewById(R.id.textView7);
        githubLink.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        githubLink.setOnClickListener(new View.OnClickListener()
        {
                 @Override
                  public void onClick(View v) {
                      String githubUrl = "https://github.com/dikshay/Calculatrice.git";
                      Intent i = new Intent(Intent.ACTION_VIEW);
                      i.setData(Uri.parse(githubUrl));
                      startActivity(i);
                                          }
        }
        );

        return rootView;

    }
}
