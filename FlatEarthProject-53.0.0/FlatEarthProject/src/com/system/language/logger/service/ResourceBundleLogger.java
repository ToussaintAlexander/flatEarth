package com.system.language.logger.service;

import java.util.Locale;
import java.util.ResourceBundle;

import com.system.language.logger.model.LoggerBean;

public class ResourceBundleLogger {

  public static void main(String[] args) {
    ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", Locale.UK);
    System.out.println("Message in " + Locale.UK + ": " + bundle.getString("greeting"));

    Locale.setDefault(new Locale("in", "ID"));
    bundle = ResourceBundle.getBundle("MessagesBundle");
    System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting"));
    
    String pack = LoggerBean.class.getPackage().getName();
    
    String meth = Thread.currentThread().getStackTrace()[1].getMethodName();
    
    String fullcls = Thread.currentThread().getStackTrace()[1].getClassName();
    
    System.out.println("Package = " + pack);
    System.out.println("Class = " + fullcls);
    System.out.println("Method = " + meth);
    
  }
}