package org.oleggalimov.rssreader.dto.request;

import lombok.Data;
import org.oleggalimov.rssreader.enumerations.SearchMethod;

@Data
public class RuleElement {
    SearchMethod searchMethod;
    String attrName;
    String pattern;
    String nestedAttr;
}
