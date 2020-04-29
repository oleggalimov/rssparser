package org.oleggalimov.rssreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Index {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}