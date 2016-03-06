package com.willycode.alarmquote.ui.quote;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.Query;
import com.willycode.alarmquote.R;
import com.willycode.alarmquote.data.model.Quote;
import com.willycode.alarmquote.ui.FirebaseListAdapter;

/**
 * @author greg
 * @since 6/21/13
 *
 * This class is an example of how to use FirebaseListAdapter. It uses the <code>Chat</code> class to encapsulate the
 * data for each individual chat message
 */
public class QuoteListAdapter extends FirebaseListAdapter<Quote> {

    // The mUsername for this client. We use this to indicate which messages originated from this user
    private String mUsername;

    public QuoteListAdapter(Query ref, Activity activity, int layout, String mUsername) {
        super(ref, Quote.class, layout, activity);
        this.mUsername = mUsername;
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>FirebaseListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     *
     * @param view A view instance corresponding to the layout we passed to the constructor.
     * @param quote An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(View view, Quote quote) {
        // Map a quote object to an entry in our listview
        String thisquote = quote.getQuote();
        TextView quoteText = (TextView) view.findViewById(R.id.quote);
        quoteText.setText(thisquote);
        String thisauthor = quote.getAuthor();
        TextView authorText = (TextView) view.findViewById(R.id.author);
        authorText.setText(thisauthor);
        // If the message was sent by this user, color it differently
/*        if (author != null && author.equals(mUsername)) {
            authorText.setTextColor(Color.RED);
        } else {
            authorText.setTextColor(Color.BLUE);
        }
        ((TextView) view.findViewById(R.id.message)).setText(chat.getMessage()); */
    }
}
