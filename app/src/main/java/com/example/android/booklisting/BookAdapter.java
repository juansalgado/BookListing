package com.example.android.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each book
 * in the url source (a list of {@link Book} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books   is the list of books, which is the url source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView with view ID section

        TextView titleView = (TextView) listItemView.findViewById(R.id.title_txt);
        titleView.setText(currentBook.getTitle());

        ArrayList<String> auxiliar = currentBook.getAuthor();
        String author = auxiliar.get(0);
        if (auxiliar.size() > 1) {
            for (int i = 1; i < auxiliar.size(); i++) {
                author += "\n" + auxiliar.get(i);
            }
        }
        TextView authorView = (TextView) listItemView.findViewById(R.id.author_txt);
        authorView.setText(author);

        TextView yearView = (TextView) listItemView.findViewById(R.id.year_txt);
        yearView.setText(currentBook.getYear());

        return listItemView;
    }
}
