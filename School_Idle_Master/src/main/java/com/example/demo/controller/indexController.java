package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    // ホームページ（トップページ）のルート
    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    // ログインページのルート
    @GetMapping("/login")
    public String login() {
        return "login";  // login.html に遷移
    }
    // ログインフォームの送信処理
//    @PostMapping("/login")
//    public String loginSubmit(@Valid LoginForm loginForm, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "login";  // エラーがあれば、再度ログインページに戻る
//        }
//
//        // ログイン処理のロジックを追加
//        // 例: ユーザー名とパスワードの照合
//
//        model.addAttribute("username", loginForm.getUsername());
//        return "home";  // ログイン成功後に表示するページ
//    }

    @GetMapping("/calculation")
    public String calculation(Model model) {
        return "calculation";
    }

    @GetMapping("/myPage")
    public String myPage(Model model) {
        return "myPage";
    }
}
