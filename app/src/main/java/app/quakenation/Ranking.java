package app.quakenation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Ranking extends android.app.Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ranking, container, false);
        return rootView;
       /* @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_ranking, container, false);


            TextView link;
            link = (TextView) rootView.findViewById(R.id.demo);
            link.setMovementMethod(LinkMovementMethod.getInstance());
            link.setText(Html.fromHtml("<a href=http://www.google.com>\nlink</a>" ));



            return rootView;*/
        }

}
