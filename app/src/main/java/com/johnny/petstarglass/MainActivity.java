package com.johnny.petstarglass;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollView;

/**
 * An {@link Activity} showing a tuggable "Hello World!" card.
 * <p/>
 * The main content view is composed of a one-card {@link CardScrollView} that provides tugging
 * feedback to the user when swipe gestures are detected.
 * If your Glassware intends to intercept swipe gestures, you should set the content view directly
 * and use a {@link com.google.android.glass.touchpad.GestureDetector}.
 *
 * @see <a href="https://developers.google.com/glass/develop/gdk/touch">GDK Developer Guide</a>
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view1 = new CardBuilder(this, CardBuilder.Layout.TEXT)
                .setText("This is the TEXT layout.")
                .setFootnote("footnote")
                .setTimestamp("just now")
                .getView();
        setContentView(view1);
    }
}
