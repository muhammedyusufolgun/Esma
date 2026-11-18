package tr.olgun.esma;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public final class Main extends Activity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        WebView reader = new WebView(this);
        reader.getSettings().setJavaScriptEnabled(true);
        setContentView(reader);
        reader.loadUrl("file:///android_asset/index.html");
    }
}
