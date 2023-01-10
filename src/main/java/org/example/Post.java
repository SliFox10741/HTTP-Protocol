package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upvotes;

    public Post(@JsonProperty("id") String id, @JsonProperty("text") String text, @JsonProperty("type") String type, @JsonProperty("user") String user, @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return this.id;
    }

    public String gettext() {
        return this.text;
    }

    public String getUser() {
        return this.user;
    }

    public String getType() {
        return this.type;
    }

    public int getUpvotes() {
        return this.upvotes;
    }

    public String toString() {
        return "Post\n id = " + this.id + "\n text = " + this.text + "\n type = " + this.type + "\n user = " + this.user + "\n upvotes = " + this.upvotes;
    }
}
