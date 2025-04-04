package com.example.checkin.Admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*******************
 * 날짜 : 2025.04.03
 * 이름 : 김준식
 * 내용 : Login 컨트롤러
 * *****************/
@RestController
@RequestMapping("/admin")
public class LoginController {


    @PostMapping("/login")
    public ResponseEntity<HashMap<String, Object>> login(@RequestBody HashMap<String, Object> params) {
        System.out.println("login Controller 실행");
        System.out.println("전달 받은 params : " + params.get("id") + ", " + params.get("pw"));
        HashMap<String, Object> result = new HashMap<>();
        result.put("status",100);
        return ResponseEntity.ok(result);
    }

}
