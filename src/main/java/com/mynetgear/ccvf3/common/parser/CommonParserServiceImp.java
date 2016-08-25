package com.mynetgear.ccvf3.common.parser;

import java.util.HashMap;
import java.util.Set;

import org.w3c.dom.Document;

public interface CommonParserServiceImp{

	Document getXMLDocument(String requestURL);

	HashMap<String, String> userInfoXMLParse(Document doc, String parentTag, Set<String> parseTag);
}
