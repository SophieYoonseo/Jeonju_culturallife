package com.example.testapi_16;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ImageRssHandler extends DefaultHandler {
    private List<Image> imageList;
    private Image currentImage;
    private StringBuilder builder;

    public List<Image> getImageList(){
        return this.imageList;
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        super.characters(ch, start, length);
        builder.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String name)
            throws SAXException {
        super.endElement(uri, localName, name);

        if (this.currentImage != null){
            if (localName.equalsIgnoreCase(Image.TITLE)){
                currentImage.setTitle(builder.toString());
            } else if (localName.equalsIgnoreCase(Image.LINK)){
                currentImage.setLink(builder.toString());
            } else if (localName.equalsIgnoreCase(Image.THUNMNAIL)){
                currentImage.setThumbnail(builder.toString());
            } else if (localName.equalsIgnoreCase(Image.SIZE_HEIGHT)){
                currentImage.setSizeheight(Integer.parseInt(builder.toString()));
            } else if (localName.equalsIgnoreCase(Image.SIZE_WIDTH)){
                currentImage.setSizewidth(Integer.parseInt(builder.toString()));
            } else if (localName.equalsIgnoreCase(Image.ITEM)){
                imageList.add(currentImage);
            }
        }
        builder.setLength(0);
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();

        imageList = new ArrayList<Image>();
        builder = new StringBuilder();
    }

    @Override
    public void startElement(String uri, String localName, String name,
                             Attributes attributes) throws SAXException {
        super.startElement(uri, localName, name, attributes);

        if (localName.equalsIgnoreCase(Image.ITEM)){
            this.currentImage = new Image();
        }
    }
}
