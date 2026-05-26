package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.component.Intern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternController {
    @Autowired
    Intern intern;

    @GetMapping("get-intern")
    public String getintern() {
        return intern.getitern();
    }
}
