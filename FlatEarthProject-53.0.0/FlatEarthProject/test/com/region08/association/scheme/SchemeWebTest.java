package com.region08.association.scheme;

import org.springframework.web.servlet.ModelAndView;

import com.region08.association.scheme.web.SchemeController;

import junit.framework.TestCase;

public class SchemeWebTest extends TestCase {

    public void testHandleRequestView() throws Exception{		
        SchemeController controller = new SchemeController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}
