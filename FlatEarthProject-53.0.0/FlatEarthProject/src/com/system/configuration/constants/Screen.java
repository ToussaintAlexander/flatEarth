package com.system.configuration.constants;

import java.util.HashMap;
import java.util.Map;

public enum Screen {
    ACTIVATE_KEY	(1, "Activate"	, "ACTIVATE KEY"	),
    NEXT_RECORD		(2, "NextR"		, "NEXT RECORD"		),
    PREVIOUS_RECORD	(3, "Previous"	, "PREVIOUS RECORD"	),
    UPDATE_RECORD	(4, "Update"	, "UPDATE RECORD"	),
    ACTION_UNDEFINED(5, "Undefined"	, "ACTION UNDEFINED"),
    DELETE_RECORD	(6, "Delete"	, "DELETE RECORD"	),
    PREVIOUS_PAGE	(7, "Previous"	, "PREVIOUS PAGE"	),
    NEXT_PAGE		(8, "NextP"		, "NEXT PAGE"		),
    HELP_SCREEN		(9, "Help"		, "HELP SCREEN"		),
    INSERT_RECORD	(10, "Insert"	, "INSERT RECORD"	),
    CREATE_REPORT	(11, "Report"	, "CREATE REPORT"	),
    EXIT_SCREEN		(12, "Exit"		, "EXIT SCREEN"		),
    
    LOGIN_BUTTON	(90, "Login"	, "LOGIN BUTTON"	),
    RESET_BUTTON	(91, "Reset"	, "RESET BUTTON"	);

    private int code;
    private String label;
    private String description;

    /**
     * A mapping between the integer code and its corresponding Status to facilitate lookup by code.
     */
    private static Map<Integer, Screen> codeToStatusMapping;

    private Screen(int code, String label, String description) {
        this.code = code;
        this.label = label;
        this.description = description;
    }

    public static Screen getStatus(int i) {
        if (codeToStatusMapping == null) {
            initMapping();
        }
        return codeToStatusMapping.get(i);
    }

    private static void initMapping() {
        codeToStatusMapping = new HashMap<Integer, Screen>();
        for (Screen s : values()) {
            codeToStatusMapping.put(s.code, s);
        }
    }
    
    public static int getButtonCode (String label) {
    	
    	int answer = 0;
    	
        for (Screen s : values()) {
        	
        	if (s.getLabel().equalsIgnoreCase(label)) {
        		answer = s.getCode();
        	}
        }
        return answer;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Status");
        sb.append("{code=").append(code);
        sb.append(", label='").append(label).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(ScreenButtonEnum.NEXT_PAGE);
//        System.out.println(ScreenButtonEnum.getStatus(4));
        
        System.out.println(Screen.getButtonCode("deleteRecord"));
    }
}