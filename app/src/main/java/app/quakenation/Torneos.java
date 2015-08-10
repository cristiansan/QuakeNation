package app.quakenation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/*@Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_torneos, container, false);
      return rootView;
  }
}*/
    public class Torneos extends android.app.Fragment {
    private boolean loadWithOverviewMode;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                setLoadWithOverviewMode(true);

            View mainView = (View) inflater.inflate(R.layout.fragment_tournament_challonge, container, false);
            WebView webView = (WebView) mainView.findViewById(R.id.webView);
            webView.loadUrl("http://challonge.com/prrrrobando/module");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setSupportZoom(true);
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setAllowContentAccess(true);
            webView.getSettings().getAllowContentAccess();


        return mainView;
        }


    public void setLoadWithOverviewMode(boolean loadWithOverviewMode) {
        this.loadWithOverviewMode = loadWithOverviewMode;
    }
}