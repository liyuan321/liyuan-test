Feature: 登录页面点击超链接，页面跳转测试
  Scenario: 点击【Logo】跳转测试
    When 点击【Logo】
    Then 页面跳转到【首页】

  Scenario: 点击【忘记密码?】跳转测试
    When 点击【忘记密码?】
    Then 页面跳转到【找回密码】页面

  Scenario: 点击【免费注册】跳转测试
    When 点击【免费注册】
    Then 页面跳转到【注册】页面

  Scenario: 点击【新手上路】跳转测试
    When 点击【新手上路】
    Then 页面跳转到【新手指导】页面

  Scenario: 点击【行情资讯】跳转测试
    When 点击【行情资讯】
    Then 页面跳转到【行情资讯】页面

  Scenario: 点击【增值服务】跳转测试
    When 点击【增值服务】
    Then 页面跳转到【金融】页面

  Scenario: 点击【关于我们】跳转测试
    When 点击【关于我们】
    Then 页面跳转到【关于我们】页面