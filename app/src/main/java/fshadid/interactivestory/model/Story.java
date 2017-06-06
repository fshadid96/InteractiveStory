package fshadid.interactivestory.model;

import fshadid.interactivestory.R;

/**
 * Created by farahshadid on 6/5/17.
 */

public class Story {

    private Page[] pages;

    public Story() {

        pages[0] = new Page(R.drawable.page0, R.string.page0,
                new Choice(R.string.page0_choice1), new Choice(R.string.page0_choice2));
    }
}
