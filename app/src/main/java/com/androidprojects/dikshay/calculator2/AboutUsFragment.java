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
 * Created by Dikshay on 3/8/2015.
 */
public class AboutUsFragment extends Fragment {
    TextView emailLink;
    String emailid = "dikshay1992@gmail.com";
    @Override
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = layoutInflater.inflate(R.layout.aboutusfragment,container,false);
        emailLink = (TextView)rootView.findViewById(R.id.textView2);
        emailLink.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        emailLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL,emailid);
                startActivity(Intent.createChooser(i,"Send Email"));*/
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", emailid, null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Calculatrice");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
        return rootView;
    }
}
