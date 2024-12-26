package com.example.demo.model;
import javax.validation.constraints.NotEmpty;

public class LoginForm {

	@NotEmpty(message = "ユーザー名を入力してください")
    private String username;

	@NotEmpty(message = "パスワードを入力してください")
    private String password;

    // ゲッター・セッター
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
