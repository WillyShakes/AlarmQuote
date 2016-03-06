package com.willycode.alarmquote.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Manuel ELO'O on 14/01/2016.
 */
public class Quote {
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("category")
    @Expose
    private String category;

    /**
     *
     * @return
     * The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The quote
     */
    public String getQuote() {
        return quote;
    }

    /**
     *
     * @param quote
     * The quote
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }

    /**
     *
     * @return
     * The category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    private Quote() {
    }

    public Quote(String q){
        setQuote(q);
    }

    public static class Category {
        public static final int GENERIC = 0;
        public static final int LOVE = 1;
        public static final int MOTIVATIONAL = 2;
        public static final int LEADERSHIP = 3;
        public static final int SUCCESS = 4;

        public static String getCategory(int cat){
            //TODO finish this
            String category = "";
            switch (cat){
                case GENERIC:
                    break;
                default:
                    category = "GENERIC";
                    break;
            }
            return category;
        }
    }

}
