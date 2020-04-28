package org.oleggalimov.rssreader.fg;

import org.jsoup.nodes.Document;
import org.oleggalimov.rssreader.dto.RSSRecord;

import java.util.List;

public interface IDocumentParser {
    List<RSSRecord> parse (Document document);
}
