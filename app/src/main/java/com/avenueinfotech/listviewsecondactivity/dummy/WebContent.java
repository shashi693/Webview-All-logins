package com.avenueinfotech.listviewsecondactivity.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WebContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Hotmail",
                "https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1491933011&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1&id=292841&CBCXT=out&fl=wld&pcexp=false&cobrandid=90015"));
        addItem(new DummyItem("2", "Gmail",
                "https://accounts.google.com/ServiceLogin?service=mail&passive=true&continue=https://mail.google.com/mail/&ss=1&scc=1&Itmpl=ecobx&nui=5&btmpl=mobile&emr=1&osid=1#identifier"));
        addItem(new DummyItem("3", "Yahoo Mail",
                "https://login.yahoo.com/m?.intl=us&.done=https%3A%2F%2Fmg.mail.yahoo.com%3A443%2Fneo%2Fm%2Flaunch%3Fsource%3Dycpi"));
        addItem(new DummyItem("4", "Rediffmail",
                "https://mail.rediff.com/cgi-bin/login.cgi"));
        addItem(new DummyItem("5", "Facebook",
                "https://m.facebook.com/?refsrc=https%3A%2F%2Fwww.facebook.com%2F&_rdr"));
        addItem(new DummyItem("6", "Twitter",
                "https://mobile.twitter.com/login"));
        addItem(new DummyItem("7", "Amazon",
                "http://www.amazon.com"));
        addItem(new DummyItem("8", "Flipkart",
                "http://www.flipkart.com/"));
        addItem(new DummyItem("8", "Youtube",
                "https://www.youtube.com/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String website_name;
        public String website_url;

        public DummyItem(String id, String website_name,
                         String website_url)
        {
            this.id = id;
            this.website_name = website_name;
            this.website_url = website_url;
        }

        @Override
        public String toString() {
            return website_name;
        }
    }
}
