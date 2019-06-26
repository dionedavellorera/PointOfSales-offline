package nerdvana.com.pointofsales;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Helper {
    public static void hideKeyboard(Context context, View view) {
        InputMethodManager imm = (InputMethodManager)context.getSystemService(
                Activity.INPUT_METHOD_SERVICE);

        if (imm != null) imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static String generatedTransactionId() {
      return "";
    };
}
