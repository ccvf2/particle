package com.mynetgear.ccvf3.common.parser;

import java.io.InputStream;

import org.w3c.dom.Document;

public interface CommonParserServiceImp{

	Document getXMLDocument(String requestURL);
}
