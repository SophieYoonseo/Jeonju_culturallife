package com.example.testapi_16;

import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxImageFeedParser extends BaseImageFeedParser {
    public SaxImageFeedParser(String feedUrl){
        super(feedUrl);
    }

    public List<Image> parse() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        ImageRssHandler handler = new ImageRssHandler();

        try {
            SAXParser parser = factory.newSAXParser();
            parser.parse(this.getInputStream(), handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler.getImageList();
    }
}


