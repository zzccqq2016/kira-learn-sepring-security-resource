package org.kira.learn.springsecurity.oauth2.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/8/30 23:41
 */
@RequestMapping
@RestController
public class ResourceController {

    @GetMapping("/resource")
    @PreAuthorize("hasRole('USER')")
    public String resource() {
        return "访问到了resource 资源 ";
    }
}
