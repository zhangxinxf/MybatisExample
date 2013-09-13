package com.zx.model;

public class User {
   private Long id;
   private String userName;
   private String loginName;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getLoginName() {
      return loginName;
   }

   public void setLoginName(String loginName) {
      this.loginName = loginName;
   }

   @Override
   public String toString() {
      return "userName:" + userName + "------loginName:" + loginName;
   }
}
