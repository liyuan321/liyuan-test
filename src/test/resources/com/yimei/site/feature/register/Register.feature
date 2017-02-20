Feature: 注册测试（易煤网）

  Scenario Outline: 注册成功测试（多个参数）
    When 输入注册信息,并且提交按钮
      | username   | password   | confirmPassword   |
      | <username> | <password> | <confirmPassword> |
    Then 注册成功
  Examples:
    | username    | password | confirmPassword |
    | 13138888999 | 123456   | 123456          |
