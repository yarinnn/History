import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 31/03/2018.
 */

public class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        view.loadUrl(url);
        return true;
    }
}
