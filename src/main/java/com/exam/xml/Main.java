package com.exam.xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class Main {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		//1.创建解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
        //2.得到解析器
        SAXParser sp=factory.newSAXParser();
        //3得到解读器
        XMLReader reader=sp.getXMLReader();
        //设置内容处理器
        reader.setContentHandler(new XmlHandler());
        //读取xml的文档内容
        reader.parse("src/main/resources/Book.xml");
	}

}
