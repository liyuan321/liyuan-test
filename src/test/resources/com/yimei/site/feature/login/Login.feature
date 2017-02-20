Feature: 登录测试

  Scenario Outline: 登录成功测试（2多个参数）
    Given 输入用户名、密码
      | username | password   |
      | <user>   | <password> |
    When 点击登录
    Then 登录成功

  Examples:
    | user        | password |
    | 15200000003 | 123456   |
    | 15200000003 | 123456   |

#---------------漂亮的分割线-------------------------------------------------#

#  Scenario Outline: 登录失败测试（3多个参数）
#    Given 输入用户名、密码
#      | username   | password   | message   |
#      | <username> | <password> | <message> |
#    When 点击登录
#    Then 验证提示信息
#
#  Examples:
#    | username    | password | message    |
#
#    #  用户名、密码都为空
#    |             |          | 请输入用户名!    |
#
#    #  用户名为空
#    |             | 123456   | 请输入用户名!    |
#
#    #  密码为空
#    | 15200000003 |          | 请输入密码!     |
#
#    #  用户名与密码不匹配（密码不匹配）
#    | 15200000003 | 111111   | 用户名或密码错误   |
#
#    #  用户名与密码不匹配（用户名不匹配）
#    | 15200000019 | 123456   | 用户名或密码错误   |
#
#    #  用户名不符合规则
#    | 111111      | 123456   | 请输入正确的用户名! |