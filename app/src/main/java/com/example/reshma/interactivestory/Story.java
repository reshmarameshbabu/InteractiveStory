package com.example.reshma.interactivestory;

import com.example.reshma.interactivestory.Choice;

/**
 * Created by Reshma on 19-09-2018.
 */

public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[5];

        mPages[0] = new Page(
                "com.example.reshma.interactivestory.Story 1",
                new Choice("Navigate to the story 1", 1),
                new Choice("Navigate to the story 2", 2));

        mPages[1] = new Page(
                "com.example.reshma.interactivestory.Story 2",
                new Choice("Navigate to the story 3", 3),
                new Choice("Navigate to the story 4", 4));

        mPages[2] = new Page(
                "com.example.reshma.interactivestory.Story 3",
                new Choice("Navigate to the story 4", 4),
                new Choice("Navigate to the story 6", 6));

        mPages[3] = new Page(
                "com.example.reshma.interactivestory.Story 4",
                new Choice("Navigate to the story 4", 4),
                new Choice("5", 5));

        mPages[4] = new Page(
                "com.example.reshma.interactivestory.Story 5",
                new Choice("Navigate to the story 5", 5),
                new Choice("Navigate to the story 6", 6));
    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}
